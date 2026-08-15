//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Logistics & Shipping System ===");

        Product[] warehouse = new Product[2];
        warehouse[0] = new Electronics("Laptop", 2.5, 1200.0, 24);
        warehouse[1] = new ChemicalProduct("Industrial Cleanser", 10.0, 150.0, "PERMIT-992-X");

        for (Product product : warehouse) {
            System.out.println("----------------------------------------");
            product.printDetails();
            System.out.println("Shipping Cost: $" + product.calculateShippingCost());


            if (product instanceof WarrantyEligible) {
                WarrantyEligible warrantiedItem = (WarrantyEligible) product;
                warrantiedItem.applyWarrantyClaim();
            }

            if (product instanceof HazardousMaterial) {
                HazardousMaterial dangerItem = (HazardousMaterial) product;
                System.out.println("⚠️ ALERT: Hazardous Material! Permit Required: " + dangerItem.getSafetyPermitNumber());
            }
        }
    }
}
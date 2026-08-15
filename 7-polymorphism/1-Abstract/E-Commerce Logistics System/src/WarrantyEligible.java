public interface WarrantyEligible {

    int getWarrantyMonths();
    void applyWarrantyClaim();

}
interface HazardousMaterial {
    double getHazardSafetyFee();
    String getSafetyPermitNumber();
}

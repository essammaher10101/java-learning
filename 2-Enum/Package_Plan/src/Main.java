import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Displaying all available plans using values()
        System.out.println("--- Available Internet Packages ---");
        for (PackagePlan plan : PackagePlan.values()) {
            System.out.println("Plan: " + plan +
                    " | Price: $" + plan.getPrice() +
                    " | Quota: " + plan.getQuota() + " GB");
        }

        System.out.println("-----------------------------------");

        // 2. Testing a specific plan
        System.out.print("Enter plan name (e.g., Ultra, Basic, Premium): ");
        String userInput = input.next();
        displayPlanRecommendation(PackagePlan.userinput);

        // 3. Testing the Tax method for a specific plan
        try {
            PackagePlan myPlan = PackagePlan.valueOf(userInput);

            displayPlanRecommendation(myPlan);

            double tax = myPlan.Tax(myPlan.getPrice());
            System.out.println("Tax for " + myPlan + " is: " + tax);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: The plan '" + userInput + "' does not exist. Please check the spelling.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Prints specific details and a recommendation based on the plan type.
     */
    public static void displayPlanRecommendation(PackagePlan plan) {
        System.out.println("Selected Plan: " + plan.name());

        if (plan.getPrice() >= 500) {
            System.out.println("Recommendation: High-speed business usage.");
        } else if (plan.getPrice() >= 200) {
            System.out.println("Recommendation: Ideal for family streaming.");
        } else {
            System.out.println("Recommendation: Personal light usage.");
        }
    }
}
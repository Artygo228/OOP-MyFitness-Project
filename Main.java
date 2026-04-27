public class Main {

    public static void main(String[] args) {
        
        System.out.println("=== MYFITNESS GYM SYSTEM TEST ===\n");

        System.out.println("--- Testing Memberships ---");
        PayAsYouGoMembership payAsYouGo = new PayAsYouGoMembership(101, 0.0, true, "2023-10-01", "2023-11-01", 4.95, 30);
        
        payAsYouGo.displayDetails();
        System.out.println("Cost per visit is: £" + payAsYouGo.getCostPerVisit());

        System.out.println("\n--- Testing Bootcamp Class & Discounts ---");
        BootcampClass bootcamp = new BootcampClass(1, "Full Body Fat Burn", 35.50, 30);
        
        System.out.println("Base price for " + bootcamp.getClassName() + " is £" + bootcamp.getMonthlyFee());
        
        double priceNoDiscount = bootcamp.calculateFee(1);
        System.out.println("Price if enrolled in 1 class: £" + priceNoDiscount);
        
        double priceWithDiscount = bootcamp.calculateFee(2);
        System.out.println("Price if enrolled in 2+ classes (7% off): £" + priceWithDiscount);
        
        System.out.println("\n=== TEST COMPLETED ===");
    }
}
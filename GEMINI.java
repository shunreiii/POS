import java.util.Scanner;

public class CoffeePOSWithoutArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double espressoPrice = 2.50;
        double lattePrice = 3.00;
        double cappuccinoPrice = 3.50;
        double americanoPrice = 2.00;

        double totalCost = 0.0;
        String choice;

        int espressoCount = 0;
        int latteCount = 0;
        int cappuccinoCount = 0;
        int americanoCount = 0;

        while (true) {
            // ... (same as before)

            switch (choice) {
                case "1":
                    totalCost += espressoPrice;
                    espressoCount++;
                    break;
                case "2":
                    totalCost += lattePrice;
                    latteCount++;
                    break;
                case "3":
                    totalCost += cappuccinoPrice;
                    cappuccinoCount++;
                    break;
                case "4":
                    totalCost += americanoPrice;
                    americanoCount++;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("\n** Receipt **");
        System.out.println("Items Purchased:");
        if (espressoCount > 0) {
            System.out.println("- Espresso: " + espressoCount);
        }
        if (latteCount > 0) {
            System.out.println("- Latte: " + latteCount);
        }
        if (cappuccinoCount > 0) {
            System.out.println("- Cappuccino: " + cappuccinoCount);
        }
        if (americanoCount > 0) {
            System.out.println("- Americano: " + americanoCount);
        }
        System.out.println("Total Cost: ₱" + totalCost);

        // ... (rest of the code remains the same)
    }
}

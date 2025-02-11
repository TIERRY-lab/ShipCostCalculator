import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double price = 0;


        System.out.print("Enter the price of the item: $");
        if (scanner.hasNextDouble()) {
            price = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }

        double shippingCost;
        if (price >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = 0.02 * price;
        }

        double totalCost = price + shippingCost;

        System.out.printf("Shipping Cost: $%.2f\n", shippingCost);
        System.out.printf("Total Price: $%.2f\n", totalCost);

    }
}


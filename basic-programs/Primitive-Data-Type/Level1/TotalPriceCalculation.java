import java.util.Scanner;
public class TotalPriceCalculation {
    public static void main(String[] args) {
        double unitPrice, totalPrice;
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();
        totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}

import java.util.Scanner;

public class FeeCalculation {
    public static void main(String[] args) {

        double fee, discountPercent, discount, finalFee;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        discount = (fee * discountPercent) / 100;

        finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + finalFee);
    }
}

import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int number1, number2;
        int quotient, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        quotient = number1 / number2;
        remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}

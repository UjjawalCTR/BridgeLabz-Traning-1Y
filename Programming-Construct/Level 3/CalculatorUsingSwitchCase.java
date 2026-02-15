import java.util.Scanner;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        double num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        double num2 = sc.nextInt();

        System.out.print("Enter Operator(+,-,*,/): ");
        String op = sc.next();

        switch(op) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1-num2));
                break;
            case "*":
                System.out.println("Result: " + (num1*num2));
                break;
            case  "/":
                if(num2!=0) {
                    System.out.println("Result: " + (num1 / num2));
                }
                else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class AddTwoNum {
    public static void main(String[] args){
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of first number and second number is: " + sum);
        input.close();
    }
}

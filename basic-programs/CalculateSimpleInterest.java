import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Principle: ");
         double p = sc.nextInt();
         System.out.println("Enter Interest Rate: ");
         double r = sc.nextInt();
         System.out.println("Enter Time: ");
         double t = sc.nextInt();
         double Interest = (p * r * t) / 100;
         System.out.println("Simple Interest Rate is : "+Interest);
         sc.close();
    }
}
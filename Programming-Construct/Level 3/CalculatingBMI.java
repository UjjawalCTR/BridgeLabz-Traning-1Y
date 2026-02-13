package comgla;
import java.util.Scanner;
public class CalculatingBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the person's weight (In KG): ");
        double weight = sc.nextFloat();
        System.out.print("Enter the person's height(In CM): ");
        double height = sc.nextFloat();
        double bmi = weight / ((height*0.01) * (height*0.01));
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        }
        else if (bmi <= 24.9) {
            System.out.println("Normal");
        }
        else if (bmi <= 39.9) {
            System.out.println("Overweight");
        }
        else if (bmi <= 40.0) {
            System.out.println("Obese");
        }
        sc.close();
    }
}

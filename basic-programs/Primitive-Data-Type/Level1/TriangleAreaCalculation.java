import java.util.Scanner;
public class TriangleAreaCalculation {
    public static void main(String[] args) {
        double base, height;
        double areaInches, areaCm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle (in inches): ");
        base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        height = input.nextDouble();
        areaInches = 0.5 * base * height;
        areaCm = areaInches * 2.54 * 2.54;
        System.out.println("The area of the triangle in square inches is " + areaInches + " and in square centimeters is " + areaCm);
    }
}

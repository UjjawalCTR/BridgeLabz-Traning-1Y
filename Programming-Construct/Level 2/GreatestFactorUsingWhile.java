package comgla;
import java.util.Scanner;
public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
              int counter = number - 1;
            int greatestFactor = 1;
            while(counter>0) {

                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            System.out.println("Greatest factor of " + number + " (besides itself) is: "
                    + greatestFactor);
        }

        input.close();
    }
}

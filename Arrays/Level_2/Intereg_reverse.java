import java.util.Scanner;
public class Intereg_reverse {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int count = 0;

        // Count the number of digits
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        int[] digits = new int[count];
        tempNumber = number;

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close();
    
}

}

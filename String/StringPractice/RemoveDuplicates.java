package AssignmentExtra;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }
}
package AssignmentExtra;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        sc.close();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j] = 0;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }

        System.out.println("The strings are anagrams.");
    }
}
package AssignmentExtra;
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();
        sc.close();

        String result = "";
        int i = 0;
        while (i < sentence.length()) {
            boolean match = true;
            if (i + oldWord.length() <= sentence.length()) {
                for (int j = 0; j < oldWord.length(); j++) {
                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            if (match) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        System.out.println("Modified Sentence: " + result);
    }
}
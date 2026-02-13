package comgla;
import java.util.Scanner;
public class PercentageGradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics Marks: ");
        int P = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        int C = sc.nextInt();
        System.out.print("Enter Maths Marks: ");
        int M = sc.nextInt();
        int average = (P + C + M) / 3;
        System.out.println("Average Marks: " + average);
        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remark: above agency-normalised standard");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remark: at agency-normalised standard");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remark: below, but approchaing agency-normalised standard");
        }
        else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remark: well below agency-normalised standard");
        }
        else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remark: too below agency-normalised standard");
        }
        else if (average <= 39) {
            System.out.println("Grade: R");
            System.out.println("Remark: (Remedial Standard)");
        }
        sc.close();
    }
}

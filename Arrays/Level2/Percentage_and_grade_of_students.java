import java.util.Scanner;

public class Percentage_and_grade_of_students {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

      
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            System.out.print("Physics marks: ");
            int physics = scanner.nextInt();
            if (physics < 0 || physics > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            physicsMarks[i] = physics;

            System.out.print("Chemistry marks: ");
            int chemistry = scanner.nextInt();
            if (chemistry < 0 || chemistry > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            chemistryMarks[i] = chemistry;

            System.out.print("Maths marks: ");
            int maths = scanner.nextInt();
            if (maths < 0 || maths > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            mathsMarks[i] = maths;
        }

        for (int i = 0; i < numStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  Physics Marks: " + physicsMarks[i]);
            System.out.println("  Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("  Maths Marks: " + mathsMarks[i]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
        }

    }
}

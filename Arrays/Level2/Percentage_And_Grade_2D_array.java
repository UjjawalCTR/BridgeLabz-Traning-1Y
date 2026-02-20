import java.util.Scanner;

public class Percentage_And_Grade_2D_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];

        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

       
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {

                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else subject = "Maths";

                System.out.print(subject + " marks: ");
                int input = scanner.nextInt();

                if (input < 0 || input > 100) {
                    System.out.println("Invalid marks. Please enter between 0 and 100.");
                    j--;  
                    continue;
                }

                marks[i][j] = input;
            }
        }

        
        for (int i = 0; i < numStudents; i++) {

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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

       
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  Physics Marks: " + marks[i][0]);
            System.out.println("  Chemistry Marks: " + marks[i][1]);
            System.out.println("  Maths Marks: " + marks[i][2]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
        }

       
    }
}

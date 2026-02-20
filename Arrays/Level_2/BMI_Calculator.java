import java.util.Scanner;
public class BMI_Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Height (m): ");
            heights[i] = scanner.nextDouble();
        }

        calculateBMIAndStatus(weights, heights, bmis, statuses);
        displayResults(weights, heights, bmis, statuses);

        scanner.close();
    }

    public static void calculateBMIAndStatus(double[] weights, double[] heights, double[] bmis, String[] statuses) {
        for (int i = 0; i < weights.length; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
    }

    public static void displayResults(double[] weights, double[] heights, double[] bmis, String[] statuses) {
        System.out.println("\nBMI Results:");
        for (int i = 0; i < weights.length; i++) {
            System.out.printf("Person %d: Weight=%.2f kg, Height=%.2f m, BMI=%.2f, Status=%s%n",
                    i + 1, weights[i], heights[i], bmis[i], statuses[i]);
        }
    }
}



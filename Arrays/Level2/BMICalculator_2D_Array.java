import java.util.Scanner;

public class BMICalculator_2D_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

      
        double[][] personData = new double[number][3]; 
      

        String[] weightStatus = new String[number];

       
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

           
            personData[i][2] = personData[i][0] / 
                               (personData[i][1] * personData[i][1]);

           
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

       
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

   
    }
}

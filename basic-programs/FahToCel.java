import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args){
        System.out.println("Enter Reading in Celsius: ");
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        int Fahrenheit = (C * 9/5) + 32;
        System.out.println("After converting into Fahrenheit reading is: " + Fahrenheit);
        input.close();
    }
}

import java.util.Scanner;
public class KmToMilesInputAsUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double km,miles;
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        miles = km / 1.6;

        System.out.println("Distance in miles is " + miles);
    }
}

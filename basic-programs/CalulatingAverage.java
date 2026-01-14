import java.util.Scanner;
public class CalulatingAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number 1: ");
        double num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        double num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        double num3 = sc.nextInt();
        double average = (num1+num2+num3)/3;
        System.out.println("The Average Is: "+average);
        sc.close();
    }

}

package comgla;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Yes first number is largest");
        }
        else{
            System.out.println("No first number is not largest");
        }
        if(b>a && b>c){
            System.out.println("Yes second number is largest");
        }
        else{
            System.out.println("No second number is not largest");
        }
        if(c>a && c>b){
            System.out.println("Yes Third number is largest");
        }
        else{
            System.out.println("No Third number is not largest");
        }
        sc.close();
    }
}

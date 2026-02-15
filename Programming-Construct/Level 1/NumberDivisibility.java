package comgla;
import java.util.Scanner;
public class NumberDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        double divisibility = num%5;
        if(divisibility==0){
            System.out.println("The number "+num+" is divisible by 5!");
        }
        else{
            System.out.println("The number "+num+" is not divisible by 5!");
        }
    }
}

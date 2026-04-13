package Assignment;
import java.util.Scanner;
public class FriendlyNumber {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        for(int i = 1; i < num1; i++){
            int div =  num1/i;
            if(num1%i==0){
                sum = sum + i;
            }
        }
        for(int i = 1; i < num2; i++){
            int div1 =  num2/i;
             if(num2%i==0){
                 sum1 = sum1 + i;
             }
        }
        int check1 = sum/num1;
        int check2 = sum1/num2;
        if(check1 == check2){
            System.out.println("Yes, They are friendly pair");
        }
        else{
            System.out.println("No, They are not friendly pair");
        }
    }
}

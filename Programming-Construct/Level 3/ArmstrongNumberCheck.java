package comgla;
import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0,d;
        int temp = n;
        while(temp!=0){
            d = temp%10;
            int k  = d*d*d;
            sum = sum + k;
            temp = temp/10;
        }
         if(sum==n){
             System.out.println("The number "+n+" is an Armstrong number");
         }
         else{
             System.out.println("The number "+n+" is not an Armstrong number");
        }
         sc.close();
   }
}
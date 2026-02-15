package comgla;
import java.util.Scanner;
public class SumOfNaturalNumUsingWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("The number "+n+" is not natural number");
        }
        else{
            int sum = 0;
            int temp=n;
            while(temp>0){
                sum = sum + temp;
                temp--;
            }
            int formula;
            formula= n * (n+1) / 2;
            System.out.println("The sum using while loop is "+sum);
            System.out.println("The sum using formula is "+formula);
            if(sum==formula){
                System.out.println("Result is correct. Both values match.");
            }
            else{
                System.out.println("Result is incorrect. Values do not match.");
            }
        }
        sc.close();
    }
}

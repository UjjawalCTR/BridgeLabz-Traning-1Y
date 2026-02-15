package comgla;
import java.util.Scanner;
public class SumOfNumberUsingWhileBreak {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number (0 to stop): ");
            int num = sc.nextInt();
            if(num<=0) break;
            sum = sum + num;
        }
        System.out.println("The sum is " + sum);
    }
}

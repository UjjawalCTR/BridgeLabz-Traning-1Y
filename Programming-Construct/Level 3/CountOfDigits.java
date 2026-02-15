package comgla;
import java.util.Scanner;
public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int count = 0,d;
        while(n!=0){
            d=n%10;
            count++;
            n=n/10;
        }
        System.out.println("The number has "+count+" digits");
        sc.close();
    }
}

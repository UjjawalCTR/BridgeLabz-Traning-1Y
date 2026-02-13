package comgla;
import java.util.Scanner;
public class CountDownUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Countdown Value: ");
        int n = sc.nextInt();
        while(n>0){
            System.out.println(n);
            n--;
        }
        sc.close();
        System.out.print("\uD83D\uDE80 Launch");
    }
}

package comgla;
import java.util.Scanner;
public class CountDownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Countdown Value: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        System.out.print("\uD83D\uDE80 Launch");
        sc.close();
    }
}
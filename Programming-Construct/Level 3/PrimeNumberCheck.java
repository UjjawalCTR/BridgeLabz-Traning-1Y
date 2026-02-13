package comgla;
import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        boolean isPrime = true;
        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(N + " is a prime number");
        } else {
            System.out.println(N + " is not a prime number");
        }
    }
}

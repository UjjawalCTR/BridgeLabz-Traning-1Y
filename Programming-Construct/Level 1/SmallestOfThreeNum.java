package comgla;
import java.util.Scanner;
public class SmallestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("Yes First Number Is Smallest");
        } else {
            System.out.println("No First Number Is Not Smallest");
        }
    }
}

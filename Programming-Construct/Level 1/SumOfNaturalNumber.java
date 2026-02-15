package comgla;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n>0){
            int sum = n*(n+1)/2;
            System.out.println("The sum of "+n+" natural number is: "+sum);
        }
        else{
            System.out.println("the number "+n+" is not natural number");
        }
        sc.close();
    }
}

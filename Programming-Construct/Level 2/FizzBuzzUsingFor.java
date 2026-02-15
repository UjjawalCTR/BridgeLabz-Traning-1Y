package comgla;
import java.util.Scanner;
public class FizzBuzzUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Please enter positive number");
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    System.out.println(i+" FizzBuzz");
                }
                else if(i%5==0){
                    System.out.println(i+" Buzz");
                }
                else if(i%3==0){
                    System.out.println(i+" Fizz");
                }
                else{
                    System.out.println(i+" ");
                }
            }
        }
        sc.close();
    }
}

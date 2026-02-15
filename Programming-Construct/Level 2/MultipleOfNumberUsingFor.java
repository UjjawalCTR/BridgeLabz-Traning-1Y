package comgla;
import java.util.Scanner;
public class MultipleOfNumberUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int number = input.nextInt();
        if(number<=1 || number>=100){
            System.out.println("Invalid input! please enter a number between 1 and 100");
        }
        else{
            System.out.println("Multiples of " + number + " below 100 are:");
            for(int i=100; i>=1; i--){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}

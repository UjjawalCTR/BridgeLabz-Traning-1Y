package comgla;
import java.util.Scanner;
public class MultipleOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int number = input.nextInt();
        if(number<=1 || number>=100){
            System.out.println("Invalid input! please enter a number between 1 and 100");
        }
        else{
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = number-1;
            while(counter>1){
                if(number%counter==0){
                    System.out.println(counter);
                }
                counter--;
            }
        }
        input.close();
    }
}
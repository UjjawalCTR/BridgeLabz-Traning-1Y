package comgla;
import java.util.Scanner;
public class FactorialFromWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num<1){
            System.out.println("Please enter positive integer");
        }
        else {
            int product = 1;
            int temp=num;
            while(temp!=0){
                product*=temp;
                temp--;
            }
            System.out.println("The factorial of "+num+" is "+product);
        }
            input.close();
}
}
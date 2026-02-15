package comgla;
import java.util.Scanner;
public class PrintEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Invalid number! Please Enter A Natural Number");
        }
        else{
            for(int i=1;i<=num;i++){
                if(i%2==0){
                    System.out.println(i+" is Even");
                }
                else{
                    System.out.println(i+" is Odd");
                }
            }
        }
        sc.close();
    }
}

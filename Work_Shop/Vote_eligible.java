import java.util.Scanner;
public class Vote_eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your age  :");
        int age=sc.nextInt();
        if (age>=18){
            System.err.print("Yes, you are eligible for voting. ");
            
        }
         else   {
            System.err.print("Sorry, you are eligible for voting.");
         }
    }
}

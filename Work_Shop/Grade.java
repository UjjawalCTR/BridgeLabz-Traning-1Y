import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your marks  :");
        int Marks =sc.nextInt();
        if (Marks>=90){
            System.err.print("Your grade is  ==>  A ");
            
        }
         else if (Marks>=70 && Marks>90){
            System.err.print("Your grade is  ==> B ");
            
        }
         else if(Marks>=60 && Marks>70)   {
            System.err.print("Your Grade is ==>  c");
         }
         else {
             System.err.println("You are fail.");
            System.err.println("Sorry,Better luck next time.");
         }
    }
}

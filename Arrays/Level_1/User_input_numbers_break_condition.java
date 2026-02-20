import java.util.Scanner;

public class User_input_numbers_break_condition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        double numbers[]=new double[10];
        double value =0.0;
         int index=0;
        while (true) {
            System.err.print("Enter number :");
            value=sc.nextDouble();
            if(value<=0){
                break;
            }
            if(index==10){
                System.out.print("Max limit reached  10 ");
                break;
            }
        numbers[index]=value;
        index++;
        }double sum=0;
        for(int i=0;i<numbers.length;i++){
     sum=sum+numbers[i];
        }
        System.out.println("Sum of all numbers is   "+sum);
    }

}

import java.util.Scanner;

public class Fizz_buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a number :");
        int num=sc.nextInt();
        String arr[]=new String[num+1];
         if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
        for(int i=0;i<=num;i++){
            if(i!=0 && i%5==0 && i%3==0){
                arr[i]="Fizzbuzz";
            }
            else if(i!=0 && i%5==0){
                arr[i]="Buzz";
            }
            else if (i!=0 && i%3==0) {
                arr[i]="Fizz";
            }
            else {
                arr[i]=String.valueOf(i);
            }
        }
        for(int i=1;i<=num;i++){
                    System.out.println(arr[i]);  

        }
    }}
}

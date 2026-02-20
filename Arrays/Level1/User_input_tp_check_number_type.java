import java.util.Scanner;

public class User_input_tp_check_number_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 numbers to check multiple condition ");
int[] numbers=new int[5];
int i;
for ( i=0;i<numbers.length;i++){      //user input numbers.
    numbers[i]=sc.nextInt();
}
for(i=0;i<numbers.length;i++){     // for checking positive ,negative and zero.
int num=numbers[i];                
if(num<0 )  System.err.println(num+"    Number is negative.");
else if (num>0) {
    if (num%2==0)  System.err.println(num+"    Number is positive and even. ");
    else System.err.println(num+"    Number is positive and odd. ");
}
else System.out.println(num+"    Number is zero.");
}
if(numbers[0]==numbers[numbers.length-1]) System.out.println("First element and last element of the array is equal.");
else System.out.println("First element and last element of the array is not equal.");
    }
}

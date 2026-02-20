import java.util.Scanner;

public class Table_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int table[]=new int[10];
        int x=1;
        for(int i=0;i<=10;i++){
            table[i]=x*num;
            System.out.println( num+" * "+x+" = "+table[i]);
            x++;
        }
    }
}

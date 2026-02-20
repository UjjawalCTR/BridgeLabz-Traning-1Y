
import java.util.Scanner;
public class Table_6to9 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int table[]=new int[10];
        int x=6;
        for(int i=6;i<=9;i++){
            table[i]=x*num;
            System.out.println( num+" * "+x+" = "+table[i]);
            if(x==9) break;
            x++;
        }
    }
}

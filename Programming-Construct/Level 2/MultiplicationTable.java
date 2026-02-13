package comgla;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 6 to 9: ");
        int n = sc.nextInt();
        if(6>n || n>9){
            System.out.println("Invalid Input! Please, Enter number between 6 to 9: ");
        }
        else{
            for(int i=1;i<=10;i++){
                int table = n*i;
                System.out.println(n+" * "+i+" = "+table);
            }
        }
        sc.close();
    }
}

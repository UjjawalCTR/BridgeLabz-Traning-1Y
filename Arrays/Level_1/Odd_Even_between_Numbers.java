import java.util.Scanner;
public class Odd_Even_between_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number : ");
        int num=sc.nextInt();
        
        if(num<=0){
            System.out.println("Error .Enter a natural number.");
            return;
        }
        int odd[]=new int[num/2+1];
        int even[]=new int[num/2+1];
        int odd_index=0;
        int even_index=0;
        for(int i=0;i<=num;i++){
          if (i%2==0){
            even[even_index]=i;
            even_index++;
          }
          else{
            odd[odd_index]=i;
            odd_index++;
          }
        }System.err.print("Even numbers  ");
        for(int i=1;i<even_index;i++){
            System.err.print(even[i]+" ");
        }
        System.err.println(" ");
        System.out.print("Odd  numbers  ");
        
         for(int i=1;i<odd_index;i++){
            System.err.print(odd[i]+" ");
        }
    }

}

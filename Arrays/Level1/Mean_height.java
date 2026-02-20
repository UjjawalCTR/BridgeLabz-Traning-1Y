import java.util.Scanner;
 public class Mean_height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of 11 football player's   ");
        double arr[]=new double[11];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double result=sum/11;
        System.out.println(" Mean height of the football team:   "+result);
    }
}

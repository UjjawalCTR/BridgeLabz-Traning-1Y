import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum Of The Array Is: "+sum);
    }
}

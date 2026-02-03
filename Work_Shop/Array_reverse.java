import java.util.Scanner;
public class Array_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array  : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int i;
        for (i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int j=(size-1),temp;
        i=0;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        
        System.out.println("New array is ");
        for(i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}

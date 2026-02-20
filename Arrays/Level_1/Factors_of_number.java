import java.util.Scanner;
public class Factors_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int max_Factor=10;
        int factors[]=new int[max_Factor];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(index==max_Factor){
                    max_Factor=max_Factor*2;
                    int temp[]=new int[max_Factor];
                    for(int j=0;j<factors.length;j++){
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
            }
            factors[index]=i;
            index++;
        }
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

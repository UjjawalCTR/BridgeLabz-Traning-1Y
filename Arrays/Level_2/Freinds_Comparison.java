import java.util.Scanner;
public class Freinds_Comparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String names[]={"Akbar","Anthony","Amar"};
      int age[]=new int[3];
    double height[]=new double[3];
    for(int i=0;i<3;i++){
        System.out.println("Enter details of "+names[i]);
        System.err.print("Enter age :");
        age[i]=sc.nextInt();
        System.out.print("Enter height :");
        height[i]=sc.nextDouble();
    }
     int youngestIndex = 0;
        int tallestIndex = 0;
        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
    }
}

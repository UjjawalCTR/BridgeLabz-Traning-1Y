import java.util.Scanner;
public class Array_vote_input_age {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter age of 10 students :");
    int [] ages=new int[10];
    for(int i=0;i<ages.length;i++){
        ages[i]=sc.nextInt();
    }
    for(int i=0;i<ages.length;i++){
        if (ages[i]>=18){
            System.out.println("The student with the age " + ages[i] + " can vote.");
        }
        else{
        System.out.println("The student with the age " + ages[i] + " cannot vote.");

        }
    }
}
    
}
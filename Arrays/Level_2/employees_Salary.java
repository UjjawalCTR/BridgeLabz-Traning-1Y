import java.util.Scanner;

public class employees_Salary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=10;
        double salary[]=new double[10];
        double year[]=new double[10];
        double bonus[]=new double[10];
        double new_salary[]=new double[10];
        double totalBonus=0;
        double total_newSalary=0;
        double total_oldSalary=0;
        for(int i=0;i<num;i++){
         System.out.print("Enter salary of employee "+(i+1)+" :");
         salary[i]=sc.nextDouble();
         System.out.print("Enter year :");
         year[i]=sc.nextDouble();
         if(salary[i]<=0 || year[i]<0){
            System.out.println("Enter a valid year or salary  of employee ");
            i--;
         }

        }
        for(int i=0;i<num;i++){
            if(year[i]>5){
                bonus[i]=salary[i]*0.05;
            }
            else  {
                bonus[i]=salary[i]*0.02;
            }
        new_salary[i]=bonus[i]+salary[i];
        totalBonus=totalBonus+bonus[i];
        total_newSalary=total_newSalary+new_salary[i];
        total_oldSalary=total_oldSalary+salary[i];
        }
        System.out.println("Total  bonus  :     "+totalBonus);
        System.out.println("Total old salary :  "+total_oldSalary);
        System.out.println("Total new salary :  "+total_newSalary);
    }
}
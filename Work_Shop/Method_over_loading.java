public class Method_over_loading {
    public static  int add(int num1, int num2) {
        int sum = num1 + num2; 
        return sum;
    }
    public static  double add(double num1, double num2,double num3) {
        double sum = num1 + num2+num3; 
        return sum;
    }
    public static void main(String[] args) {
       int  result=add(20,30);  
    System.out.println(result);    
    double sum=add(5, 50, 5);
    System.out.println(sum); 
    }


}

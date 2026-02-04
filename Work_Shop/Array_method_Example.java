import java.util.Arrays;
public class Array_method_Example {

    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        System.out.println("Original array is ");
        System.out.println(arr);
        System.out.println((Arrays.toString(arr)));
    Arrays.sort(arr);
    System.err.println(Arrays.toString(arr));
    int index=Arrays.binarySearch(arr, 85);
    System.out.println(index);
    int[] arr2={10,20,30,40};
    boolean isEqual=Arrays.equals(arr, arr2);
    System.err.println("Both array are equal :  "+isEqual);
int []arr3=new int [5];
Arrays.fill(arr3,7);
System.out.println("Filled Array : ");
System.out.println(Arrays.toString(arr3));    
}
}
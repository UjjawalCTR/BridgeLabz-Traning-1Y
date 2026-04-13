package Assignment;
public class RotationOfElements {
    public static void main (String[] args){
        int k = 3 ;
        int[] arr = {10,20,30,40,50,60,70};
        int[] sample = new int[arr.length];
        int j = 0;
        for ( int i = k ; i< arr.length ; i++ , j++){
            sample[j] = arr[i];
        }
        for ( int i = 0 ; i < k ; i++ , j++){
            sample[j] = arr[i];
        }
        for ( int i : sample){
            System.out.print(i+" ");
        }
    }
}
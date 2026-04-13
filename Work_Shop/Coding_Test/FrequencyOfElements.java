package Assignment;
import java.util.*;
public class FrequencyOfElements {
    public static void main (String[] args){
        int[] arr = {1,2,3,11,1,1,2,5,2,5,2};
        for (int i = 0; i < arr.length; i++){
            boolean alreadyVisited = false;
            for (int k = 0; k < i; k++){
                if (arr[i] == arr[k]){
                    alreadyVisited = true;
                    break;
                }
            }
            if (alreadyVisited) continue;
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("The element " + arr[i] + " appears " + count + " times");
        }
    }
}
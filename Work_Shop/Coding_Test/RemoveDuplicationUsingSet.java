package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicationUsingSet {
    public static void main(String[] args) {


        List<String> listWithDuplicates = new ArrayList<>(
                Arrays.asList("Java", "Python", "Java", "C++", "Programming"));

        System.out.println("Original List: " + listWithDuplicates);


        LinkedHashSet<String> set = new LinkedHashSet<>(listWithDuplicates);


        List<String> listWithoutDuplicates = new ArrayList<>(set);


        System.out.println("Cleaned List:  " + listWithoutDuplicates);
    }
}
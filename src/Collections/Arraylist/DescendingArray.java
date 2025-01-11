package Collections.Arraylist;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {
    public static void main(String[] args) {
        Integer[] myArray ={4,45,22,5,77,65,98,2,56};

        System.out.println("Original Array" + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("sorted Array"+Arrays.toString(myArray));

    }
}

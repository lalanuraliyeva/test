package Collections.Arraylist;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int [] myArray= {1,4,66,34,98,23,4,33,54};

        System.out.println("original Array" + Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.print("sorted Array"+ Arrays.toString(myArray));
    }
}

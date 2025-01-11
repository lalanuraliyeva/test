package Collections.Arraylist;

import java.util.Enumeration;

public class SumofValues {
    public static void main(String[] args) {
        int [] myArray={1,2,3,4,5,6,7,8,9,10};
        int sum =0;

        for(int number: myArray) {
            sum += number;
        }
        System.out.println("the sum of the array values is: " + sum);
    }
}

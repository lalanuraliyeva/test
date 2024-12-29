package ifElse;

public class A6 {
    public static void main(String[] args) {

        //Write a Java program that reads a floating-point
        // number and prints "zero" if the number is zero.
        //Otherwise, print "positive" or "negative".
        //Add "small" if the absolute value of the number is
        //less than 1, or "large" if it exceeds 1,000,000.

        //Math.Divide.Test Data
        //Input a number: 25
        //Expected Output :
        //Input value: 25
        //Positive number

        int number =9999999;

        if(number == 0 ) {
            System.out.println("zero");
        } else if (number>0) {
            System.out.println("positive");
            if (number>1000000) {
                System.out.println("large");
            }
        } else if(number<0){
            System.out.println("negative");
        } else if (number<1) {
            System.out.println("small");
        }


    }

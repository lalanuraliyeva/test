package Math;

import java.util.Scanner;

public class MathSqrt {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input a number: ");
        double x= scanner.nextInt();

        System.out.println("square root is: " + sqrtNumber(x));
    }

    public static double sqrtNumber(double x) {
        return  Math.sqrt(x);


    }
}

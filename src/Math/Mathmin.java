package Math;

import java.util.Scanner;

public class Mathmin {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("the min number is : " + minMath(a,b));

    }
    public static int minMath(int a, int b) {
        return Math.min(a,b);


    }

}

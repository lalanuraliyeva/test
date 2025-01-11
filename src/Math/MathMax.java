package Math;

import java.util.Scanner;

public class MathMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("the max number is: " + maxNumber(a,b));
    }
    public static int maxNumber(int a, int b) {
        return Math.max(a,b);

    }

}

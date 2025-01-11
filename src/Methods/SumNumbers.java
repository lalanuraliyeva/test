package Methods;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a: ");
        int a =scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("sum of numbers:" + sumNumbers(a, b));

    }
    public  static int sumNumbers(int a, int b) {
        return  a+b;

    }

}

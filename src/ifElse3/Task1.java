package ifElse3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("number is positive ");
        } else if (num < 0) {
            System.out.println("number is negative ");
        } else {
            System.out.println("the number is zero.");
        }
    }
}

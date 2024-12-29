package ifElse;

import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a negative number: ");
        int number = scanner.nextInt();

        do {
            if (number > 0) {
                System.out.println("Please enter a negative number: ");
                number = scanner.nextInt();
            }
        } while (number > 0);
        System.out.println("thanks");
    }
}

package ifElse;

import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input username:");
        String name = input.nextLine();
        System.out.println("input password: ");
        int password = input.nextInt();


        do {
            if (password != 1234) {
                System.out.println("Password is false, please enter correct password:");
                password = input.nextInt();
            }

        } while (password != 1234);
        System.out.println("Password is true");
    }
}

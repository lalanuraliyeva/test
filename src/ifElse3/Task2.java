package ifElse3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num % 5 == 0 && num % 11 ==0) {
            System.out.println(true);


        } else {
            System.out.println(false);
        }
    }
}

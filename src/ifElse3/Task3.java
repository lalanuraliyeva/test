package ifElse3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  a number: ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd ");
        }
    }
}

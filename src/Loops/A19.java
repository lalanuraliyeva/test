package Loops;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows ");

        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();

        }
    }
}
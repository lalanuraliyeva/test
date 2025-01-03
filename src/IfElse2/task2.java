package IfElse2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number: ");
        int number = scanner.nextInt();

        if (number >0) {
            System.out.println("number is positive");
        } else {
            System.out.println("error");
        }
    }
}

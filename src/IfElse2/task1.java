package IfElse2;

import java.util.Scanner;

public class task1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");
        int number = scanner.nextInt();
        if (number <12){
            number += 10;

            System.out.println("Number " +number);
        } else {
            System.out.println("please enter a number less than 12");
        }

    }
}

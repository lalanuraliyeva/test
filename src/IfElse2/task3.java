package IfElse2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a character");
        String  charcter = scanner.nextLine();

        if (charcter.length()>5) {
            System.out.println("false: character is " + charcter.length() + " letters long");
        } else {
            System.out.println("danke");
        }


        //.length()
    }
}

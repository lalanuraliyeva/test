package Loops;

import java.util.Scanner;

import static java.lang.System.in;

public class Powerandbase {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.println("Enter a base number");
        int base = input.nextInt();
        System.out.println("Enter a power number");
        int power = input.nextInt();
        int result = 1;

        for(int i =1; i<=power; i++) {
             result *= base;
        }
        System.out.println("Result"  +  result );

    }
}
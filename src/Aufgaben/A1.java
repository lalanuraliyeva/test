package Aufgaben;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit:");
        int fahrenheit = sc.nextInt();
        int celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius is " + celsius);
    }
}

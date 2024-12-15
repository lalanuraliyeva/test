package Aufgaben;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Schaltjahr!");
        } else {
            System.out.println("Kein Schaltjahr!");
        }
    }
}

package ifElse3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  an alphabet: ");
        String alph = scanner.nextLine();

        if (alph.equals("a") && alph.equals("e")) {
            System.out.println("is a vowel");

        } else {
            System.out.println("is consonant");
        }


    }
}

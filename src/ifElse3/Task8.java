package ifElse3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter an alphabet");
        char alph= scanner.next().charAt(0);

        if (alph>= 'a' && alph<='z') {
            System.out.println(" is lowercase");

        } else if (alph>='A' && alph<='Z') {
            System.out.println("is uppercase");
        } else {
            System.out.println(false);

        }
    }

}

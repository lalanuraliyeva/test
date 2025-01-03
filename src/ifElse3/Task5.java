package ifElse3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a character: ");
        char alph = scanner.next().charAt(0);

        if (alph >='a' && alph<= 'z' || alph >= 'A' && alph<='Z') {
            System.out.println("is a alphabet" );
        }else {
            System.out.println("is not a alphabet");
        }

    }
}

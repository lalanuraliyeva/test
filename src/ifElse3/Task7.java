package ifElse3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the character");
        char character= scanner.next().charAt(0);


        if (character >= 'a' && character<='z' || character>= 'A'&& character<='Z') {
            System.out.println("is an alphabet");
        } else if (character > '0' && character <'9') {
            System.out.println("is a digit");
        } else {
            System.out.println("is a special character");
        }
    }
}

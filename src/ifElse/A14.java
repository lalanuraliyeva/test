package ifElse;

import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char alph =input.next().charAt(0);


        if(alph >= 'a' && alph <= 'z' || alph >= 'A' && alph <= 'Z'){
            System.out.println(" letter is from alphabet");

        } else {
            System.out.println("it isnt letter");
        }

    }
}

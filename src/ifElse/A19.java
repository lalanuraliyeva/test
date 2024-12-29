package ifElse;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a word:");
        String word = input.nextLine();

        if (word.length()<5){
            System.out.println("length of the word: " + word.length());
        }else{
            System.out.println("input a word less than 5 letters");
        }
    }
}

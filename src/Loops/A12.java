package Loops;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int total = 0;

        for (int i = 0; i < word.length() - 1; i++){
            if (word.charAt(i) == ' ' && word.charAt(i - 1) != 0){
            total++;
            }
        }
        System.out.println("Total number of the  words in a string: " + (total+1));
    }
}

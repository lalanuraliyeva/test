package Math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String name = scanner.nextLine();

        try{
            if (name.equals("Thomas")) {
                System.out.println("You are not allowed!");
            } else {
                System.out.println("Welcome! " + name);
            }
        } catch (InputMismatchException e){
            e.printStackTrace();
        }


        /// some text here
    }
}

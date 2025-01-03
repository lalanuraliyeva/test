package ifElse3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = scanner.nextInt();

        if (year %4 == 0 ) {
            System.out.println("is  a leap year" +year);

        } else {
            System.out.println("is not a leap  year");
        }

    }
}

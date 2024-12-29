package ifElse;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number");
        int number = input.nextInt();
        if(number<12){
            System.out.println(number + 10);
        }
    }
}

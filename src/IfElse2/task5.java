package IfElse2;

import java.util.Scanner;

public class task5 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input num1: ");
    int number = scanner.nextInt();
    System.out.println("input num2: ");
    int number2 = scanner.nextInt();
    System.out.println("input num1: ");
    int number3 = scanner.nextInt();


    if (number > number2 && number2 > number3){       /// 1
        System.out.println("number1 is greater");
    } else if (number < number2 && number2 > number3){    /// 2
        System.out.println("number2 is greater");
    } else if (number < number2 && number2 < number3){   /// 3
        System.out.println("number 3 is greater");
    }






}

}

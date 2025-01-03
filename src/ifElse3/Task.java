package ifElse3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1=input.nextInt();
        System.out.println("Enter Number2;");
        int num2=input.nextInt();

        if (num1>num2){
            System.out.println("max number is: +num1");
        }else if(num1<num2){
            System.out.println("max number is: +num2");

        } else{
            System.out.println("both are equal ");

        }
    }
}

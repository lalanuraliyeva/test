package Methods;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        //System.out.println("Sum of two numbers: " + sumNumbers(5,10));
        //System.out.println(diverseNumbers(18,9));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("company of two numbers: " + companyNumbers (a, b));
    }



    public static int companyNumbers(int a, int b) {
        return a * b ;
    }

    public static int sumNumbers(int a, int b){
        return a + b;
    }

    public static  int diverseNumbers(int d, int e) {
        return d/e;
    }
}

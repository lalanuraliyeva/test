package Methods;

import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Diverse of Numbers: " + diverseNumbers(a,b));
    }

    public  static int diverseNumbers(int a, int b){
        return  a/b;
    }

}


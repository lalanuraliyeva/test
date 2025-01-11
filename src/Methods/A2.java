package Methods;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
        System.out.println("input the first number: ");
        int x = scanner.nextInt();
        System.out.println("input the second number: ");
        int y = scanner.nextInt();
        System.out.println("input the third number: ");
        int z = scanner.nextInt();

        System.out.println("the smallest value is: " + compareNumbers(x,y,z));
    }
    public static int compareNumbers(int x, int y, int z ) {
        return Math.min(Math.min(x,y),z);

    }


}

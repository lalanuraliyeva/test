package Methods;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x= scanner.nextInt();
        System.out.println("Input the Second number: ");
        int y =scanner.nextInt();
        System.out.println("Input the third number: ");
        int z = scanner.nextInt();

        System.out.println("the average value is : " + averageNumber(x,y,z));

    }
    public static int averageNumber(int x, int y, int z) {
        return (x+y+z)/3;

    }
}

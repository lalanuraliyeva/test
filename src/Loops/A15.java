package Loops;

public class A15 {
    public static void main(String[] args) {

        int number = 6;
        int f = 1;

        for (int i = 1; i <= number; i++){
            f *= i;
        }
        System.out.println("Factorial: " + f);
    }
}

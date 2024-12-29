package ifElse;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char sait = scanner.next().charAt(0);
        if (sait == 'a' || sait == 'o' || sait== 'e'|| sait== 'u' || sait == 'i'){
            System.out.println("vowel");
        } else{
            System.out.println("not a vowel");
        }
    }
}

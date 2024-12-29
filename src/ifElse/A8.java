package ifElse;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("adinizi daxil edin:");
        String ad= sc.nextLine();
        System.out.println("parolunuzu daxil edin:");
        int parol=sc.nextInt();



        if (ad.equals("lala")) {
            if (parol == 1234) {
                System.out.println("Salam " + ad);
            } else{
                System.out.println("istifadeci tapilmadi");
            }
        }



    }
}

package Loops;

import java.util.Scanner;

public class A21reverse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the digits:");
         int num = input.nextInt();
         int a =num;
         int rev=0;
         int rem =0;

         while(num>0) {
             rem =num% 10;
             rev =rev *10+rem;
             num/=10;

         }
        System.out.println( " given digits " + a);
        System.out.println( " reverse digits " + rev );

    }
}

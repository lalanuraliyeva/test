package Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int  num = input.nextInt();
        int a =num;
        int rem =0;
        int sum =0;
          while (num>0) {
              rem = num %10;
              sum =sum+rem;
              num /=10;

          }
        System.out.println(" given digits "  +  a);
        System.out.println(" sum of digits "  +  sum);

    }
}

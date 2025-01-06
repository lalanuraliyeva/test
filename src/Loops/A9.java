package Loops;

public class A9 {
    public static void main(String[] args) {

        //5 % 2 != 0
        /*for (int i =0; i<=100; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }

         */


        int i =0;
        while (i<100) {
            i++;
            if (i% 2 !=0) {
                System.out.println(i);
            }
        }
    }
}

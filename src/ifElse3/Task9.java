package ifElse3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a day of week");
        int day = scanner.nextInt();
        String monday = "Monday";

        switch (day) {
            case 1:
                System.out.println(monday);
                System.out.println(monday.toUpperCase());
                System.out.println(monday.length());
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }



    }
}

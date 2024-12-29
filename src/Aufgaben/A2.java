package Aufgaben;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input minutes: ");
        long minutes = sc.nextLong();
        System.out.println("How many days in year?");

        long year = 365;
        long day = 1440;
        long minutesInYear = year * day;


        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");


        /*if (days == 365){

            System.out.println(minutes +  "minutes is approximately"
                                        +  + "years and" +  + "days");
        } else if (days == 366){

        }

         */
    }
}



/*
Write a Java program to convert minutes into years and days.

        Math.Divide.Test Data
Input the number of minutes: 3456789
Expected Output :
        3456789 minutes is approximately 6 years and 210 days

 */
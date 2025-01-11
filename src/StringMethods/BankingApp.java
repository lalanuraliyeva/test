package StringMethods;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        int balance = 150;

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select an option: ");
            String choice = "1. Deposit\n" +
                    "2. Withdraw\n" +
                    "3. Exit";
            System.out.println(choice);
            String secim = scanner.nextLine();

            if (secim.equals("1")){
                System.out.println("How much you want to deposit: ");
                int deposit = scanner.nextInt();
                balance+=deposit;
                System.out.println("Current balance: " + balance + " $ ");
            } else if (secim.equals("2")) {
                System.out.println("How much you want to withdraw?");
                int withdraw = scanner.nextInt();
                if (balance-withdraw<0) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance-=withdraw;
                    System.out.println("current balance: " + balance + "$");
                }
            } else if (secim.equals("3")) {
                System.out.println("exit");
                System.exit(0);
            }
        }
    }
}

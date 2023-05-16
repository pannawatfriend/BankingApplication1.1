package bankingApplication1;

import java.util.Random;
import java.util.Scanner;

public class BankingApplication1 {
    public static void main(String[] args) {
        int option = 0, number;
        String name;
        double balance, amount;
        Bank bank = new Bank();
        Account account;
        Scanner scan = new Scanner(System.in);

        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1. Display All Accounts");
            System.out.println("2. Open New bankingApplication1.Account");
            System.out.println("3. Close Existing bankingApplication1.Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            option = scan.nextInt();
            scan.nextLine();
        }
        switch (option) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Enter Account Name: ");
                name = scan.nextLine();
                System.out.println("Enter Initial Balance: ");
                balance = scan.nextLine();
                number = generateAccountNumber;
                account = new Account(111111, "aaab bbbb", 5000);
                bank.openAccount(account);
                break;
            case 3:
                System.out.println("Enter Account Number: ");
                number = scan.nextInt();
                bank.closeAccount(number);
                break;
            case 4:
                System.out.println("Enter Account Number: ");
                number = scan.nextInt();
                System.out.println("Enter Amount of Money: ");
                amount = scan.nextDouble();
                bank.depositMoney(number, amount);
                break;
            case 5:
                System.out.println("Enter Account Number: ");
                number = scan.nextInt();
                System.out.println("Enter Amount of Money: ");
                amount = scan.nextDouble();
                bank.withdrawMoney(number, amount);
                break;
        }
        System.out.println();
    }
    public static int generateAccountNumber() {
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }
}

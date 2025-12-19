package com.nit.hk.user;

import com.nit.hk.blogic.HDFCBankAccount;
import com.nit.hk.spec.BankAccount;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new HDFCBankAccount();

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                }
                case 3 -> {
                    System.out.println("Balance: " + account.getBalance());
                }
                case 4 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}


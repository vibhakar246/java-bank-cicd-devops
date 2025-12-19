package com.nit.hk.blogic;

import com.nit.hk.spec.BankAccount;

public class HDFCBankAccount implements BankAccount {

    private double balance = 0;

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "HDFC";
    }
}


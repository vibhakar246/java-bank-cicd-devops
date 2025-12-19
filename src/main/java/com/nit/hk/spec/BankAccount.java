package com.nit.hk.spec;

public interface BankAccount {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    String getAccountType();
}


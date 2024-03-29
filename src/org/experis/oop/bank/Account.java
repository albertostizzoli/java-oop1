package org.experis.oop.bank;

import java.util.Random;

public class Account {
    private int number_account;
    private String name;
    private int balance;

    // Costruttore della classe Account
    public Account(String name) {
        Random rnd = new Random();
        number_account = rnd.nextInt(1000) + 1;
        setName(name);
        balance = 0;
    }

    // Metodo per impostare il nome del titolare dell'account
    public void setName(String name) {
        this.name = name;
    }

    // Metodo per ottenere il saldo dell'account
    public int getBalance() {
        return balance;
    }

    // Metodo per prelevare denaro dall'account
    public boolean getMoney(int money) {
        if (money < 0) return false;
        if (money <= balance) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }

    // Metodo per versare denaro sull'account
    public void payMoney(int money) {
        if (money < 0) return;
        balance += money;
    }
}





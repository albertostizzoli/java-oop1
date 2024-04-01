package org.experis.oop.bank;

import java.util.Random;

public class Account {
    private int number_account;
    private String name;
    private int balance;

    // Costruttore della classe Account
    public Account(String name) {
        Random random = new Random();
        number_account = random.nextInt(1000) + 1;
        getName(name);
        balance = 0;
    }

    // Metodo per ottenere il numero del conto
    public int getNumberAccount(){
        return number_account;
    }

    // Metodo per impostare il nome del titolare dell'account
    public void getName(String name) {
        this.name = name;
    }

    // Metodo per ottenere il saldo dell'account
    public int getBalance() {
        return balance;
    }

    // Metodo per prelevare denaro dall'account
    public boolean getMoney(int money) {
        // Verifica se la quantità di denaro richiesta è maggiore o uguale a zero
        // e se è minore o uguale al saldo disponibile.
        if (money >= 0 && money <= balance) {
            // Se entrambe le condizioni sono soddisfatte, deduci il denaro dal saldo.
            balance -= money;
            // Restituisci true per indicare che l'operazione è stata eseguita con successo.
            return true;
        } else {
            // Se una delle condizioni non è soddisfatta, restituisci false.
            return false;
        }
    }


    // Metodo per versare denaro sull'account
    public void payMoney(int money) {
        // Verifica se la quantità di denaro da pagare è maggiore o uguale a zero.
        if (money >= 0) {
            // Se la quantità di denaro è maggiore o uguale a zero,
            // aggiungi questa quantità al saldo attuale.
            balance += money;
        }
        // Se la quantità di denaro è negativa, non viene effettuata alcuna operazione.
    }
}





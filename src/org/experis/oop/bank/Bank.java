package org.experis.oop.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per l'input da tastiera
        Scanner scanner = new Scanner(System.in);

        // Richiesta del nome del cliente
        System.out.println("Il tuo nome:");
        String name = scanner.nextLine();

        // Creazione di un'istanza della classe Account con il nome del cliente
        Account account = new Account(name);

        // Loop principale per il menu dell'applicazione
        while (true) {
            System.out.println("Benvenuto " + name);
            System.out.println("Numero conto " + account.getNumberAccount());
            // Visualizza il saldo dell'account corrente
            System.out.println("il suo saldo è di: " + account.getBalance());
            // Visualizza le opzioni del menu
            System.out.println("1 - Versamento");
            System.out.println("2 - Prelievo");
            System.out.println("3 - Uscire");

            // Lettura della scelta dell'utente
            int number = scanner.nextInt();

            // Verifica se il numero inserito è valido (1, 2 o 3) da poter continuare il ciclo
            if(number < 1 || number > 3) {
                continue;
            }

            // Switch per gestire le scelte dell'utente
            switch (number) {
                case 1: {
                    // Caso 1: Versamento
                    System.out.println("Quanto vuoi versare?");
                    int money = scanner.nextInt();
                    account.payMoney(money); // Chiamata al metodo payMoney dell'oggetto account
                    System.out.println("Ok");
                }
                break;
                case 2: {
                    // Caso 2: Prelievo
                    System.out.println("Quanto vuoi prelevare?");
                    int money = scanner.nextInt();
                    boolean res = account.getMoney(money); // Chiamata al metodo getMoney dell'oggetto account
                    System.out.println(res ? "Ok" : "Il tuo saldo è minore della quantità richiesta"); // Visualizza un messaggio a seconda dell'esito del prelievo
                }
                break;
                case 3: {
                    // Caso 3: Uscita dal programma
                    System.out.println("Grazie e Arrivederci!");
                    return;
                }
            }
        }
    }
}




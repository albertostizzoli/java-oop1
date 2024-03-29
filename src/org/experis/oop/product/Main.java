package org.experis.oop.product;

public class Main {
    public static void main(String[] args) {
        //Creo i due oggetti
        Product first = new Product("Tablet", "Potente tablet per sviluppatori", 239.90, 0.22);
        Product second = new Product("iPhone", "iPhone di ultima generazione", 639.99, 0.22);

        // Stampo il primo prodotto con le relative informazioni
        System.out.println("Primo Prodotto: ");
        System.out.println("Nome esteso: " + first.getName());
        System.out.println("descrizione: "+ first.getDescription());
        System.out.println("Prezzo base: " + first.getPrice());
        System.out.println("Prezzo con Iva: " + first.getIva());

        // Stampo il secondo prodotto con le relative informazioni
        System.out.println("Secondo Prodotto: ");
        System.out.println("Nome esteso: " + second.getName());
        System.out.println("descrizione: "+ second.getDescription());
        System.out.println("Prezzo base: " + second.getPrice());
        System.out.println("Prezzo con Iva: " + second.getIva());

    }
}

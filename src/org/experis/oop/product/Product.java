package org.experis.oop.product;

import java.util.Random;

public class Product {

    //Attributi
    private int code;
    private String name;
    private String description;
    private double price;
    private double iva;

    //Costruttori
    public Product(String name, String description, double price, double iva){
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    //Metodi
    //uso questo metodo per generare un codice casuale fino a 8 cifre
    private int generateCode(){
        Random random = new Random();
        return random .nextInt(10000000);
    }

    //uso questo metodo per ottenere il prezzo base
    public double getPrice() {
        return price;
    }

    //uso questo metodo per ottenere la descrizione
    public String getDescription() {
        return description;
    }

    //uso questo metodo per ottenere il prezzo con l'IVA
    public double getIva(){
        return price * (1 + iva);
    }

    //uso questo metodo per ottenere il nome esteso
    public String getName(){
        String codeStr = String.format("%08d", code);
        return codeStr + " - " + name;
    }
}

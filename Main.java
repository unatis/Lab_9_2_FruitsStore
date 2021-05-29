package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fruits Apple = new Fruits("Granny Smith");
        Fruits Banana = new Fruits("Cavendish Bananas");
        Fruits Mango = new Fruits("Honey");
        Fruits Ananas = new Fruits("Red Pineapple");
        Fruits Apricot = new Fruits("Goldbar");

        Vegetables Tomato = new Vegetables("Black Krim");
        Vegetables Potato = new Vegetables("Daisy Gold");
        Vegetables Carrot = new Vegetables("Deep Purple Hybrid");
        Vegetables Cucumber = new Vegetables("Ashley");
        Vegetables Пarlic = new Vegetables("PORCELAIN GARLIC");

        StoreVitrine Store = new StoreVitrine();

        Store.GetProduct(Apple);
        Store.GetProduct(Banana);
        Store.GetProduct(Mango);
        Store.GetProduct(Ananas);
        Store.GetProduct(Apricot);

        Store.GetProduct(Tomato);
        Store.GetProduct(Potato);
        Store.GetProduct(Carrot);
        Store.GetProduct(Cucumber);
        Store.GetProduct(Пarlic);

        Store.ShowVitrine();

    }


}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        ArrayList<PizzaInfo> list = new ArrayList<PizzaInfo>();

        list.add(new PizzaInfo(35, "Margherita", "Med dobbelt ost og oregano", 49, 97));
        list.add(new PizzaInfo(36, "Margherita Special", "Med frisk mozzarellaost, fetaost, gorgonzola, parmesanost, cheddarost, frisk tomat og pesto", 71, 119));
        list.add(new PizzaInfo(37, "Vesuvio", "med skinke", 55, 115));
        list.add(new PizzaInfo(38, "Pepperoni", "med pepperoni", 55, 115));
        list.add(new PizzaInfo(39, "Capricciosa", "med skinke og champignon", 57, 109));
        list.add(new PizzaInfo(40, "Hawaii", "med skinke og ananas", 57, 109));
        list.add(new PizzaInfo(41, "Amerikaner", "med hakket oksekød og chili", 58, 111));
        list.add(new PizzaInfo(42, "Princess", "Med cocktailpølser, bacon og løg", 63, 121));
        list.add(new PizzaInfo(43, "Omelet", "med skinke, bacon, løj og æg", 64, 123));
        list.add(new PizzaInfo(44, "Kødsauce", "med kødsauce og løg", 55, 101));
        list.add(new PizzaInfo(45, "Pollo", "med kulling, champignin og paprika", 58, 107));
        list.add(new PizzaInfo(46, "Parmaskinke", "med parmaskinke, pesto, parmasanost og rucola", 61, 113));
        list.add(new PizzaInfo(48, "Karry", "med kylling, bacon, karrypulver og ananas", 63, 117));
        list.add(new PizzaInfo(49, "Salatpizza", "vælg mellem kebab, kylling, skinke, falafel, peperoni & gorgonzola eller kødsauce", 62, 115));

        System.out.print("Pizzamenu: ");
        for(int i = 0; i <list.size(); i++)
        {
            System.out.print("Nummer: " + list.get(i).getNummer());
            System.out.println("\tNavn: " + list.get(i).getNavn());
        }

        System.out.println("Indtast pizza nummer: ");
        Scanner laesFraConsol = new Scanner(System.in);
        int Nummer = laesFraConsol.nextInt();


        for (int i = 0; i < list.size(); i++) {
            if (Nummer == list.get(i).getNummer())
                System.out.println("" + list.get(i));
        }
    }
}

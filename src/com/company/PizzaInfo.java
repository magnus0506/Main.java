package com.company;

public class PizzaInfo
{
    private int nummer, almPris, familliePris;
    private String navn, ingredienser;

    public PizzaInfo(int Nummer, String Navn, String Ingredienser, int AlmPris, int FamilliePris)
    {
        nummer = Nummer;
        navn = Navn;
        ingredienser = Ingredienser;
        almPris = AlmPris;
        familliePris = FamilliePris;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String getNavn()
    {
        return navn;
    }

@Override
    public String toString()
    {
    return "Nummer: " + nummer + "\nNavn: " + navn + "\nIngredienser: " + ingredienser + "\nAlm pris: " + almPris + "\nFamillie pris: " + familliePris;
    }
}
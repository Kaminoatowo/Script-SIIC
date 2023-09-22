package rettangolo;

import java.util.Scanner;
public class Rettangolo
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int base, altezza;
        int area, perimetro;
        
        System.out.print("Inserisci la base   : ");
        base = in.nextInt();
        System.out.print("Inserisci l'altezza : ");
        altezza = in.nextInt();

        perimetro = (base + altezza) * 2;
        area = base * altezza;

        System.out.println("il valore del perimetro e': " + perimetro);
        System.out.println("il valore dell'area e'    : " + area);
    }
}
package SempliciAlgoritmi.Gauss;

import java.util.Scanner;
public class GaussIF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numLetto;
        int somma;

        System.out.print("Inserisci il numero : ");
        numLetto = in.nextInt();
        
        if (numLetto != 1) {
            System.out.print("la somma e' : " + numLetto);    
        } else {
            somma = numLetto * (numLetto + 1) / 2;
            System.out.print("la somma e' : " + somma);
        }
        
    }
}
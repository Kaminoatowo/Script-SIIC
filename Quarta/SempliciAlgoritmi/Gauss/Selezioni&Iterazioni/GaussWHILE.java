package SempliciAlgoritmi.Gauss;

import java.util.Scanner;
public class GaussWHILE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numLetto;
        int somma;

        System.out.print("Inserisci il numero : ");
        numLetto = in.nextInt();
        
        while (numLetto > 0) {
            somma += numLetto;
            --numLetto;
        }
        
    }
}
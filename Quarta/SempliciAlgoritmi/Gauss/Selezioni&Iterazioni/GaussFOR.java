package SempliciAlgoritmi.Gauss;

import java.util.Scanner;
public class GaussFOR
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numLetto;
        int somma = 0;

        System.out.print("Inserisci il numero : ");
        numLetto = in.nextInt();
        
        for (int i = 0; i <= numLetto; i++) {
            somma += numLetto;
        }
        
    }
}
package SempliciAlgoritmi.Gauss;

import java.util.Scanner;
public class GaussDO_WHILE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numLetto;
        int somma;

        System.out.print("Inserisci il numero : ");
        numLetto = in.nextInt();
        do {
            numLetto--;
        } while (numLetto > 0) {
            somma += numLetto+1;
        }
        
    }
}
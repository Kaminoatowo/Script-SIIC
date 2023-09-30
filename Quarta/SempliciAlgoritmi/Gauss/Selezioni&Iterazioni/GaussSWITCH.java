package SempliciAlgoritmi.Gauss;

import java.util.Scanner;
public class GaussSWITCH
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numLetto;
        int somma;

        System.out.print("Inserisci il numero : ");
        numLetto = in.nextInt();
        
        switch(numLetto) {
            case 1:
                System.out.print("la somma e' : " + numLetto);
                break;
            default:
                somma = numLetto * (numLetto + 1) / 2;
                System.out.print("la somma e' : " + somma);
                break;
        }
        
    }
}
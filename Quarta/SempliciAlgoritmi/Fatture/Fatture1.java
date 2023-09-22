package SempliciAlgoritmi.Fatture;

import java.util.Scanner;

public class Fatture1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final float aliquotaIVA = 22;
        float imponibile1, imponibile2, imponibile3;
        float importoNetto, importoIVA, importoLordo;

        System.out.println("Inserisci primo imponibile    : ");
        imponibile1 = in.nextFloat();
        System.out.println("Inserisci secondo imponibile  : ");
        imponibile2 = in.nextFloat();
        System.out.println("Inserisci terzo imponibile    : ");
        imponibile3 = in.nextFloat();

        importoNetto = imponibile1 + imponibile2 + imponibile3;
        importoIVA = importoNetto * aliquotaIVA / 100;
        importoLordo = importoNetto + importoIVA;

        System.out.println("imponibile   : " + importoNetto);
        System.out.println("importo IVA  : " + importoIVA);
        System.out.println("importo lordo: " + importoLordo);
    }
}

package approssimazioni;

import java.util.Scaner;

class EFattoriale {

    static int fattoriale(int n) {
        if (n > 1)
            return (n * fattoriale(n-1));
        else
            return 1;
    }

    static double calcoloE(int n) {
        int x;
        double numeroe = 0;
        for (x = 0; x < n; x++)
            numeroe = numeroe + (1.0 / fattoriale(x));
        return numeroe;
    }

    public static void main(String[] args) {
        double numeroE = 0;
        int tanti;

        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero grande: ");
        tanti = in.nextInt();

        numeroE = calcoloE(tanti);
        System.out.println("L'approssimazione di e con " + tanti + " addendi e' " + numero_e);
    }
}
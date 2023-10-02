package approssimazioni;

import java.util.Scanner;
import java.util.Random;

class PiMonteCarlo {
    public static void main(String[] args) {
        
        int conta, dentro, tanti;
        double n, x, y, pi, raggio;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci il numero massimo di lanci: ");
        tanti = in.nextInt();
        
        raggio = 1;
        dentro = 0;
        Random rnd = new Random();
        
        for (conta = 0; conta < tanti; conta ++) {
            x = rnd.nextDouble();
            y = rnd.nextDouble();
            
            if (x*x + y*y < raggio) {
                dentro++;
            }
            
        }
        pi = 4 * dentro / (double) tanti;
        System.out.println("L'approssimazione di PI con " + tanti + " lanci e' " + pi);
    }
}
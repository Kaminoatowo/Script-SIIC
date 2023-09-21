package radice_quadrata.Erone;
import java.util.Scanner;
public class Radice1 {
    public static int MAX = 10;

    static double radice_q(double num){
        double Q = 0, QPrec;
        int n = 0;
        QPrec = num / 2;
        for (n=0; n<MAX; n++){
            Q = (QPrec + num / QPrec) / 2;
            QPrec = Q;
        }
        return Q;
    }

public static void main(String []arg){
    Scanner in = new Scanner(System.in);
    double numero;
    System.out.println("Calcolo approssimato radice \n");
    System.out.print("inserisci un valore positivo: ");
    numero = in.nextInt();
    System.out.println("Approssimato:" + radice_q(numero));
    System.out.println("Preciso     :" + Math.sqrt(numero));
}
}
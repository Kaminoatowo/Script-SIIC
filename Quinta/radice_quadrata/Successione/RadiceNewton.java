package radice_quadrata.Successione;
import java.util.Scanner;
public class RadiceNewton {
    public static int MAX = 10;

    static double radice_q(double num){
        double Q = 1.0;
        int n = 0;
        for (n=0; n<MAX; n++){
            Q = (3*Q - num*Q*Q*Q) / 2;;
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
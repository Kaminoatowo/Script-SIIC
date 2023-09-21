package radice_quadrata.Erone;
import java.util.Scanner;
public class Radice1Err {
    public static double EPS = 0.001;

    static double radice_q(double a, double x1){
        if((Math.abs(x1 - a/x1)/2) >= EPS)
        {
            x1 = (x1 + a/x1) / 2;
            return radice_q(a, x1);
        }
        else return x1;
    }

public static void main(String []arg){
    Scanner in = new Scanner(System.in);
    double numero;
    System.out.println("Calcolo approssimato radice \n");
    System.out.print("inserisci un valore positivo: ");
    numero = in.nextInt();
    System.out.println("Approssimato:" + radice_q(numero, numero/2));
    System.out.println("Preciso     :" + Math.sqrt(numero));
}
}
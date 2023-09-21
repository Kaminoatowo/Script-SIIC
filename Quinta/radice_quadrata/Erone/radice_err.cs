using System;

namespace csharp_test
{
    class Program
    {
        const double EPS = 0.01;

        static double radice_q(double a, double x)
        {
           if ((Math.Abs(x - a/x)/2) >= EPS)
           {
                x = (x + a/x) / 2;
                return radice_q(a, x);
           }
           else return x;
        }

        static void Main(string[] args)
        {
            double numero;
            
            Console.WriteLine("Calcolo approssimato radice\n");
            Console.Write("inserisci un valore positivo :");

            numero = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Approssimato:" + radice_q(numero, numero/2));
            Console.WriteLine("Preciso     :" + Math.Sqrt(numero));
        }
    }
} 
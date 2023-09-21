using System;

namespace csharp_test
{
    class Program
    {
        const int MAX = 10;

        static double radice_q(double num)
        {
            double Q = num/2;
            int n = 0;
            for (n=0; n<MAX; n++){
                Q = (3*Q - num*Q*Q*Q) / 2;
            }
            return Q;
        }

        static void Main(string[] args)
        {
            double numero;
            
            Console.WriteLine("Calcolo approssimato radice\n");
            Console.Write("inserisci un valore positivo :");

            numero = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Approssimato:" + 1/radice_q(numero));
            Console.WriteLine("Preciso     :" + Math.Sqrt(numero));
        }
    }
} 
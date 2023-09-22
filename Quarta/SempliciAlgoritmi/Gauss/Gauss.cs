using System;

namespace Gauss
{
    class Program
    {
        static void Main(string[] args)
        {
            int numLetto;
            int somma;

            Console.WriteLine("Inserisci il numero : ");
            numLetto = Convert.ToDouble(Console.WriteLine(numLetto));

            somma = numLetto * (numLetto + 1) / 2;

            Console.WriteLine("la somma e' : " + somma);
        }
    }
}
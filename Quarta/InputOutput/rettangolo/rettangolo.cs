using System;

namespace Rettangolo
{
    class Program
    {
        static void Main(string[] args)
        {
            double latoBase;
            double latoAltezza;
            double area;
            double perimetro;

            Console.WriteLine("Inserisci la base   : ");
            latoBase = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Inserisci l'altezza : ");
            latoAltezza = Convert.ToDouble(Console.ReadLine());

            perimetro = (latoBase + latoAltezza) * 2;
            area = latoBase * latoAltezza;
            
            Console.WriteLine("il valore del perimetro e' :" + perimetro);
            Console.WriteLine("il valore dell'area e'     :" + area);
        }
    }
}
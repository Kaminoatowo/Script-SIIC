using System;

namespace Fatture
{
    class Program
    {
        static void Main(string[] args)
        {
            const float aliquotaIVA = 22;

            float imponibile1, imponibile2, imponibile3;
            float importoNetto, importoIVA, importoLordo;

            Console.WriteLine("Inserisci il primo imponibile   : ");
            imponibile1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Inserisci il secondo imponibile : ");
            imponibile2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Inserisci il terzo imponibile   : ");
            imponibile3 = Convert.ToDouble(Console.ReadLine());

            importoNetto = imponibile1 + imponibile2 + imponibile3;
            importoIVA = importoNetto * aliquotaIVA / 100;
            importoLordo = importoNetto + importoIVA;

            Console.WriteLine("imponibile     : " + importoNetto);
            Console.WriteLine("importo IVA    : " + importoIVA);
            Console.WriteLine("importo lordo  : " + importoLordo);
        }
    }
}
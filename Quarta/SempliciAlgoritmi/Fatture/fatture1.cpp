#include <iostream>
using namespace std;
int main()
{
    const float aliquotaIVA = 22;
    cout.precision(3);
    
    float imponibile1, imponibile2, imponibile3;
    float importoNetto, importoIVA, importoLordo;

    cout << "Inserisci il primo imponibile    \t: ";
    cin >> imponibile1;
    cout << "Inserisci il secondo imponibile  \t: ";
    cin >> imponibile2;
    cout << "Inserisci il terzo imponibile    \t: ";
    cin >> imponibile3;

    importoNetto = imponibile1 + imponibile2 + imponibile3;
    importoIVA = importoNetto * aliquotaIVA / 100;
    importoLordo = importoNetto + importoIVA;

    cout << "imponibile    \t: " << importoNetto << endl;
    cout << "importo IVA   \t: " << importoIVA << endl;
    cout << "importo lordo \t: " << importoLordo << endl;
}
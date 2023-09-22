#include <iostream>
using namespace std;
int main()
{
    int numLetto;
    int somma;

    cout << "Inserisci un numero \t:";
    cin >> numLetto;

    somma = numLetto * (numLetto + 1) / 2;
    cout << "la somma e' \t: " << somma << endl;

    return 0;
}
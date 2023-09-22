#include <iostream>
using namespace std;
int main()
{
    int base, altezza;
    int area, perimetro;

    cout << "Programma che calcola il perimetro e l'area di un rettangolo" << endl;
    
    cout << "inserire la base \t:";
    cin >> base;
    cout << "inserire l'alteza \t:";
    cin >> altezza;

    perimetro = (base + altezza) * 2;
    area = base * altezza;

    cout << "la misura del perimetro e\'\t:" << perimetro << endl;
    cout << "la misura dell'area e\'    \t:" << area << endl;
}
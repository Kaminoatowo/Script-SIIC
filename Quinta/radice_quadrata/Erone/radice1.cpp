#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

#define MAX 10

double radice_q(double num){
    double Q, QPrec;
    int n = 0;
    QPrec = num / 2;
    for (n=0; n<MAX; n++){
        Q = (QPrec + num / QPrec) / 2;
        QPrec = Q;
    }
    return Q;
}

int main(){
    double numero;
    cout.precision(15);
    cout << "Calcolo approssimato radice quadrata\n";
    cout << "-inserisci un valore positivo: ";
    cin >> numero;

    cout << "\nApprossimato: " << radice_q(numero);
    cout << "\nPreciso     : " << sqrt(numero);
}
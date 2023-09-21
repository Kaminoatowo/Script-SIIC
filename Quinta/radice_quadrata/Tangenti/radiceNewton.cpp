#include <iostream>
#include <cmath>

using namespace std;

#define MAX 10

double radice_q(double num){
    double Q = 1.0;
    int n = 0;
    for (n=0; n<MAX; n++){
        Q = (Q/2) + (num / (2 * Q));
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
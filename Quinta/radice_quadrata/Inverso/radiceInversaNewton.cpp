#include <iostream>
#include <cmath>

using namespace std;

#define MAX 10

double radice_q(double num){
    double Q = 0.002;
    int n = 0;
    for (n=0; n<MAX; n++){
        Q = 0.5*Q*(3 - num*Q*Q);
    }
    return Q;
}

int main(){
    double numero;
    cout.precision(15);
    cout << "Calcolo approssimato radice quadrata\n";
    cout << "-inserisci un valore positivo: ";
    cin >> numero;

    cout << "\nApprossimato: " << 1/radice_q(numero);
    cout << "\nPreciso     : " << sqrt(numero);
}
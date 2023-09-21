#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

#define EPS 0.001

double radice_q(double a, double x1){
    if((fabs(x1 - a/x1)/2) >= EPS){
        x1 = (x1 + a/x1)/2;
        return radice_q(a, x1);
    }
    else return x1;
}

int main(){
    double numero;
    cout.precision(15);
    cout << "Calcolo approssimato radice quadrata\n";
    cout << "-inserisci un valore positivo: ";
    cin >> numero;

    cout << "\nApprossimato: " << radice_q(numero, numero/2);
    cout << "\nPreciso     : " << sqrt(numero);
}
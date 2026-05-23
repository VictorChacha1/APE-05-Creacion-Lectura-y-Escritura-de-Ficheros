#include <iostream>
#include <fstream>
using namespace std;
double leerSaldo() {
    ifstream arch("cajero.txt");
    string usr; double saldo=0;
    if(arch>>usr>>saldo) return saldo;
    return 0.0;
}
void actualizar(string usr, double saldo) {
    ofstream arch("cajero.txt"); // sobrescribe
    arch<<usr<<" "<<saldo;
}
int main() {
    string usr = "Victor";
    double saldo = leerSaldo(); // simulacion init
    if(saldo==0) actualizar(usr, 100.0); // fondo inicial
    
    saldo = leerSaldo();
    cout<<"Saldo: "<<saldo<<". Depositando 50...\n";
    actualizar(usr, saldo + 50);
    return 0;
}

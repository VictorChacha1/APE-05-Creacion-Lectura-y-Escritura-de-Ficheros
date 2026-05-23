#include <iostream>
#include <fstream>
#include <string>
using namespace std;
void guardarNota(string nom, double n1, double n2, double n3) {
    double prom = (n1+n2+n3)/3.0;
    string est = (prom >= 7.0) ? "Aprobado" : "Reprobado";
    ofstream arch("notas.txt", ios::app);
    arch<<nom<<","<<prom<<","<<est<<"\n";
    arch.close();
    cout<<"Registrado con estado: "<<est<<"\n";
}
int main() {
    guardarNota("Victor", 10, 8, 9);
    return 0;
}

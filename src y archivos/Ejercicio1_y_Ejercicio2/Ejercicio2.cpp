#include <iostream>
#include <fstream>
#include <string>
#include <sstream>
using namespace std;
void leerArchivo() {
    ifstream arch("estudiantes.txt");
    string linea, c, n, car, p_str;
    int cont = 0; double suma = 0;
    while(getline(arch, linea)) {
        stringstream ss(linea);
        getline(ss, c, ','); getline(ss, n, ','); 
        getline(ss, car, ','); getline(ss, p_str, ',');
        double p = stod(p_str);
        cout<<"Ced: "<<c<<" Nom: "<<n<<" Prom: "<<p<<"\n";
        suma += p; cont++;
    }
    arch.close();
    if(cont>0) {
        cout<<"Total: "<<cont<<" | Promedio Gral: "<<(suma/cont)<<"\n";
    }
}
int main() { leerArchivo(); return 0; }

#include <iostream>
#include <fstream>
#include <string>
using namespace std;
void agregar(string n, string t, string c) {
    ofstream arch("agenda.txt", ios::app);
    arch<<n<<","<<t<<","<<c<<"\n"; arch.close();
}
void buscar(string nombreBuscado) {
    ifstream arch("agenda.txt");
    string linea; bool enc = false;
    while(getline(arch, linea)) {
        if(linea.find(nombreBuscado) != string::npos) {
            cout<<"Encontrado: "<<linea<<"\n"; enc = true;
        }
    }
    if(!enc) cout<<"No existe el contacto.\n";
}
int main() {
    agregar("Victor Chacha", "0999999", "v@uta.edu.ec");
    buscar("Victor");
    return 0;
}

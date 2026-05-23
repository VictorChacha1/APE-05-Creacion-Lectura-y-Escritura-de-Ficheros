#include <iostream>
#include <fstream>
#include <string>
using namespace std;
void mostrarPorEstado(string estadoBuscado) {
    ifstream arch("biblioteca.txt");
    string linea;
    cout<<"--- Libros "<<estadoBuscado<<" ---\n";
    while(getline(arch, linea)) {
        if(linea.find(estadoBuscado) != string::npos) {
            cout<<linea<<"\n";
        }
    }
}
int main() {
    ofstream arch("biblioteca.txt", ios::app);
    arch<<"L1,Matematicas,AutorX,Disponible\n";
    arch.close();
    mostrarPorEstado("Disponible");
    return 0;
}

#include <iostream>
#include <fstream>
#include <string>
#include <cstdio>
using namespace std;
void eliminarRegistro(string idBuscar) {
    ifstream arch("datos.txt");
    ofstream temp("temp.txt");
    string linea;
    while(getline(arch, linea)) {
        // Copia todo excepto la linea que queremos eliminar
        if(linea.find(idBuscar) == string::npos) {
            temp<<linea<<"\n";
        }
    }
    arch.close(); temp.close();
    remove("datos.txt");
    rename("temp.txt", "datos.txt");
    cout<<"Registro eliminado correctamente.\n";
}
int main() {
    eliminarRegistro("ID_123");
    return 0;
}

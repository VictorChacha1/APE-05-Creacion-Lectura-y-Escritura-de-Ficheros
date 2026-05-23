#include <iostream>
#include <fstream>
#include <string>
using namespace std;
void registrarAsistencia(string nombre) {
    // Restriccion: 5 dias laborables, fechas unicas
    string fechas[5] = {"2026-05-25", "2026-05-26", "2026-05-27", "2026-05-28", "2026-05-29"};
    ofstream arch("asistencia.txt", ios::app);
    for(int i=0; i<5; i++){
        string estado;
        cout<<"Asistencia para "<<fechas[i]<<": "; cin>>estado;
        arch<<nombre<<","<<fechas[i]<<","<<estado<<"\n";
    }
    arch.close();
}
void mostrarFaltas() {
    ifstream arch("asistencia.txt");
    string linea; int faltas = 0;
    while(getline(arch, linea)) {
        if(linea.find("Falta") != string::npos) faltas++;
    }
    cout<<"Total de faltas: "<<faltas<<"\n";
}
int main() { registrarAsistencia("Victor"); mostrarFaltas(); return 0; }

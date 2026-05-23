#include <iostream>
#include <fstream>
using namespace std;
void generarFactura(string prod, int cant, double precio) {
    double total = cant * precio;
    ofstream arch("ventas.txt", ios::app);
    arch<<"==== FACTURA ====\n";
    arch<<"Prod: "<<prod<<" | Cant: "<<cant<<"\n";
    arch<<"Total a Pagar: $"<<total<<"\n";
    arch.close();
    cout<<"Factura generada en ventas.txt\n";
}
int main() {
    generarFactura("Teclado", 2, 25.5);
    return 0;
}

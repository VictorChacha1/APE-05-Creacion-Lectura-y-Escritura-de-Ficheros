#include <iostream>
#include <fstream>
using namespace std;
class Estudiante {
private:
    string cedula, nombre, carrera; double promedio;
public:
    Estudiante(string c, string n, string car, double p) {
        cedula=c; nombre=n; carrera=car; promedio=p;
    }
    void guardar() {
        ofstream arch("estudiantes.txt", ios::app);
        if(arch.is_open()){
            arch<<cedula<<","<<nombre<<","<<carrera<<","<<promedio<<"\n";
            arch.close();
            cout<<"Estudiante guardado.\n";
        }
    }
};
int main() {
    string c, n, car; double p;
    cout<<"Cedula: "; cin>>c; cout<<"Nombre: "; cin>>n;
    cout<<"Carrera: "; cin>>car; cout<<"Promedio: "; cin>>p;
    Estudiante est(c, n, car, p);
    est.guardar();
    return 0;
}

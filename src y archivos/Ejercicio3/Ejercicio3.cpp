#include <iostream>
#include <fstream>
#include <string>
#include <sstream>
using namespace std;
class Producto {
    string cod, nom; int cant; double precio;
public:
    Producto(string c, string n, int ca, double p):cod(c),nom(n),cant(ca),precio(p){}
    void guardar(){
        ofstream arch("inventario.txt", ios::app);
        arch<<cod<<","<<nom<<","<<cant<<","<<precio<<"\n";
        arch.close();
    }
    static void mostrar(){
        ifstream arch("inventario.txt");
        string linea, c, n, ca_s, p_s; double total=0;
        while(getline(arch, linea)){
            stringstream ss(linea);
            getline(ss,c,','); getline(ss,n,','); 
            getline(ss,ca_s,','); getline(ss,p_s,',');
            int cant = stoi(ca_s); double pre = stod(p_s);
            double sub = cant * pre; total += sub;
            cout<<c<<" "<<n<<" Subtotal: $"<<sub<<"\n";
        }
        cout<<"Total Inventario: $"<<total<<"\n";
    }
};
int main() {
    Producto p("A1","Mouse",10,15.5); p.guardar();
    Producto::mostrar(); return 0;
}

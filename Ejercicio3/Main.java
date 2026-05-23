import java.io.*;
class Producto {
    String cod, nom; int cant; double precio;
    public Producto(String c, String n, int ca, double p) {
        cod=c; nom=n; cant=ca; precio=p;
    }
    public void guardar() {
        try(PrintWriter pw = new PrintWriter(new FileWriter("inventario.txt",true))){
            pw.println(cod+","+nom+","+cant+","+precio);
        }catch(Exception e){}
    }
    public static void mostrar() {
        try(BufferedReader br = new BufferedReader(new FileReader("inventario.txt"))){
            String l; double t=0;
            while((l=br.readLine())!=null){
                String[] d = l.split(",");
                int c = Integer.parseInt(d[2]); double p = Double.parseDouble(d[3]);
                double sub = c * p; t += sub;
                System.out.println(d[0]+" "+d[1]+" Sub: $"+sub);
            }
            System.out.println("Total Inv: $"+t);
        }catch(Exception e){}
    }
}
public class Main {
    public static void main(String[] args){
        Producto p = new Producto("A1","Mouse",10,15.5); p.guardar();
        Producto.mostrar();
    }
}

package Ejercicio1_y_Ejercicio2;
import java.io.*;
public class Main2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String linea; int cont = 0; double suma = 0;
            while((linea = br.readLine()) != null) {
                String[] d = linea.split(",");
                double p = Double.parseDouble(d[3]);
                System.out.println("Ced: "+d[0]+" Nom: "+d[1]+" Prom: "+p);
                suma += p; cont++;
            }
            if(cont>0) {
                System.out.println("Total: "+cont+" | Promedio Gral: "+(suma/cont));
            }
        } catch(IOException e) { System.out.println("No se pudo leer."); }
    }
}

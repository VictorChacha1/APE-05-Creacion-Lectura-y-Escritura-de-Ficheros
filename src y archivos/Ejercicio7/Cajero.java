package Ejercicio7;

import java.io.*;
public class Cajero {
    public static double leer() {
        try(BufferedReader br = new BufferedReader(new FileReader("cajero.txt"))){
            String[] d = br.readLine().split(","); return Double.parseDouble(d[1]);
        }catch(Exception e){ return 0; }
    }
    public static void actualizar(String usr, double s) {
        try(PrintWriter pw = new PrintWriter(new FileWriter("cajero.txt"))){ // sin true sobrescribe
            pw.println(usr+","+s);
        }catch(Exception e){}
    }
    public static void main(String[] args){
        actualizar("Victor", 100.0); // init
        double saldo = leer();
        actualizar("Victor", saldo - 20.0); // retiro
        System.out.println("Saldo final: " + leer());
    }
}


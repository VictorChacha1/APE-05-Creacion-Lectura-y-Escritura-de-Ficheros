package Ejercicio9;

import java.io.*;
public class Ventas {
    public static void facturar(String prod, int cant, double precio) {
        double total = cant * precio;
        try(PrintWriter pw = new PrintWriter(new FileWriter("ventas.txt",true))){
            pw.println("--- FACTURA ---");
            pw.println("Prod: "+prod+" | Cant: "+cant+" | Total: $"+total);
        }catch(Exception e){}
    }
    public static void main(String[] args){
        facturar("Monitor", 1, 150.0);
    }
}

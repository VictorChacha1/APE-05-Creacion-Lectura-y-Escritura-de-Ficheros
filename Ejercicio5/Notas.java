package Ejercicio5;
import java.io.*;
public class Notas {
    public static void guardar(String nom, double n1, double n2, double n3) {
        double prom = (n1+n2+n3)/3.0;
        String est = (prom >= 7.0) ? "Aprobado" : "Reprobado";
        try(PrintWriter pw = new PrintWriter(new FileWriter("notas.txt",true))){
            pw.println(nom+","+prom+","+est);
            System.out.println("Guardado. Estado: "+est);
        }catch(Exception e){}
    }
    public static void main(String[] args){
        guardar("Victor", 10, 8, 9);
    }
}

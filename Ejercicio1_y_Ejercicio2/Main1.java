package Ejercicio1_y_Ejercicio2;
import java.io.*;
import java.util.Scanner;
class Estudiante {
    private String cedula, nombre, carrera; private double promedio;
    public Estudiante(String c, String n, String car, double p) {
        cedula=c; nombre=n; carrera=car; promedio=p;
    }
    public void guardar() {
        try(FileWriter fw = new FileWriter("estudiantes.txt", true);
            PrintWriter pw = new PrintWriter(fw)) {
            pw.println(cedula+","+nombre+","+carrera+","+promedio);
            System.out.println("Estudiante guardado.");
        } catch(IOException e) { System.out.println("Error"); }
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cedula: "); String c = sc.next();
        System.out.print("Nombre: "); String n = sc.next();
        System.out.print("Carrera: "); String car = sc.next();
        System.out.print("Promedio: "); double p = sc.nextDouble();
        Estudiante est = new Estudiante(c, n, car, p);
        est.guardar();
    }
}

package Ejercicio6;

import java.io.*;
import java.util.Scanner;
public class Asistencia {
    public static void registrar(String nom) {
        String[] f = {"2026-05-25", "2026-05-26", "2026-05-27", "2026-05-28", "2026-05-29"};
        Scanner sc = new Scanner(System.in);
        try(PrintWriter pw = new PrintWriter(new FileWriter("asistencia.txt",true))){
            for(int i=0; i<5; i++){
                System.out.print("Estado para "+f[i]+": ");
                String est = sc.next();
                pw.println(nom+","+f[i]+","+est);
            }
        }catch(Exception e){}
    }
    public static void main(String[] args){ registrar("Victor"); }
}

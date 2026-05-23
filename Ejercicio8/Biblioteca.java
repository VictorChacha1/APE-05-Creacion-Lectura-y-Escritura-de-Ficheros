package Ejercicio8;

import java.io.*;
public class Biblioteca {
    public static void mostrarFiltro(String est) {
        try(BufferedReader br = new BufferedReader(new FileReader("biblioteca.txt"))){
            String linea;
            System.out.println("Filtro: " + est);
            while((linea = br.readLine())!=null){
                if(linea.contains(est)) System.out.println(linea);
            }
        }catch(Exception e){}
    }
    public static void main(String[] args){
        mostrarFiltro("Disponible");
    }
}

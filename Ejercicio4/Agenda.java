import java.io.*;
public class Agenda {
    public static void agregar(String n, String t, String c) {
        try(PrintWriter pw = new PrintWriter(new FileWriter("agenda.txt",true))){
            pw.println(n+","+t+","+c);
        }catch(Exception e){}
    }
    public static void buscar(String nom) {
        try(BufferedReader br = new BufferedReader(new FileReader("agenda.txt"))){
            String linea; boolean enc = false;
            while((linea = br.readLine())!=null){
                if(linea.toLowerCase().contains(nom.toLowerCase())) {
                    System.out.println("Encontrado: "+linea); enc = true;
                }
            }
            if(!enc) System.out.println("No existe.");
        }catch(Exception e){}
    }
    public static void main(String[] args){
        agregar("Victor Chacha", "0999999", "v@uta.edu.ec");
        buscar("Victor");
    }
}

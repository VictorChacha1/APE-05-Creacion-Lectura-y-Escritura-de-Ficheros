package Ejercicio10;

import java.io.*;

public class Crud {
    public static void eliminar(String id) {
        File orig = new File("datos.txt");
        File temp = new File("temp.txt");

        // Al usar try-with-resources garantizamos que los archivos se cierren automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(orig));
             PrintWriter pw = new PrintWriter(new FileWriter(temp))) {
            
            String linea;
            boolean seEncontro = false;
            while ((linea = br.readLine()) != null) {
                if (!linea.contains(id)) {
                    pw.println(linea);
                } else {
                    seEncontro = true;
                }
            }
            if (seEncontro) {
                System.out.println("ID encontrado. Procesando eliminación...");
            }
            
        } catch (Exception e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
            return;
        }

        // Ahora que los flujos están bien cerrados, el sistema operativo nos dejará operar el archivo
        if (orig.delete()) {
            if (temp.renameTo(orig)) {
                System.out.println("¡Registro con ID '" + id + "' eliminado con éxito!");
            } else {
                System.out.println("Error: No se pudo renombrar el archivo temporal.");
            }
        } else {
            System.out.println("Error: No se pudo eliminar el archivo original. Verifica que 'datos.txt' exista en la raíz del proyecto.");
        }
    }

    public static void main(String[] args) {
        eliminar("ID_123");
    }
}
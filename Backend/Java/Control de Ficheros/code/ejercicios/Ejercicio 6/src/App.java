import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import clases.Pedidos;

public class App {
    /*
     * Haz un programa que pida al usuario la ruta de dos archivos y muestre por
     * pantalla (sin repeticiones)
     * aquellas palabras que son comunes en ambos archivos. Los archivos pueden
     * tener diferentes líneas. Las palabras están separadas siempre por espacios.
     */
    public static void main(String[] args) {
        escribirPedidos();
    }

    public static void escribirPedidos() {
        List<String> respuestasExamenList = Arrays.asList("1", "2", "3", "4", "5");        
        Path carpeta  = Paths.get("examen");
        Path archivo = carpeta.resolve("examen.txt");

        try {
            Files.createDirectories(carpeta);
            try (BufferedReader br = Files.newBufferedReader(archivo)) {
                String linea = "";
                while ((linea = br.readLine()) != null) {
                    List<String> respuestas = Arrays.asList(linea.split("\\d")[0].trim());

                    if (respuestasExamenList.containsAll(respuestas)) {
                        int respuestasCorrectas = respuestas.size();
                        System.out.println("Respuestas correctas: " + respuestasCorrectas);
                    }else if (respuestasExamenList.size() != respuestas.size()) {
                        int respuestasVacias = respuestasExamenList.size() - respuestas.size();
                        System.out.println("Respuestas vacías: " + respuestasVacias);
                    }
                    else {
                        System.out.println("Respuestas incorrectas: " + respuestas);
                    }
                }
             } catch (Exception e) {
            // TODO: handle exception
    }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import  java.io.FileReader;
import java.util.Scanner;


public class App {
    public static void main(String[] args)  {
        String rutaArchivo;
        String textoArchivo = "";
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contadorDigitos = 0;
        int contadorOtros = 0;
        File archivo;

        Scanner scanner = new Scanner(System.in);        
        System.out.println("Ejercicio 3: Contador de caracteres en un archivo");
        System.out.println("Introduce la ruta del archivo a analizar:");
        rutaArchivo = scanner.nextLine();


        if (rutaArchivo.trim().isEmpty() || rutaArchivo.trim().equalsIgnoreCase("null")) {
            System.out.println("Ruta no válida. El programa se cerrará.");
            return;
            
        }else {
            File f = new File(rutaArchivo);
            if (!f.exists() || !f.isFile()) {
                System.out.println("El archivo no existe o no es un archivo válido. El programa se cerrará.");
                return;
            }
        }
        

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                textoArchivo += linea;
                textoArchivo += "\n"; 
                for (String string : textoArchivo.split("")) {
                    char caracter = string.charAt(0);
                    if (Character.isDigit(caracter)) {
                        contadorDigitos++;
                    } else if (Character.isLetter(caracter)) {
                        if ("aeiouAEIOU".indexOf(caracter) != -1) {
                            contadorVocales++;
                        } else {
                            contadorConsonantes++;
                        }
                    } else {
                        contadorOtros++;
                    }
                    
                }

            }
        } catch (Exception e) {
        e.printStackTrace(); 
           }

    }
}

/*
-- Ejercicio 1 --

Haz un programa que pida al usuario la ruta de un archivo y muestre los siguientes datos:
    - El número de vocales que hay en el archivo
    - El número de consonantes que hay en el archivo
    - El número de dígitos que hay en el archivo
    - El número de otros caracteres que hay en el archivo

    
        String[] vocales = textoArchivo.split("aeiou");
        String[] consonantes = textoArchivo.split("bcdfghjklmnpqrstvwxyz");
 */
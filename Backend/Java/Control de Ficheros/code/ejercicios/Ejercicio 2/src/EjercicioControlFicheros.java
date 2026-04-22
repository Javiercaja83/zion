import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjercicioControlFicheros {
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Introduce el nombre del archivo de entrada:");
            String fileNameIp = scanner.nextLine().trim();
            // Crear el archivo en la carpeta src, el path se construye con Paths.get 
            // para asegurar la compatibilidad entre sistemas operativos
            Path archivo = Paths.get("Backend\\Java\\Control de Ficheros\\code\\ejercicios\\ejercicio 1\\src", fileNameIp);
            // Crear los directorios necesarios si no existen
            Files.createDirectories(archivo.getParent());

            System.out.println("Introduce el texto a escribir en el archivo:");
            String texto = scanner.nextLine();
            // Escribir en el archivo
            try (BufferedWriter bw = Files.newBufferedWriter(archivo)) {
                bw.write(texto);
                bw.newLine();
                bw.write("Adiós Mundo");
            }

            System.out.println("Archivo escrito correctamente en: " + archivo.toAbsolutePath());
            System.out.println("Contenido del archivo:");

            try (BufferedReader br = Files.newBufferedReader(archivo)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

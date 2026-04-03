import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClasesPrincipales {
    public static void main(String[] args) {
        try {
            //Crear Achivo
            File f = new File("ejemplo.txt");
            // Comprobar si el archivo existe
            System.out.println("¿Existe el archivo? " + f.exists());
            // Crear el archivo (si no existe)
            if (f.createNewFile()) {
                System.out.println("Archivo creado.");
            } else {
                System.out.println("El archivo ya existía.");
            }
            // Borrar el archivo
            if (f.delete()) {
                System.out.println("Archivo borrado.");
            } else {
                System.out.println("No se pudo borrar el archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ejemploEscrituraLectura() throws IOException {
        // Escribir líneas en un archivo usando try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
            writer.write("Hola mundo");
            writer.newLine();
            writer.write("Otra línea");
        }

        // Leer líneas de un archivo usando try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        }

        // Añadir texto al final de un archivo (modo append)
        try (FileWriter fw = new FileWriter("test.txt", public)) {
            fw.write("Añadir esta línea al final\n");
        }

        // Leer un solo carácter del archivo
        try (FileReader fr = new FileReader("test.txt")) {
            int caracter = fr.read(); // Lee un carácter (devuelve su código int)
            System.out.println("Primer carácter leído: " + (char) caracter);
        }
    }
}

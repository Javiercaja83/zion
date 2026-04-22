import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClasesPrincipales {
    public static void main(String[] args) {
        try {
            // Crear archivo en la carpeta de trabajo actual
            File f = new File("ejemplo.txt");
            System.out.println("¿Existe el archivo? " + f.exists());

            // Crear el archivo (si no existe)
            if (f.createNewFile()) {
                System.out.println("Archivo creado: " + f.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existía.");
            }

            // Escribir contenido inicial
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
                writer.write("Primera línea de ejemplo");
                writer.newLine();
                writer.write("Segunda línea de ejemplo");
            }

            // Leer el archivo para comprobar el contenido
            ejemploLeerLineas("ejemplo.txt");

            // Añadir otra línea al final del archivo
            try (FileWriter fw = new FileWriter(f, true)) {
                fw.write("Línea añadida al final\n");
            }

            System.out.println("Contenido después de añadir texto:");
            ejemploLeerLineas("ejemplo.txt");

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

    public static void ejemploLeerLineas(String nombreArchivo) throws IOException {
        // Leer líneas de un archivo usando try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
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
        ejemploLeerLineas("test.txt");

        // Añadir texto al final de un archivo (modo append)
        try (FileWriter fw = new FileWriter("test.txt", true)) {
            fw.write("Añadir esta línea al final\n");
        }

        System.out.println("Contenido tras append:");
        ejemploLeerLineas("test.txt");

        // Leer un solo carácter del archivo
        try (FileReader fr = new FileReader("test.txt")) {
            int caracter = fr.read(); // Lee un carácter (devuelve su código int)
            System.out.println("Primer carácter leído: " + (char) caracter);
        }
    }

    // Ejemplo de uso de File, FileReader, BufferedReader
    public static void ejemploFileReaderBufferedReader() throws IOException {
        File file = new File("test.txt"); // ruta/archivo
        FileReader fr = new FileReader(file); // lee caracteres
        BufferedReader br = new BufferedReader(fr); // lee con buffer y readLine()

        System.out.println("Contenido del archivo:");
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }

    // Ejemplo de uso de File, FileWriter, BufferedWriter
    public static void ejemploFileWriterBufferedWriter() throws IOException {
        File file = new File("test.txt"); // ruta/archivo
        FileWriter fw = new FileWriter(file); // escribe caracteres
        BufferedWriter bw = new BufferedWriter(fw); // escribe con buffer

        bw.write("Hola mundo");
        bw.newLine();
        bw.write("Otra línea");
        bw.close();
    }

    // Ejemplo de uso de FileInputStream y FileOutputStream (trabajan con bytes)
    public static void ejemploFileInputOutput() throws IOException {
        File file = new File("archivoBytes.bin");

        // Escribir bytes en un fichero                        //appent true quiere decir que se añade al final del archivo y no se sobreescribe
        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            String texto = "Texto en bytes para FileOutputStream";
            fos.write(texto.getBytes("UTF-8"));
        }

        // Leer bytes del fichero y mostrarlos como texto
        try (FileInputStream fis = new FileInputStream(file)) {
            int valor;
            while ((valor = fis.read()) != -1) {
                System.out.print((char) valor);
            }
            System.out.println();
        }
    }

    public static void EscribirObjetoSerializable() {
        String nombreFichero = "persona.dat";

        try (FileOutputStream fos = new FileOutputStream(nombreFichero);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            
            // Creamos varios objetos
            PersonaSerializable persona1 = new PersonaSerializable("Ana", 25, "Madrid");
            PersonaSerializable p2 = new PersonaSerializable("Luis", 30, "Barcelona");  
            PersonaSerializable p3 = new PersonaSerializable("Marta", 28, "Valencia");  

            // Escribimmos los objetos en el fichero
            oos.writeObject(persona1);
            oos.writeObject(p2);
            oos.writeObject(p3);

            System.out.println("Objetos escritos en el ficher correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public static void crearObjetosSerializable() {
        String fichero = "persona.dat";
        try (FileInputStream fis = new FileInputStream(fichero);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            
            while (true) { 
                try {
                    PersonaSerializable p = (PersonaSerializable) ois.readObject();
                    System.out.println("Persona leída: " + p.getNombre() + ", Edad: " + p.getEdad() + ", Ciudad: " + p.getCiudad());
                } catch (EOFException e) {
                    System.out.println("Fin del archivo.");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

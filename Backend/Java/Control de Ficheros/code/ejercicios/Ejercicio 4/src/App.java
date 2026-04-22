import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
 
public class App {
    /*Haz un programa que pida al usuario la ruta de dos archivos y muestre por pantalla (sin repeticiones) 
    aquellas palabras que son comunes en ambos archivos. Los archivos pueden tener diferentes líneas. Las palabras están separadas siempre por espacios.
 */
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        File archivo1;
        File archivo2;
        String rutaArchivo1;
        String rutaArchivo2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del primer archivo: ");
        rutaArchivo1 = scanner.nextLine();
        System.out.print("Introduce la ruta del segundo archivo: ");
        rutaArchivo2 = scanner.nextLine();
        if (rutaArchivo1.trim().isEmpty() || rutaArchivo1.trim().equalsIgnoreCase("null") ||
            rutaArchivo2.trim().isEmpty() || rutaArchivo2.trim().equalsIgnoreCase("null")) {
            System.out.println("Ruta no válida. El programa se cerrará.");
            return;
        } else {
            File f1 = new File(rutaArchivo1);
            File f2 = new File(rutaArchivo2);
            if (!f1.exists() || !f1.isFile() || !f2.exists() || !f2.isFile()) {
                System.out.println("Uno o ambos archivos no existen o no son archivos válidos. El programa se cerrará.");
                return;
            }
    }

    try {
        String contenidoArchivo1 = "";
        String contenidoArchivo2 = "";
        BufferedReader br1 = new BufferedReader(new FileReader(rutaArchivo1));
        BufferedReader br2 = new BufferedReader(new FileReader(rutaArchivo2));
        while (br1.readLine() != null) {
            contenidoArchivo1 += br1.readLine();
            while (br2.readLine() != null) {
                contenidoArchivo2 += br2.readLine();

                if (contenidoArchivo1.trim().toLowerCase().equals(contenidoArchivo2.trim().toLowerCase())){
                    System.out.println("Palabra común encontrada: " + contenidoArchivo1.trim());
                }
            }
        }
    } catch (Exception e) {
        // TODO: handle exception
    }

}
}
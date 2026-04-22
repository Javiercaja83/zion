import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import clases.Pedidos;
 
public class App {
    /*Haz un programa que pida al usuario la ruta de dos archivos y muestre por pantalla (sin repeticiones) 
    aquellas palabras que son comunes en ambos archivos. Los archivos pueden tener diferentes líneas. Las palabras están separadas siempre por espacios.
 */
    public static void main(String[] args)  {
   escribirPedidos();
}

    public static void escribirPedidos() {
        
        Path carpeta  = Paths.get("pedidos");
        Path archivo = carpeta.resolve("pedidos.txt");

        try {
            Files.createDirectories(carpeta);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo.toFile()) )){
                Pedidos pedido1 = new Pedidos("Juan", "123456789", "Calle Falsa 123", null);
                Pedidos pedido2 = new Pedidos("María", "987654321", "Avenida Siempre Viva 456", null);
                oos.writeObject(pedido1);
                oos.writeObject(pedido2);

                System.out.println("Pedidos escritos en el archivo.");
            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

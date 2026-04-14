import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import clases.GestorGastos;
import clases.Usuario;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario:");
        String nombre = scanner.nextLine();
        System.out.println("introduce el email del usuario:");
        String email = scanner.nextLine();
        System.out.println("Introduce la edad del usuario:");
        int edad =scanner.nextInt();
        Usuario usuario = new Usuario(nombre, email, edad);
  
        GestorGastos gestorGastos = new GestorGastos();
        gestorGastos.crearUsuario(usuario);
        gestorGastos.leerUsuarios();
    }
}
/*
3. En `App.java`, pide al usuario por consola el nombre, el email y la edad.
   - Crea un objeto `Usuario` con esos datos.
   - Usa `GestorUsuarios` para escribir el usuario en el fichero.
   - Después, lee el fichero y muestra todos los usuarios en consola.
*/
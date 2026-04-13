import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca texto por favor:");
            String texto = scanner.nextLine();

            Path archivo = Paths.get("src", "usuarios.txt");
            Files.createDirectories(archivo.getParent());

            try (FileOutputStream fos = new FileOutputStream(archivo.toFile())) {
                fos.write(texto.getBytes(StandardCharsets.UTF_8));
            }

            System.out.println("Archivo guardado en: " + archivo.toAbsolutePath());
            System.out.println("Leyendo el archivo con FileInputStream...");

            try (FileInputStream fis = new FileInputStream(archivo.toFile())) {
                byte[] buffer = new byte[1024];
                int bytesLeidos;
                while ((bytesLeidos = fis.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, bytesLeidos, StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

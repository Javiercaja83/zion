package clases;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GestorGastos {
    public void crearUsuarioEjemplo() {
        try {
            Usuario usuario = new Usuario("Juan", "Juan@email.com", 24);
            String usuarioData = usuario.getNombre() + "," + usuario.getEmail() + "," + usuario.getEdad() + "\n";
            
            // Crear FileOutputStream para escribir en el archivo
            FileOutputStream fos = new FileOutputStream("usuarios.txt", true); // 'true' para append
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            bos.write(usuarioData.getBytes());
            bos.close(); // Cierra el stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearUsuario(Usuario usuario){
        try {
            String usuarioData = usuario.getNombre() + ", " +  usuario.getEmail() + ", " + usuario.getEdad() + "\n";
            FileOutputStream fos = new FileOutputStream("usuarios.txt", true);
            fos.write(usuarioData.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerUsuarios() {
        try (FileInputStream fis = new FileInputStream("usuarios.txt")) {
            int caracter;
            while ((caracter = fis.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

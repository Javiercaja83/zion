package clases;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorGastos {
    public void crearGasto(){
        File usuariosFile = new File("usuarios.txt");
        Path path = Paths.get("Backend\\Java\\Control de Ficheros\\code\\ejercicios\\Ejercicio 2\\src", usuariosFile.getPath());

        try () {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

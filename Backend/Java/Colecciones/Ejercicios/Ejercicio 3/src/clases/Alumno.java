package clases;
import  Interfaces.*;
import clases.Persona;

public class Alumno extends Persona implements Registable{

    public Alumno(String nombre, int id) {
        super(nombre, id);
    }

    @Override
    public void matricularAsignatura(String asignarura) {

    }

    @Override
    public void listarAsignaturas() {
        
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() +
        "\nID: " + getId());
    }

    private String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}

import  java.io.Serializable;

public class PersonaSerializable implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private int edad;
    private  String ciudad;

    public PersonaSerializable(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonaSerializable{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }

    
}

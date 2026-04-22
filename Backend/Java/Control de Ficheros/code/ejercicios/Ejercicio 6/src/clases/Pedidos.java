package clases;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Pedidos implements Serializable{
    String nombre;
    String telefono;
    String direccion;
    LocalDateTime fechaHora;

    public Pedidos(String nombre, String telefono, String direccion, LocalDateTime fechaHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}

package Clases;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate fechaDeRegistro;
    private int rachaActual;
    private LocalDate ultimaDiaActivo;

    public Usuario(){ }

    public Usuario(String nombre, LocalDate fechaDeRegistro, int rachaActual, LocalDate ultimoDiaActivo) {
        this.nombre = nombre;
        this.fechaDeRegistro = fechaDeRegistro;
        this.rachaActual = rachaActual;
        this.ultimaDiaActivo = ultimoDiaActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public int getRachaActual() {
        return rachaActual;
    }

    public void setRachaActual(int rachaActual) {
        this.rachaActual = rachaActual;
    }

    public LocalDate getUltimaDiaActivo() {
        return ultimaDiaActivo;
    }

    public void setUltimaDiaActivo(LocalDate ultimaDiaActivo) {
        this.ultimaDiaActivo = ultimaDiaActivo;
    }


    /**
     * Incrementa la racha de días activos consecutivos del usuario.
     * 
     * Si el usuario fue activo el día anterior (últimaDiaActivo + 1 día = fechaActual),
     * incrementa el contador de racha actual. En caso contrario, reinicia la racha a 1.
     * 
     * @param fechaActual la fecha actual del sistema
     */
    public void incrementarRacha(LocalDate fechaActual) {
        if (ultimaDiaActivo != null && ultimaDiaActivo.plusDays(1).equals(fechaActual)) {
            rachaActual++;
        } else {
            rachaActual = 1; // Reiniciar la racha si no es un día consecutivo
        }
        ultimaDiaActivo = fechaActual; // Actualizar el último día activo
    }

    public boolean esNuevoDia(LocalDate fechaActual) {
        boolean esNuevoDia = ultimaDiaActivo == null || !ultimaDiaActivo.equals(fechaActual);
        return esNuevoDia;
    }

    public void marcarAlbumComoEscuchado(Album albumEscuchado) {
        if (albumEscuchado == null || albumEscuchado.isEscuchado()) {
            System.out.println("❌ Álbum no encontrado o ya marcado como escuchado.");
        } else {
            albumEscuchado.setEscuchado(true);
            System.out.println("✅ Álbum marcado como escuchado.");
        }
    }
    
}

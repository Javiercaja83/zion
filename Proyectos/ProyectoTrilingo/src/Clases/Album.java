package Clases;

import java.util.LinkedList;

public class Album {
    private String titulo;
    private String artista;
    private String genero;
    private boolean escuchado;
    private LinkedList<Leccion> lecciones;

    public Album(){}

    public Album(String titulo, String artista, String genero, boolean escuchado, LinkedList<Leccion> lecciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.escuchado = escuchado;
        this.lecciones = lecciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEscuchado() {
        return escuchado;
    }

    public void setEscuchado(boolean escuchado) {
        this.escuchado = escuchado;
    }

    public void marcarComoEscuchado() {
        this.escuchado = true;
    }

    @Override
    public String toString() {
        return "Album:" + "\n"
                + "  titulo: " + "titulo " +  "\n" 
                + "  artista: " + artista + "\n" 
                + "  genero: " + genero +  "\n" + 
                "escuchado: " + escuchado;
    }

    public void agregarLeccion(Leccion leccion) {
        if (lecciones == null) {
            lecciones = new LinkedList<>();
        }
        lecciones.add(leccion);

    }

    public Leccion obtenerLeccion(int indice) {
        Leccion leccion = lecciones.get(indice);
        lecciones.poll(); 
        return leccion;
    }

    public boolean tieneLeccionesPendientes() {
        if (lecciones.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }

    public int getLeccionesTotales() {
        return lecciones.size();
    }

    public LinkedList<Leccion> getLecciones() {
        return lecciones;
    }
 public void hacerLecciones(Album album) {
        if (album.tieneLeccionesPendientes()) {
            LinkedList<Leccion> lecciones = album.getLecciones();  
            for (Leccion leccion: lecciones) {
                System.out.println("Pregunta: " + leccion.getPregunta());
                // Aquí podrías agregar lógica para que el usuario ingrese su respuesta y verificarla
                // Por ejemplo:
                String respuestaUsuario = "";
                if (respuestaUsuario.equalsIgnoreCase(leccion.getRespuestaCorrecta())) {
                     System.out.println("¡Respuesta correcta! Has ganado " + leccion.getPuntos() + " puntos.");
                 } else {
                     System.out.println("Respuesta incorrecta. La respuesta correcta es: " + leccion.getRespuestaCorrecta());
                 }            
            }
        }
    }
}

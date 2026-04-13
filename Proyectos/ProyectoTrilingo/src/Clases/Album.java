package Clases;

import java.util.LinkedList;

public class Album {
    private String titulo;
    private String artista;
    private String genero;
    private boolean escuchado;
    private LinkedList<Leccion> lecciones; // Lista ordenada de lecciones asociadas al album

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

    public void marcarComoEscuchado() { //si esta escuchado, se marca true
        this.escuchado = true;
    }

    @Override
    public String toString() { //el toString
        return "Album:" + "\n"
                + "  titulo: " + "titulo " +  "\n" 
                + "  artista: " + artista + "\n" 
                + "  genero: " + genero +  "\n" + 
                "escuchado: " + escuchado;
    }

    public void agregarLeccion(Leccion leccion) { //si no lecciones, se crea una nueva lista ordenada de lecciones y se agrega la leccion a esa lista,
                                                 //  si ya hay lecciones, se agrega la nueva leccion a la lista existente
        if (lecciones == null) {
            lecciones = new LinkedList<>();
        }
        lecciones.add(leccion);

    }

    public Leccion obtenerLeccion(int indice) {  // a traves de un indice, obtengo una leccion, la atraigo al ser el primero de la lista, lo elimino y lo retorno
        Leccion leccion = lecciones.get(indice);
        lecciones.poll(); 
        return leccion;
    }

    public boolean tieneLeccionesPendientes() { // simplemente compruebo que la lista de lecciones no este vacia, si esta vacia, no hay lecciones pendientes,
    //  si no esta vacia, hay lecciones pendientes
    //recuerda que la lista de lecciones es como una cola, una vez que el primero de la lista es llamado (poll), es eliminado de la lista,
    //  por lo que el siguiente de la lista se convierte en el primero, y asi sucesivamente hasta que la lista este vacia
        if (lecciones.isEmpty()) {
            return false;
        }else {
            return true;
        }
    }

    public int getLeccionesTotales() { // simplemente retorno el tamaño de la lista de lecciones, que es el total de lecciones asociadas al album
        return lecciones.size();
    } 

    public LinkedList<Leccion> getLecciones() {
        return lecciones;
    }

    public void hacerLecciones(java.util.Scanner scanner) {
        if (lecciones == null || lecciones.isEmpty()) {
            System.out.println("No hay lecciones pendientes para este álbum.");
            return;
        }else{
            do {
                
            Leccion leccion = lecciones.poll();
            System.out.println("Pregunta: " + leccion.getPregunta());
            String respuestaUsuario = scanner.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(leccion.getRespuestaCorrecta())) {
            System.out.println("RESPUESTA CORRECTA! Has ganado " + leccion.getPuntos() + " puntos.");    
            } else {
                System.out.println(" RESPUESTA INCORRECTA! La respuesta correcta es: " + leccion.getRespuestaCorrecta());
            }
            } while (!lecciones.isEmpty());
            

        }


    }
}

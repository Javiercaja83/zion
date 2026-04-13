package Clases;

import java.util.ArrayList;
import java.util.LinkedList;

public class Biblioteca {
   private ArrayList<Album> albums;

   public Biblioteca() {
       this.albums = new ArrayList<>();
   }

    public ArrayList<Album> getAlbums() {
         return albums;
    }

    public void agregarAlbum(Album album) {
        this.albums.add(album);
    }

    public void mostrarAlbums() {
        if (albums.isEmpty()) {
            System.out.println("No hay álbumes en la biblioteca.");
        } else {
            System.out.println("Álbumes en la biblioteca:");
            for (Album album : albums) {
                System.out.println(album);
            }
        }
    }

    public void precargarAlbums() {
        LinkedList<Leccion> lecciones = new LinkedList<>();
        lecciones.add(new Leccion("¿Cómo se dice 'Hello' en español?", "Hola", 10));
        lecciones.add(new Leccion("¿Cómo se dice 'Goodbye' en español?", "Adiós", 10));
        lecciones.add(new Leccion("¿Cómo se dice 'Thank you' en español?", "Gracias", 10));

        Album album1 = new Album("Divide", "Ed Sheeran", "Pop", false, lecciones);
        Album album2 = new Album("25", "Adele", "Pop", false, lecciones);
        Album album3 = new Album("Abbey Road", "The Beatles", "Rock", false, lecciones);
        Album album4 = new Album("Thriller", "Michael Jackson", "Pop", false, lecciones);
        Album album5 = new Album("Back in Black", "AC/DC", "Rock", false, lecciones);

        agregarAlbum(album1);
        agregarAlbum(album2);
        agregarAlbum(album3);
        agregarAlbum(album4);
        agregarAlbum(album5);
    }
}
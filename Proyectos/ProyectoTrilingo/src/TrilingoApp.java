import java.time.LocalDate;
import java.util.Scanner;

import Clases.Album;
import Clases.Biblioteca;
import Clases.Usuario;

public class TrilingoApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)   {
        Usuario usuario = new Usuario("Javier", LocalDate.now(), 0, LocalDate.now());
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.precargarAlbums();
        mostrarMenu(usuario, biblioteca);
    }

    public static void mostrarMenu(Usuario usuario, Biblioteca biblioteca) {
        int opcion;

        do {
                    System.out.println("=====================================\n" + //
                        "🎵 MUSICDUOLINGO - ¡Aprende con álbumes!\n" + //
                        "=====================================\n" + //
                        "1. Ver mi progreso y racha actual\n" + //
                        "2. Ver biblioteca de álbumes\n" + //
                        "3. Marcar álbum como escuchado\n" + //
                        "4. Reiniciar racha (para pruebas)\n" + //
                        "5. Ver detalles de un álbum\n" + //
                        "6. Salir\n" + //
                        "=====================================\n" + //
                        "Elige una opción: ");
                        try {
                            opcion = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opción inválida. Por favor, ingresa un número del 1 al 5.");
                            continue;
                        }
                        switch (opcion) {
                            case 1:
                                mostrarProgreso(usuario);
                            break;
                            case 2:
                                mostrarBiblioteca(biblioteca);
                                break;
                            case 3:
                                marcarAlbumComoEscuchado(biblioteca, usuario);
                                break;
                            case 4:
                                reiniciarRacha(usuario);
                                break;
                            case 5:
                                verDetallesAlbum(biblioteca);
                                break;
                            case 6: 
                                System.out.println("¡Gracias por usar MusicDuolingo! ¡Hasta luego!");
                                return; // Salir del programa
                            
                                default:
                                System.out.println("Opción inválida. Por favor, ingresa un número del 1 al 6.");
                        }
        } while (true);

    }

    public static void mostrarProgreso(Usuario usuario) {
        System.out.println(" ==== Progreso de " + usuario.getNombre() + " ====");
        System.out.println(usuario);
    
    }

    public static void mostrarBiblioteca(Biblioteca biblioteca) {
        System.out.println("=== Biblioteca de Albumes ===");
        for (Album album : biblioteca.getAlbums()) {
            System.out.println(album);
        }
    }

    public static void marcarAlbumComoEscuchado(Biblioteca biblioteca, Usuario usuario){
        Album albumEscuchado = null;
        System.out.println("Ingrese el título del álbum que has escuchado:");
        String titulo = scanner.nextLine();
        for (Album album : biblioteca.getAlbums()) {
            if (album.getTitulo().equalsIgnoreCase(titulo)) {
                albumEscuchado = album;
                break;
            }
        }
        if (albumEscuchado != null) {
            usuario.marcarAlbumComoEscuchado(albumEscuchado);
            System.out.println("✅ Álbum marcado como escuchado.");
        } else {
            System.out.println("❌ Álbum no encontrado.");
        }

    }

    public static void reiniciarRacha(Usuario usuario) {
        usuario.setRachaActual(0);
        System.out.println("Racha reiniciada para pruebas.");

    }

    public static void verDetallesAlbum(Biblioteca biblioteca) {
        System.out.println("mostrando albumes que no estan marcados como escuchados:");
        for (Album album : biblioteca.getAlbums()) {
            if (!album.isEscuchado()) {
                if (album.tieneLeccionesPendientes()) {
                    System.out.println("¡Tienes lecciones pendientes para este álbum!");
                    album.hacerLecciones(scanner);
                }
                System.out.println(album);
            }
        }
    }
}

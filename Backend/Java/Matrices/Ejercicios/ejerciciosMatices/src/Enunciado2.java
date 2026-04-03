import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {
        Ejercicio2();
    }

    public static void Ejercicio1() {
        Random random = new Random();
        int[][] matriz = new int[10][10];
        int min = 1;
        int max = 9;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

    }

    public static void Ejercicio2() {
        int[][] matriz = {
                { 1, 5, 2, 7 },
                { 2, 0, 1, 0 },
                { 1, 6, 0, 4 }
        };

        int[] mayoresfila = new int[matriz.length];
        int[] mayoresColumna = new int[matriz[0].length];

        /*
         * EN ESTE CASO ES RECTANGULAR JAVI CUIDAOOOOOOOOOOOOOOOOOOO
         * EN EL CASO DE SER IRREGULAR, DEBES RECORRER FILA POR FILA Y COMPROBARLO.
         */

        for (int i = 0; i < matriz.length; i++) {
            int maxFilas = matriz[0][i];
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxFilas) {
                    maxFilas = matriz[i][j];
                    mayoresfila[i] = maxFilas;
                }
            }
            mayoresfila[i] = maxFilas;
            System.out.println(Arrays.toString(mayoresfila));

        }
        // columnas
        for (int j = 0; j < matriz[0].length; j++) {
            int maxColumnas = matriz[0][j];

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] > maxColumnas) {
                    maxColumnas = matriz[i][j];
                    mayoresColumna[j] = maxColumnas;
                }
            }

            System.out.println(Arrays.toString(mayoresColumna));
        }

    }

    public static void Ejercicio3() {
        String[][] matriz = {
                { "Python", "hola", "Morse" },
                { "Java", "buenos dias", "Murcielago" },
                { "C++", "buenas tards", "Javascript" }
        };
        Scanner sc = new Scanner(System.in);
        String cadena;

        cadena = sc.nextLine();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(cadena)) {
                    System.out.println("Está en la fila " + i + " y en la columna " + j);
                }
            }
        }
    }

    public static void Ejercicio4() {
        Random random = new Random();
        int filas, columnas;
        filas = random.nextInt(10);
        columnas = random.nextInt(10);
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                System.out.println(matriz[i][j]);
            }
        }
    }

    public static void Ejercicio() {
        int tamaño = 8;
        char[][] tablero = new char[tamaño][tamaño];
        boolean[][] minas = new boolean[tamaño][tamaño];
        int buscaminas;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroMinas = 5;
        int colocadas = 0;
        int fila, col;
        int celdasSeguras = tamaño * tamaño - numeroMinas;
        int descubiertas = 0;
        boolean perdido = false;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = '-';
            }
        }
        // Colocar minas aleatorias
        while (colocadas < numeroMinas) {
            fila = random.nextInt(tamaño);
            col = random.nextInt(tamaño);

        }

        while (!perdido && descubiertas < celdasSeguras) {
            for (int i = 0; i < minas.length; i++) {
                for (int j = 0; j < minas[i].length; j++) {
                    System.out.println(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Elija fila (0-" + (tamaño - 1 + "): "));
            try {
                fila = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Formato de numero erroneo, introduzcalo de nuevo");
                return;
            }

            System.out.println("Elija columna (0-" + (tamaño - 1 + "): "));
            try {
                col = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Formato de numero erroneo, introduzcalo de nuevo");
                return;
            }

           
        }

        if (!perdido) {
            System.out.println("Has ganado");
        }

    }
}

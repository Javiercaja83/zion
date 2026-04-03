//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Declaración
        int[] numeros;

// Inicialización con tamaño fijo
        numeros = new int[5];   // {0, 0, 0, 0, 0}

// Declaración + inicialización
        int[] edades = {18, 20, 25, 30};

// Otra forma
        String[] nombres = new String[3];  // {null, null, null}

        edades[0] = 19;          // asignar valor
        int x = edades[2];       // leer valor

        int tamaño = edades.length;   // número de elementos


        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }

        for (int edad : edades) {
            System.out.println(edad);
        }


        int[][] matriz = new int[2][3];  // 2 filas, 3 columnas

        matriz[0][0] = 1;
        matriz[1][2] = 5;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
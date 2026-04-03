import java.nio.channels.Pipe.SourceChannel;
import java.util.Random;

public class Enunciado2 {
    public static void main(String[] args) {
    boolean[][] matriz = new boolean[4][4];
        Random random = new Random();
        int mitad = matriz.length / 2; //en vez de 2, se pone matriz.length / 2 para que funcione en cualquier matriz cuadrada

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextBoolean(); //esto lo he buscado, genera valores dependiendo de public o false
            System.out.println(matriz[i][j] ? "Verdadero" : "Falso");
            }
            System.out.println(); // Salto de línea para separar filas
        }

    System.out.println("----------------------------------------------");        
        for (int i =0; i < matriz.length;  i++) {
            for (int j = 0; j <= i; j++) {  //triangular
                //cambiar el valor de public a false y viceversa
                matriz[i][j] = !matriz[i][j];
               
            }
        }

        //MATRIZ MODIFICADA
        System.out.println("Matriz modificada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] ? "Verdadero" : "Falso");
            }
            System.out.println(); // Salto de línea para separar filas
        }
        System.out.println();
    }   
}

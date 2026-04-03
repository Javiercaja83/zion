import java.util.Arrays;

public class SimulacroExamen {
    public static void main(String[] args) {
        String[] matriculas = {
            "Ana,11111111A,18,6,GM",
            "Juan,11111111B,25,3,GS",
            "Sonia,22222222A,42,6,GS",
            "Pepe,22222222B,21,2,Gm",
            "Lucas,11111111B,32,2,gs",
            "Lola,33333333B,32,4,gs",
            "Lucas,33333333B,32,2,gs" };

        String[] nombres = new String[matriculas.length];
        String[] dnis = new String[matriculas.length];
        String[] edad = new String[matriculas.length];
        String[] modulos = new String[matriculas.length];
        String[] grado = new String[matriculas.length];
        String[] dnisRepetidos = new String[matriculas.length];

        for (int i = 0; i < matriculas.length; i++) {
            nombres[i] = matriculas[i].split(",")[0];
            dnis[i] = matriculas[i].split(",")[1];
            edad[i] = matriculas[i].split(",")[2];
            modulos[i] = matriculas[i].split(",")[3];
            grado[i] = matriculas[i].split(",")[4];
       
        }   

        for (int i = 0; i < dnis.length; i++) {
            for (int j = 1; j < dnis.length; j++) {
                if (dnis[i].equals(dnis[j])) {
                dnisRepetidos[i] = dnis[i];
                }
            }
        }
        
        System.out.println("DNI Repetidos: " + Arrays.toString(dnisRepetidos) );
    }
    
    }

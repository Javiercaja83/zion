import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Colecciones {
    public static void main(String[] args) { //este numero establece como limite de capacidad de esta lista son 100 elementos
        ArrayList<String> al = new ArrayList<>(100);
        HashMap<String, String> hm = new HashMap<>();
        //en el hashmap se pueden poner repetidos pero no se pueden repetir las claves, es decir, el valor de la clave se va a sobreescribir
        TreeMap<String, String> tm = new TreeMap<>();
        //en el treemap no se pueden poner repetidos pero no se pueden repetir las claves, 
        // es decir, el valor de la clave se va a sobreescribir, ademas el treemap ordena las claves de forma alfabetica
        LinkedList<String> q = new LinkedList<>();
        //en la cola no se pueden poner repetidos pero no se pueden repetir las claves,
        //  es decir, el valor de la clave se va a sobreescribir, ademas el treemap
        //como en una lista se puede poner repetidos, probamos a mtr 3 elementos
        al.add("Elemento 2");
        al.add("Elemento 2");
        al.add("Elemento 2");

        for(String cadena: al){
            System.out.println(cadena);
        }

    }
}

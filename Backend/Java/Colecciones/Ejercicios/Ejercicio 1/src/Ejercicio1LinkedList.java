import java.util.Iterator;
import java.util.LinkedList;

public class Ejercicio1LinkedList {
    public static void main(String[] args) {
        LinkedList<String> listaNombres = new LinkedList<>();
        listaNombres.addFirst("Juan");
        listaNombres.addFirst("Maria");
        listaNombres.add("Carlos");
        listaNombres.add("Irene");
        listaNombres.add("Manuel");
        listaNombres.add(4, "Sofia");
        for (String string : listaNombres) {
            System.out.println(string);
        }
        Iterator<String> iterator = listaNombres.iterator();
        //Un itenador es un objeto que nos permite recorrer una colección de elementos, como una lista, sin exponer su estructura interna.
        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }
        
        System.out.println(listaNombres); // Ejemplo de uso
    }
}

1. Ejercicios con LinkedList

Básico
Crea una LinkedList<String> de nombres de personas. Añade 6 nombres (3 al final con add(), 2 al principio con addFirst() y 1 en una posición concreta con add(index, element)).
Imprime la lista completa usando un bucle for-each y luego con un Iterator.
Operaciones intermedias
A partir de la lista anterior:
Elimina el elemento en la posición 2.
Elimina el primer y último elemento (removeFirst() y removeLast()).
Busca si existe un nombre concreto con contains().
Convierte la LinkedList a un array con toArray().

Uso avanzado de Iterator
Recorre la LinkedList con Iterator y elimina todos los nombres que empiecen por la letra "A" (usa it.remove()).
¿Qué pasa si intentas eliminar con un bucle for-each en vez de Iterator?
Simulación de cola
Usa LinkedList como una cola (FIFO): añade 5 tareas, procesa (elimina) la primera tarea 3 veces usando poll() o removeFirst().

2. Ejercicios con HashMap

Básico
Crea un HashMap<String, Integer> donde la clave sea el nombre de un producto y el valor su precio. Añade al menos 8 productos.
Imprime todas las claves, todos los valores y todas las entradas (key-value).
Iteración con Iterator
Recorre el HashMap de 3 formas diferentes:
Con keySet() + Iterator
Con entrySet() + Iterator
Con for-each sobre entrySet() (forma recomendada moderna)

Operaciones útiles
Obtén el precio de un producto (usa get() y getOrDefault()).
Actualiza el precio de un producto si existe (usa replace()).
Elimina todos los productos cuyo precio sea menor a 10 usando Iterator sobre entrySet().

Contador de palabras (clásico)
Dada una frase (String), cuenta cuántas veces aparece cada palabra usando HashMap<String, Integer>.
Ignora mayúsculas/minúsculas y signos de puntuación básicos.

3. Ejercicios con TreeMap

Básico + ordenación
Crea un TreeMap<String, String> donde la clave sea el nombre de un país y el valor su capital. Añade 8 países desordenados.
Imprime el mapa: verás que las claves salen ordenadas alfabéticamente (porque TreeMap ordena por clave).
Comparador personalizado
Crea un TreeMap<Integer, String> que ordene las claves de mayor a menor (usa un Comparator en el constructor).
Añade números y sus nombres en español (1 → "uno", 10 → "diez", etc.).
Submapas
Usando el TreeMap de países:
Obtén un submapa con los países entre "España" y "México" (inclusive) usando subMap().
Obtén el primer y último país (firstKey(), lastKey(), firstEntry(), lastEntry()).

Iteración
Recorre el TreeMap con Iterator sobre entrySet() y muestra clave y valor.

4. Ejercicios combinados (los más importantes para aprender)

Agenda telefónica
Crea una agenda usando HashMap<String, LinkedList<String>>:
Clave = nombre de persona
Valor = lista de sus números de teléfono (puede tener varios).
Añade contactos, añade/quita números a un contacto, y recorre toda la agenda usando Iterator.

Diccionario ordenado
Usa TreeMap<String, String> para un diccionario inglés-español.
Añade palabras, luego permite al usuario buscar una palabra y mostrar su traducción.
Muestra todas las palabras en orden alfabético.
Eliminar durante iteración (prueba clave)
Crea un HashMap<String, Integer> de estudiantes y sus notas.
Recorre el mapa y elimina todos los estudiantes con nota menor a 5 usando Iterator.
Intenta hacerlo también con un for-each y observa qué error da.
Rendimiento y diferencias
Crea una LinkedList y un ArrayList con 100.000 elementos.
Mide el tiempo que tarda en añadir 10.000 elementos al principio de cada uno.
Haz lo mismo con HashMap y TreeMap añadiendo y buscando elementos (comenta las diferencias de rendimiento).

Consejos para estudiar mejor:

Siempre importa: import java.util.*;
Practica Iterator especialmente cuando necesites eliminar elementos mientras recorres.
Recuerda las diferencias:
LinkedList: buena para añadir/eliminar al principio/final.
HashMap: rápido, sin orden.
TreeMap: ordenado por clave (más lento, O(log n)).

Usa entrySet() cuando necesites tanto clave como valor al iterar.

¿Quieres que te dé la solución completa de alguno de estos ejercicios (con código)?
Dime cuál quieres primero (por ejemplo: "el contador de palabras" o "la agenda con LinkedList dentro del HashMap") y te lo explico paso a paso con código bien comentado.
¡A practicar! Si haces estos ejercicios, dominarás muy bien estas colecciones. 🚀
¿Empezamos por alguno en concreto?1.7sFast
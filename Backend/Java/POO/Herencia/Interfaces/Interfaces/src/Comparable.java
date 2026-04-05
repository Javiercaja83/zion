public interface Comparable<T> {
    int compareTo(T other); //parametros tipo T, devuelve un entero
     // Por ejemplo, la clase que implemente Comparable<Empleado> debera poseer el metodo compareTo(Empleado other) que compare dos objetos Empleado y devuelva un entero indicando
     //  su orden relativo.

     //Puedes utilizar el tipo generico T sin un tipo espeficico, pero tendras que castear manualmente el paratemtro de ComparteTo al tipo deseado, lo cual puede ser propenso a errores 
     // en tiempo de ejecucion si no se hace correctamente.

     //Todos los metodos de una interfaz son publicos de manera automatica, por esta razon no es necesario declarar con la palabra clave "public" en los metodos de una interfaz.
     //  Sin embargo, es una buena practica incluir la palabra clave "public" para mejorar la legibilidad y claridad del codigo,
     //  indicando claramente que el metodo es accesible desde cualquier parte del programa.

     //Este metodo en particular utiliza un metodo, pero se permite definir muchos mas, incluyendo definiciones de constantes

     //Las interfaces en Java nunca tienen archivos instanciables, es decir, no se pueden crear objetos directamente de una interfaz. 
     // En su lugar, las interfaces se implementan en clases concretas que proporcionan la funcionalidad definida por la interfaz.

     //De primeras puede parecer que las interfaces son similares a las clases abstractas, pero hay diferencias clave entre ellas:
     // -Las interfaces solo pueden contener metodos abstractos (sin implementacion) y constantes, 
     // mientras que las clases abstractas pueden contener tanto metodos abstractos como metodos con implementacion, ademas de variables de instancia.
    
     //- Las interfaces se utilizan principalmente para definir un contrato que las clases deben seguir, 
    // mientras que las clases abstractas se utilizan para compartir codigo comun entre clases relacionadas.
    
    } 
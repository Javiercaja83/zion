# Ejercicio 2 - Control de ficheros con objetos

## Enunciado

Crea una pequeña aplicación Java orientada a objetos que gestione información de usuarios y guarde los datos en un fichero de texto.

### Requisitos

1. Define una clase `Usuario` con al menos estos atributos:
   - `String nombre`
   - `String email`
   - `int edad`

2. Define una clase `GestorUsuarios` que tenga las siguientes responsabilidades:
   - crear un fichero dentro de `src` (por ejemplo, `usuarios.txt`)
   - guardar uno o varios usuarios en el fichero
   - leer el fichero y mostrar por consola los usuarios cargados

3. En `App.java`, pide al usuario por consola el nombre, el email y la edad.
   - Crea un objeto `Usuario` con esos datos.
   - Usa `GestorUsuarios` para escribir el usuario en el fichero.
   - Después, lee el fichero y muestra todos los usuarios en consola.

### Detalles adicionales

- El fichero debe guardarse en la carpeta `src` del proyecto.
- Usa `Path`, `Files`, `BufferedReader` y `BufferedWriter` para trabajar con el fichero.
- Formatea la salida de cada usuario como:
  - `Nombre: <nombre>, Email: <email>, Edad: <edad>`

### Ejemplo de flujo

1. Ejecutar el programa.
2. El programa pregunta:
   - `Introduce el nombre:`
   - `Introduce el email:`
   - `Introduce la edad:`
3. El programa guarda el usuario en `src/usuarios.txt`.
4. El programa lee el fichero y muestra todos los usuarios.

### Sugerencia de estructura

- `src/Usuario.java`
- `src/GestorUsuarios.java`
- `src/App.java`

> Este ejercicio comienza a meter objetos y separar responsabilidades: la clase `Usuario` representa los datos, y la clase `GestorUsuarios` se encarga del acceso al fichero.

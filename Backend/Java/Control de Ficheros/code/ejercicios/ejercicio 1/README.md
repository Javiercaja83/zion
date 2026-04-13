## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Ejercicio: lectura y escritura de archivos con BufferedReader / BufferedWriter

Crea un programa Java que:

1. Pida al usuario el nombre de un archivo de texto de entrada y otro de salida.
2. Abra el archivo de entrada y lea su contenido línea por línea usando `BufferedReader`.
3. Para cada línea leída:
   - conviértela a mayúsculas,
   - elimina espacios en blanco al inicio y al final,
   - escribe la línea resultante en el archivo de salida usando `BufferedWriter`.
4. Al finalizar, muestra en consola:
   - cuántas líneas se han leído,
   - cuántas líneas se han escrito,
   - y el nombre del archivo de salida.

### Requisitos

- Usa `BufferedReader` para leer el archivo de entrada.
- Usa `BufferedWriter` para escribir en el archivo de salida.
- Maneja posibles excepciones de E/S con `try-with-resources`.
- No uses bibliotecas externas; usa solo la API estándar de Java.

### Extensión opcional

Puedes mejorar el programa para que también:

- ignore líneas vacías,
- cuente cuántas palabras totales se han procesado,
- o copie solo las líneas que contengan un texto específico.

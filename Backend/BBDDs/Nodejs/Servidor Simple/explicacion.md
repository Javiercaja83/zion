# Explicación del Servidor Node.js

---

## 1️⃣ Importar el módulo HTTP

```js
const http = require('http');
```
Importa el módulo `http` de Node.js, que permite crear servidores web y manejar solicitudes HTTP.  
Este módulo ofrece métodos como `createServer()`.

---

## 2️⃣ Definir Host y Puerto

```js
const hostname = '127.0.0.1';
const port = 3000;
```
- **hostname:** Dirección donde el servidor escuchará (IP local `127.0.0.1` = localhost).
- **port:** Puerto donde el servidor estará disponible (puedes usar cualquier número libre entre 1024 y 65535).

---

## 3️⃣ Crear el servidor

```js
const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('¡Hola, mundo!\n');
});
```
- **http.createServer:** Crea el servidor y recibe una función callback que se ejecuta en cada solicitud.
- **req (request):** Información sobre la solicitud (URL, headers, método, etc.).
- **res (response):** Permite enviar la respuesta al cliente.

**Dentro del callback:**
- `res.statusCode = 200;` → Código de estado HTTP (200 = OK).
- `res.setHeader('Content-Type', 'text/plain');` → Tipo de contenido (texto plano).
- `res.end('¡Hola, mundo!\n');` → Envía la respuesta y finaliza la comunicación.

---

## 4️⃣ Iniciar el servidor

```js
server.listen(port, hostname, () => {
  console.log(`Servidor corriendo en http://${hostname}:${port}/`);
});
```
- **server.listen:** Hace que el servidor empiece a escuchar en la IP y puerto indicados.
- El tercer argumento es una función callback que se ejecuta cuando el servidor está listo.
- `console.log(...)` imprime un mensaje en la terminal para confirmar que todo funciona.

---

## 5️⃣ Resumen conceptual

1. Importas el módulo `http`.
2. Defines dónde y cómo escuchar.
3. Creas un servidor que responde “¡Hola, mundo!” a cada solicitud.
4. Inicias el servidor para que empiece a escuchar.

---

## 6️⃣ ¿Qué hace `res.end()`?

`res.end()` finaliza la respuesta HTTP y la envía al cliente.
...existing code...

---

## 7️⃣ ¿Qué es un callback?

Un **callback** es una función que se pasa como argumento a otra función y que se ejecuta cuando ocurre un evento o termina una operación.

**En Node.js:**  
El callback se usa para definir qué debe hacer el servidor cada vez que recibe una solicitud.

**Ejemplo:**
```js
const server = http.createServer((req, res) => {
  // Esta función es el callback
  res.end('¡Hola, mundo!');
});
```
Aquí, la función `(req, res) => { ... }` es el **callback** que se ejecuta cada vez que el servidor recibe una petición.

**Resumen:**  
Un **callback** es como un órgano dentro de un cuerpo:  
La función principal (el cuerpo) llama al callback (el órgano) para que haga su trabajo cuando lo necesita.  
El callback no funciona solo, sino que vive y se ejecuta dentro de otra función.

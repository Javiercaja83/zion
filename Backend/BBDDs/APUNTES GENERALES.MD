# Apuntes Generales

---

## 1️⃣ Diferencia entre Host y Puerto

**Host / Hostname:**  
Es la dirección de la máquina donde está el servidor.  
Puede ser:
- `127.0.0.1` (localhost, tu propia máquina)
- Una IP pública (ej: `192.168.x.x`)
- Un dominio (ej: `midominio.com`)

**Piensa en el host como “dónde está el servidor”.**

**Puerto:**  
Es un número que identifica un servicio específico dentro de esa máquina.  
Una misma máquina puede tener varios servicios en diferentes puertos. Ejemplos:
- HTTP: puerto `80`
- HTTPS: puerto `443`
- Tu servidor: puerto `3000`

**Piensa en el puerto como “la puerta concreta por la que entra la solicitud”.**

> 💡 **Analogía:**  
> El host es la casa, el puerto es la puerta. Para entrar necesitas saber cuál casa y qué puerta.

---

## 2️⃣ Request y Response

**Request (`req`):**  
Es lo que el cliente pide al servidor.  
Incluye información como:
- URL (`req.url`)
- Método HTTP (`GET`, `POST`, etc.)
- Headers (cookies, tipo de contenido, etc.)

**Ejemplo:**  
Cuando escribes `http://localhost:3000/`, tu navegador envía un request:  
“Quiero `/` usando el método `GET`”.

**Response (`res`):**  
Es lo que el servidor devuelve al cliente.  
Puedes configurar:
- Código de estado (`res.statusCode = 200`)
- Headers (`res.setHeader(...)`)
- Contenido (`res.end(...)`)

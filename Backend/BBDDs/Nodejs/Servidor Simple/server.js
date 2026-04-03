//server js
const http = require('http');

const hostname = '127.0.0.1'; //localhost, es decir, el equipo qu está ejecutando el servidor
const port = 3000; //puerto de comunicación, puede ser cualquier número entre 0 y 65535, pero los puertos por debajo de 1024 están reservados para servicios específicos

//crear el servidor
//el método createServer recibe como parámetro una función callback que se ejecuta cada vez que el servidor recibe una petición
//esta función recibe dos parámetros: req (request) y res (response)

const server = http.createServer((req, res) => {
    res.statuscode = 200; //código de estado HTTP 200 = OK
    res.setHeader('Content-Type', 'text/plain');    //tipo de contenido que se va a enviar al cliente
    res.end('Hola familia!!!!\n'); //finaliza la respuesta y envía el contenido al cliente
});

//poner el servidor a escuchar en el puerto y hostname especificados
server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`); //mensaje que se muestra en la consola cuando el servidor está corriendo
})
-- Ejercicio 3 --

Haz un programa que reciba la ruta de una carpeta con datos de pedidos de un restaurante y los convierta a formato objeto, almacenándolos en una colección. Esa carpeta tendrá 2 subcarpetas: "pedidos" y "productos". En la carpeta "pedidos" habrá un archivo TXT por cada pedido realizado en el restaurante, que contendrá: nombre del cliente, teléfono de contacto, dirección de entrega y tiempo de realización (fecha y hora). En la carpeta "productos" también habrá un archivo TXT por cada pedido, pero contendrá el listado de productos y unidades de cada producto solicitados.

Todos los archivos de "pedidos" se llamarán "pedido1.txt", "pedido2.txt", "pedido3.txt"... Todos los archivos de "productos" se llamarán "productos_p1.txt", "productos_p2.txt", "productos_p3.txt"...

Los archivos de "pedidos" tendrán este formato:

Nombre
Teléfono
Dirección
AÑO-MES-DÍA HORA:MINUTO

Por ejemplo:

Juan
675119552
Calle Roble 31
2026-04-20 21:05

Y luego, los achivos de "productos" tendrán este formato:

Producto 1-Unidades
Producto 2-Unidades
Producto 3-Unidades
...

Por ejemplo:

Pizza napolitana-1
Pizza barbacoa-1
Nestea-3

Entonces, si a estos dos archivos los queremos vincular (es decir, Juan ha pedido las dos pizzas y las tres bebidas), los llamaremos "pedido1.txt" y "productos_p1.txt".

Con esta información, la aplicación debe construir objetos y guardarlos en una lista, conjunto, mapa... (lo que consideres). Piensa qué clases crearías y luego implementa el código.


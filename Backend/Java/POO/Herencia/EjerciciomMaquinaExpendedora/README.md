Crea una aplicación que permita gestionar el funcionamiento de una máquina expendedora.

La máquina ofrece productos de diferentes ámbitos: comida, electrónica y utilidad.

Un producto comestible tiene código (el que se teclearía para seleccionarlo), precio en euros, nombre, fecha de caducidad y kilocalorías (energía que aporta).

Un producto electrónico tiene código (el que se teclearía para seleccionarlo), precio en euros, nombre y especificaciones técnicas (textos separados, que refieren al color, capacidad de almacenamiento, capacidad de la batería, tipo de puerto... características propias, algunos con más, otros con menos).

Un producto de utilidad tiene código (el que se teclearía para seleccionarlo), precio en euros y nombre.

La máquina tiene 4 órdenes, que deberán ponerse a disposición del usuario en todo momento:
  -> Insertar dinero: se indican los billetes y monedas mediante un String con la estructura "CANT[€c],CANT[€c],CANT[€c],...". Es decir, por ejemplo, si se quiere introducir 2,5 euros en dos monedas de 1 euro más 1 de 50 céntimos, se tendría que poner "1€,1€,50c". En caso de que este formato no se cumpla, no se admitirá, y solo se permiten billetes de 50, 20, 10 o 5 euros, así como monedas de 50, 20, 10, 5, 2 o 1 céntimos.
  -> Devolver dinero: la máquina devuelve todo el dinero que haya insertado el cliente hasta el momento.
  -> Seleccionar producto: si quedan existencias del producto, se ha insertado el dinero necesario y tiene dinero suficiente para dar el cambio, entonces da una unidad del producto al cliente y acumula el efectivo, así como da las vueltas, si es que hay que darlas.
  -> Apagar: si hay dinero insertado, lo devuelve, y después se apaga (se termina la aplicación).

Inicialmente, la máquina cuenta con:
  -> 3 unidades de 2 productos de cada tipo (créalos con los datos que quieras; ejemplos de productos: chocolatina, frutos secos, auricular, cargador, pañuelos de papel, toallitas...).
  -> Para cambio, tiene en su depósito interno:
     >> 2 billetes de cada tipo (50, 20, 10 y 5)
     >> 10 monedas de cada tipo (50, 20, 10, 5, 2 y 1)

Desarrolla una aplicación que permita jugar a un juego sencillo de cartas.

Este juego será de dos jugadores: usuario (azul) contra la máquina (rojo). Ellos no elegirán sus cartas, sino que se les repartirá un montón (la mitad del mazo para cada uno) e irán echando por turnos la de la cima en el medio. En función de la carta que saquen, ganarán o perderán puntos. El jugador con más puntos cuando ambos se queden sin cartas gana la partida.

Las cartas tienen un valor del 1 al 5 y un color: rojo o azul. Además, hay cartas "potenciadas": son iguales que las normales, pero tienen un símbolo en las esquinas, que puede ser: "+1" o "x2". Cuando se saca una carta normal, si su color coincide con el del jugador, este gana tantos puntos como indique el valor numérico. Si no, no ocurre nada y se pasa turno. En el caso de que sea una "potenciada", se aplica exactamente la misma dinámica, solo que también...
  - Si es "+1", se suma 1 extra.
  - Si es "x2", se suma el doble de lo que vale.

Por otro lado, hay cartas "especiales". Estas no tienen valor ni color. Pueden ser: "repetir" o "regresar". Si es "repetir", el jugador puede volver a tirar carta en su turno, mientras que si es "regresar", la carta echada vuelve al montón, debajo del todo, transformada en una carta normal con valor y color aleatorios.

La baraja tendrá un número par de cartas. Para hacer un ejemplo del juego, pondremos:
  - 5 cartas azules del 1 al 5 (x2)
  - 5 cartas rojas del 1 al 5 (x2)
  - 5 cartas azules "potenciadas" con "+1"
  - 5 cartas azules "potenciadas" con "x2"
  - 5 cartas rojas "potenciadas" con "+1"
  - 5 cartas rojas "potenciadas" con "x2"
  - 2 cartas "especiales" de "repetir"
  - 2 cartas "especiales" de "regresar"

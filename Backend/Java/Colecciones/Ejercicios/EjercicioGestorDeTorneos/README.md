Crea una aplicación que gestione los partidos de un torneo deportivo.

Los equipos quedan conformados por jugadores, de los cuales se sabe su número (el de la camiseta), género, nombre y apellidos (por separado).

Un equipo tiene un nombre único y debe estar registrado en una localidad concreta.

Un partido enfrenta a dos equipos y se lleva a cabo en una fecha concreta, a una hora determinada, en un campo/estadio (se necesita apuntar el nombre y la dirección).

El partido acaba con un resultado: marcador con los puntos que ha obtenido cada equipo.

La aplicación deberá crear los equipos (datos generados con IA o insertados manualmente) y partidos de torneos, asignando, a partir de la fecha actual de la máquina, 2 partidos cada sábado (1 por la mañana a las 12h y otro por la tarde a las 16h). La forma de organizarse sería en árbol, como se explica con este ejemplo:

- Hay 8 grupos
- Primer sábado: G1 vs G2 por la mañana y G3 vs G4 por la tarde.
- Segundo sábado: G5 vs G6 por la mañana y G7 vs G8 por la tarde.

Después, se actualizaría la información con los resultados y se podría volver a organizar:

- Tercer sábado: G1 vs G3 por la mañana.
- Cuarto sábado: G5 vs G7 por la mañana.

Una vez más, se actualiza y reorganiza:

- Quinto sábado: G1 vs G5 por la mañana.

Y ya, cuando haya ganador del torneo, se pararía.

# Joker

## Trabajo de Fin de Master - Iowa Gambling Task 

Como herramienta utilizaremos el programa Joker, hemos tenido muy en cuenta los principios básicos del funcionamiento de la Iowa Gambling Task (Bechara et al., 1994) para medir el proceso de toma de decisiones en situaciones de incertidumbre, pero hemos dotado al programa de un nivel de flexibilidad muy superior, lo que le permite emular el funcionamiento de la IGT, y el diseño de tareas similares o incluso muy diferentes. La mayoría de los parámetros del programa son modificables:

- Los distintos mazos, podemos editarlos y adaptarlos a nuestras necesidades, podemos jugar con el programa de pérdidas y ganancias y con el número de cartas por mazo. También podemos alterar el "orden de presentación" de los mazos, podemos utilizar una presentación ABCD o DCAB, o cualquiera posible. Además, podemos trabajar con los mazos independientemente, es decir podemos diseñar tareas con sólo parte de los mazos, con uno (A), dos (BC), tres (ACD) o con los cuatro (DBCA).
- El saldo: podemos trabajar con un saldo inicial de 2000, pero también podemos combinar el programa de ganancias y pérdidas y el saldo para adaptar a la prueba a situaciones más reales, en las que trabajemos con cantidades asociadas a los billetes de euros más frecuentes (20, 10, 5). Además, atendiendo a las características de la prueba, el saldo puede ser visible, por lo que permite llevar el control de las ganancias o pérdidas o no-visible, más fiel a la IGT.
- Numero de jugadas que podemos variarlas.
- La cuantía de los préstamos cuando no haya saldo, es decir, el sujeto nunca pierde, en caso de quedarse a 0, se produce un préstamo automático
- Inversión del juego: invertir el programa de pérdidas o ganancias.
- Invertir el orden: normalmente se elige la primera carta del mazo, con la opción de invertir el orden podemos seleccionar la última carta del mazo durante todo el juego, eso nos permite tener dos versiones distintas de la misma programación de pérdidas-ganancias.
- Tiempo de presentación de la jugada: es el tiempo que esta visible el resultado de la jugada (Ganancia y Pérdida), recordar que para la hipótesis del marcado somático es importante el no poder llevar una cuenta precisa de los resultados. Este tiempo de retardo puede ser visible o no.
- Gambling parcial. En muchos trabajos, para tener una idea más precisa del funcionamiento de la prueba se divide está en distintos bloques, lo más usual es dividirla en bloques de 20, así podemos tener en un mismo sujeto información de cómo lleva a cabo la tarea en la jugada 20, 40, 60, 80 y 100, es decir, podemos considerar la prueba en su conjunto (100 jugadas) o podemos dividirla en cinco bloques, considerar que el sujeto hace la tarea cinco veces con 20 jugadas cada vez. En nuestro caso podríamos dividir la prueba en función de nuestras necesidades, bloques de 10, de 25, etc.
- Ruta de Ficheros: dentro de un mismo subdirectorio, podemos tener distintas programaciones, o bien podemos ubicarlas en subdirectorios diferentes.

Cuando se realiza la prueba, en la pantalla aparecerán los cuatro mazos boca abajo y una vez iniciado el juego, en la parte inferior aparecerá (o no) el saldo inicial el participante ha de realizar un número de jugadas concreto, pero desconocido para él y según se van eligiendo cartas, automáticamente se suman o restan las ganancias y pérdidas respectivamente, hasta completar en número de jugadas. También se registran en el archivo de resultados otros parámetros, los siguientes:

-	N° jugada
-	Mazo elegido
-	Ganancia
-	Perdida
-	Préstamos en caso de saldo negativo
-	Saldo acumulado
-	Tiempo transcurrido desde el inicio
-	Tiempo de la jugada
-	Saldo real
-	N° de elecciones del mazo: A/B/C/D
-	Índice de gambling (total y parciales) 

## Experimento. Importancia del programa de ganancias/pérdidas 

El participante observa en la pantalla del ordenador cuatro mazos de cartas boca abajo y debe escoger libremente cartas con el ratón, previamente en las instrucciones se le indica que el juego consiste en intentar conseguir el máximo dinero posible. Cada mazo contiene 40 cartas, y la tarea consta de un total de 100 ensayos (esto es desconocido por el participante).

Cada vez que se selecciona una carta, ésta se voltea y aparece un mensaje que indica la cantidad de dinero ganado y perdido y un signo que califica el resultado de la jugada, “+” si se incrementa el saldo, “-” si éste disminuye, e “=” si no varía, ajustándose la cantidad del saldo al resultado obtenido.

La peculiaridad de la tarea estriba en que hay dos mazos favorables (C y D) y dos desfavorables (A y B):

- A y B proporcionan altas recompensas económicas y altos castigos. El mazo A contiene premios de 100€ mientras que las pérdidas son de 100, 150, 200, 250, 300 y 350 euros, en cinco de cada 10 cartas. El mazo B contiene premios de 100€ y una única pérdida de 1250 euros en cada ciclo de 10 elecciones. En cada ciclo de 10 jugadas se ganan 1000€ y se pierden 1250€.
- C y D proporcionan ganancias más bajas, pero también castigos menores. El mazo C contiene premios de 50€ y castigos de 25, 50 y 75 euros en cinco de cada 10 cartas. El mazo D contiene premios de 50€ y un único castigo de 250€ cada 10 cartas. Con estos mazos, en cada ciclo de 10 jugadas se ganan 500€ y se pierden 250€.

La puntuación de la tarea o índice gambling (IG) se obtiene al restar el número de elecciones de mazos desventajosos (A + B), del número de elecciones de mazos ventajosos (C + D), es decir IG = (C + D) – (A + B). Este IG, se calcula para el total de la prueba por bloques de 20 ensayos para evaluar la evolución de la misma. Este IG se mostrará también en forma de porcentaje para mejor visualización de las elecciones ventajosas y desventajosas.
Los parámetros iniciales de la prueba son: 

-	Saldo Inicial: 2000€
-	Nº de jugadas: 20 (debido a que a la pérdida significativa de atención sufrida a partir de esa juagada). 
-	Préstamo si saldo negativo: 500€
-	Retardo para ocultar la carta: 3 segundos
-	Colocación: ABCD 
-	Gambling Parcial: 10. 
-	Todos los participantes realizan la prueba dos veces.

En un procesamiento, tanto implícito, como estratégico, el participante ha de ser capaz de delimitar la naturaleza favorable/desfavorable de los distintos mazos, especialmente B y D (pérdidas muy poco frecuentes), si los participantes tienen problemas para establecer la asociación con las consecuencias a largo plazo de la tarea, manipulando la magnitud de las recompensa/pérdidas de las elecciones inmediatas, mejoraremos la correcta identificación favorable/desfavorable de los distintos mazos, especialmente de B y D al incrementar el número de pérdidas (aunque no el total) en dada ciclo de 10 cartas. 

Con los resultados obtenidos podremos establecer un programa de entrenamiento en toma de decisiones mediante tareas de juegos que no ayude a optimizar el proceso de toma de decisiones en situaciones de incertidumbre.

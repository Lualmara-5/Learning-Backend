# Arrays

## ¿Qué es un Array?

Un Array (arreglo) es una estructura que permite almacenar múltiples valores del mismo tipo dentro de una sola variable.

Sin arrays, si quisiéramos guardar 5 edades tendríamos que hacer:

```java
int edad1 = 20;
int edad2 = 25;
int edad3 = 18;
int edad4 = 30;
int edad5 = 22;
```

Esto se vuelve difícil de manejar cuando tenemos muchos datos.

Con un array:

```java
int[] edades = {20, 25, 18, 30, 22};
```

Ahora todas las edades están agrupadas en una sola estructura.

---

## ¿Por qué son importantes?

Los arrays permiten:

- Almacenar múltiples datos relacionados.
- Recorrer información usando loops.
- Reducir la cantidad de variables.
- Organizar mejor los datos.

Son una de las estructuras de datos más básicas de la programación.

---

## Declaración de un Array

```java
int[] edades;
```

Aquí:

- `int` es el tipo de dato.
- `[]` indica que es un array.
- `edades` es el nombre de la variable.

Todavía no contiene elementos.

---

## Creación de un Array

```java
int[] edades = new int[5];
```

Esto crea un array con espacio para 5 enteros.

Visualmente:

```text
Índice:   0   1   2   3   4
Valor:   [ ] [ ] [ ] [ ] [ ]
```

---

## Los índices

Los arrays utilizan índices para acceder a cada posición.

Importante:

```text
Los índices empiezan en 0.
```

Ejemplo:

```java
int[] edades = {20, 25, 18};
```

Visualmente:

```text
Índice:   0    1    2
Valor:   20   25   18
```

---

## Acceder a un elemento

```java
int[] edades = {20, 25, 18};

System.out.println(edades[0]);
```

Resultado:

```text
20
```

Porque el índice 0 contiene el valor 20.

---

## Otro ejemplo

```java
System.out.println(edades[1]);
```

Resultado:

```text
25
```

---

## Modificar un elemento

Podemos cambiar el valor de una posición.

```java
int[] edades = {20, 25, 18};

edades[1] = 30;
```

Ahora:

```text
Índice:   0    1    2
Valor:   20   30   18
```

---

## Longitud de un Array

Para conocer cuántos elementos tiene:

```java
edades.length
```

Ejemplo:

```java
int[] edades = {20, 25, 18};

System.out.println(edades.length);
```

Resultado:

```text
3
```

---

## Recorrer un Array con un Loop

Aquí es donde Arrays y Loops trabajan juntos.

```java
int[] edades = {20, 25, 18};

for (int i = 0; i < edades.length; i++) {

    System.out.println(edades[i]);

}
```

Resultado:

```text
20
25
18
```

---

## Entendiendo el Loop

Si:

```java
int[] edades = {20, 25, 18};
```

Entonces:

```text
edades.length = 3
```

El loop hace:

```text
i = 0 → imprime edades[0]
i = 1 → imprime edades[1]
i = 2 → imprime edades[2]
```

Cuando:

```text
i = 3
```

La condición:

```java
i < edades.length
```

es falsa.

El loop termina.

---

## Error común: índice fuera de rango

Supongamos:

```java
int[] edades = {20, 25, 18};
```

Los índices válidos son:

```text
0
1
2
```

Si intentamos:

```java
System.out.println(edades[3]);
```

Java producirá un error.

Porque la posición 3 no existe.

---

## Regla importante

Si un array tiene:

```text
N elementos
```

Sus índices van desde:

```text
0
```

hasta:

```text
N - 1
```

Ejemplo:

```text
5 elementos
```

Índices:

```text
0
1
2
3
4
```

---

## Ejemplo completo

```java
public class Main {

    public static void main(String[] args) {

        int[] edades = {20, 25, 18, 30};

        for (int i = 0; i < edades.length; i++) {

            System.out.println(edades[i]);

        }

    }

}
```

Resultado:

```text
20
25
18
30
```

---

## Conceptos clave

- Un array almacena múltiples valores.
- Todos los elementos deben ser del mismo tipo.
- Los índices comienzan en 0.
- Se accede a los elementos usando `[]`.
- `length` indica la cantidad de elementos.
- Los loops permiten recorrer arrays fácilmente.

---

## Resumen

Los arrays permiten almacenar y organizar múltiples datos dentro de una sola variable.

Junto con variables, condiciones y loops, forman una de las bases fundamentales de la programación.

La combinación de Arrays + Loops aparece constantemente en aplicaciones reales y será utilizada en prácticamente todos los temas futuros.

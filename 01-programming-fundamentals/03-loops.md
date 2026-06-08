# Loops

## ¿Qué es un loop?

Un loop (bucle o ciclo) es una estructura que permite repetir un bloque de código múltiples veces.

Sin loops, tendríamos que escribir la misma instrucción una y otra vez.

Por ejemplo:

```java
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
```

Con un loop podemos lograr lo mismo de forma más eficiente.

---

## ¿Por qué son importantes?

Los loops permiten:

- Procesar grandes cantidades de datos.
- Recorrer arreglos.
- Repetir tareas automáticamente.
- Evitar código repetido.
- Construir algoritmos complejos.

Prácticamente cualquier aplicación utiliza loops.

---

## El loop `for`

Es el loop más utilizado cuando conocemos cuántas veces queremos repetir algo.

Estructura:

```java
for (inicializacion; condicion; actualizacion) {

}
```

Ejemplo:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Hola");
}
```

Resultado:

```text
Hola
Hola
Hola
Hola
Hola
```

---

## Entendiendo cada parte

```java
for (int i = 1; i <= 5; i++)
```

### Inicialización

```java
int i = 1
```

Se ejecuta una sola vez al inicio.

---

### Condición

```java
i <= 5
```

Mientras sea verdadera, el loop continúa.

---

### Actualización

```java
i++
```

Incrementa el valor de `i` en 1 después de cada iteración.

Es equivalente a:

```java
i = i + 1;
```

---

## Ejemplo paso a paso

```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```

Iteración 1:

```text
i = 1
```

Imprime:

```text
1
```

---

Iteración 2:

```text
i = 2
```

Imprime:

```text
2
```

---

Iteración 3:

```text
i = 3
```

Imprime:

```text
3
```

---

Cuando:

```text
i = 4
```

La condición:

```java
i <= 3
```

es falsa.

El loop termina.

---

## Loop `while`

Se utiliza cuando no sabemos exactamente cuántas veces se repetirá algo.

Estructura:

```java
while (condicion) {

}
```

Ejemplo:

```java
int numero = 1;

while (numero <= 5) {

    System.out.println(numero);

    numero++;
}
```

Resultado:

```text
1
2
3
4
5
```

---

## Diferencia entre `for` y `while`

### for

Cuando conocemos la cantidad de repeticiones.

```java
for (int i = 1; i <= 10; i++) {

}
```

---

### while

Cuando la repetición depende de una condición.

```java
while (usuarioAutenticado) {

}
```

---

## Loops infinitos

Un error común es olvidar actualizar la variable de control.

Ejemplo:

```java
int numero = 1;

while (numero <= 5) {

    System.out.println(numero);

}
```

Problema:

```text
numero nunca cambia
```

Por lo tanto:

```java
numero <= 5
```

siempre es verdadero.

El programa entra en un loop infinito.

---

## Operadores de incremento y decremento

Incrementar:

```java
i++;
```

Equivale a:

```java
i = i + 1;
```

---

Decrementar:

```java
i--;
```

Equivale a:

```java
i = i - 1;
```

---

Si quisieras incrementar o decrementar de 2 en 2 o de 10 en 10 o cualquier número, deberias hacer algo de este estilo:

```java
i += 2;
i -= 2;
```

Un ejemplo completo sería:

```java
// Incrementar de 2 en 2
for (int i = 1; i <= 10; i += 2) {
    System.out.println(i);
}

// Decrementar de 2 en 2
for (int i = 1; i <= 10; i -= 2) {
    System.out.println(i);
}
```

---

## Contar hacia atrás

```java
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
```

Resultado:

```text
5
4
3
2
1
```

---

## Ejemplo completo

```java
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

    }

}
```

Resultado:

```text
Iteración: 1
Iteración: 2
Iteración: 3
Iteración: 4
Iteración: 5
```

---

## Conceptos clave

- Un loop permite repetir código.
- `for` se utiliza cuando conocemos la cantidad de repeticiones.
- `while` se utiliza cuando dependemos de una condición.
- La condición debe llegar a ser falsa para terminar.
- Un loop infinito ocurre cuando la condición nunca cambia.

---

## Resumen

Los loops permiten automatizar tareas repetitivas.

Son una de las herramientas más importantes de la programación porque permiten ejecutar instrucciones múltiples veces sin duplicar código.

Junto con variables y condiciones, los loops forman una de las bases fundamentales para resolver problemas mediante programación.

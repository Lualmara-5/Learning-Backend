# Main Method

## ¿Qué es el método `main`?

El método `main` es el punto de entrada de una aplicación Java.

Cuando ejecutamos un programa, la JVM busca este método para saber dónde comenzar la ejecución.

Por ejemplo:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

    }

}
```

Cuando ejecutamos el programa, Java entra primero en:

```java
public static void main(String[] args)
```

y comienza a ejecutar las instrucciones que se encuentran dentro de sus llaves.

---

## ¿Por qué existe el método `main`?

Imagina que una clase tiene muchos métodos:

```java
public class Main {

    public static void saludar() {

    }

    public static void despedirse() {

    }

    public static void calcular() {

    }

}
```

¿Cómo sabría Java cuál ejecutar primero?

Necesita una referencia clara.

Por eso Java utiliza un método especial llamado:

```java
main
```

---

## La firma completa

La forma tradicional es:

```java
public static void main(String[] args)
```

A primera vista parece complicada.

Pero cada palabra tiene un significado.

---

## `public`

Significa que el método puede ser accedido desde cualquier lugar.

La JVM necesita poder encontrar y ejecutar este método.

Por eso debe ser:

```java
public
```

---

## `static`

Indica que el método pertenece a la clase y no a un objeto específico.

Gracias a esto, la JVM puede ejecutarlo sin crear previamente un objeto.

Por ejemplo:

```java
public class Main {

    public static void main(String[] args) {

    }

}
```

La JVM puede llamar directamente al método.

---

## ¿Por qué no crear un objeto primero?

Piensa en este problema:

```text
La JVM necesita ejecutar main()
```

Pero para ejecutar `main()` tendría que crear un objeto.

Y para crear el objeto necesitaría ejecutar código.

¿Dónde comenzaría?

Se produciría un ciclo.

Por eso `main` es estático.

---

## `void`

Indica que el método no retorna ningún valor.

Por ejemplo:

```java
public static void main(String[] args)
```

No devuelve nada.

---

## `main`

Es simplemente el nombre del método.

Java espera exactamente ese nombre.

Si escribimos:

```java
public static void inicio(String[] args)
```

la JVM no lo encontrará.

---

## `String[] args`

Es un arreglo de cadenas de texto.

Permite recibir información cuando ejecutamos el programa desde la terminal.

Ejemplo:

```bash
java Main Juan 20
```

Java almacenará:

```text
args[0] = "Juan"
args[1] = "20"
```

---

## Ejemplo

Código:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println(args[0]);

    }

}
```

Ejecución:

```bash
java Main Alejo
```

Resultado:

```text
Alejo
```

---

## ¿Siempre debo escribirlo igual?

En la práctica sí.

La mayoría de programas Java utilizan exactamente:

```java
public static void main(String[] args)
```

Muchos desarrolladores pueden escribir esta línea de memoria.

---

## Flujo de ejecución

Supongamos:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Inicio");

        saludar();

    }

    public static void saludar() {

        System.out.println("Hola");

    }

}
```

La ejecución ocurre así:

```text
main()
   ↓
Imprime "Inicio"
   ↓
Llama saludar()
   ↓
Imprime "Hola"
```

Resultado:

```text
Inicio
Hola
```

---

## Error común de principiantes

Pensar que Java ejecuta una clase.

Realmente Java ejecuta el método:

```java
main()
```

La clase únicamente contiene dicho método.

---

## Pregunta típica de entrevista

### ¿Qué significa `public static void main(String[] args)`?

Respuesta corta:

- `public` → accesible desde cualquier lugar.
- `static` → pertenece a la clase.
- `void` → no retorna valor.
- `main` → punto de entrada del programa.
- `String[] args` → argumentos enviados desde la línea de comandos.

---

## Conceptos clave

- Todo programa Java comienza en `main()`.
- La JVM busca el método `main`.
- `main` debe ser `public`.
- `main` debe ser `static`.
- `main` normalmente retorna `void`.
- `args` permite recibir parámetros desde la terminal.

---

## Resumen

El método `main` es el punto de entrada de una aplicación Java.

Cuando ejecutamos un programa, la JVM busca este método y comienza a ejecutar las instrucciones contenidas en él.

Cada palabra de la firma tiene una función específica y permite que Java encuentre y ejecute correctamente el programa.

---

## Frase para memorizar

```java
public static void main(String[] args)
```

```text
public  → accesible
static  → pertenece a la clase
void    → no retorna nada
main    → punto de entrada
args    → argumentos de la terminal
```

# Variables

## ¿Qué es una variable?

Una variable es un espacio en memoria utilizado para almacenar información que puede ser utilizada o modificada por un programa.

Podemos imaginar una variable como una caja etiquetada donde guardamos un valor.

Por ejemplo:

- Una caja llamada `edad` puede almacenar el número `20`.
- Una caja llamada `nombre` puede almacenar el texto `"Alejo"`.

Cada vez que el programa necesite ese valor, puede acceder a él utilizando el nombre de la variable.

---

## ¿Por qué existen las variables?

Sin variables, un programa no podría recordar información.

Las variables permiten:

- Almacenar datos.
- Reutilizar información.
- Realizar cálculos.
- Tomar decisiones.
- Interactuar con el usuario.

Prácticamente cualquier programa utiliza variables.

---

## Declaración de una variable

Antes de utilizar una variable, generalmente debemos declararla.

En Java:

```java
int edad;
```

En este caso:

- `int` indica el tipo de dato.
- `edad` es el nombre de la variable.

Todavía no hemos guardado ningún valor dentro de ella.

---

## Inicialización de una variable

Inicializar una variable significa asignarle un valor por primera vez.

```java
int edad = 20;
```

Ahora:

- La variable se llama `edad`.
- Su valor es `20`.

---

## Modificación de una variable

El valor almacenado puede cambiar durante la ejecución del programa.

```java
int edad = 20;

edad = 21;
```

Después de la segunda línea, el valor almacenado será `21`.

El valor anterior se reemplaza.

---

## Tipos de datos básicos en Java

Las variables almacenan diferentes tipos de información.

### Enteros

```java
int edad = 20;
```

Se utilizan para números sin decimales.

---

### Decimales

```java
double altura = 1.75;
```

Se utilizan para números con parte decimal.

---

### Caracteres

```java
char letra = 'A';
```

Almacenan un único carácter.

---

### Valores lógicos

```java
boolean activo = true;
```

Solo pueden contener:

```java
true
false
```

---

### Texto

```java
String nombre = "Alejo";
```

Se utilizan para almacenar cadenas de caracteres.

---

## Cómo visualizar una variable en memoria

Supongamos el siguiente código:

```java
int edad = 20;
```

Podemos imaginar la memoria así:

```text
┌─────────┐
│ edad │
├─────────┤
│ 20 │
└─────────┘
```

Si luego hacemos:

```java
edad = 25;
```

La memoria quedaría:

```text
┌─────────┐
│ edad │
├─────────┤
│ 25 │
└─────────┘
```

El valor anterior ya no se utiliza.

---

## Buenas prácticas para nombrar variables

Los nombres deben ser descriptivos y lo común en BackEnd (Java) es nombrarlos como **camelCase**.

Buenos ejemplos:

```java
nombreUsuario
cantidadProductos
precioTotal
fechaNacimiento
```

Malos ejemplos:

```java
a
x
dato1
aaa
```

Un buen nombre hace que el código sea más fácil de leer y mantener.

---

## Ejemplo completo

```java
public class Main {

    public static void main(String[] args) {

        String nombre = "Alejo";
        int edad = 20;
        double altura = 1.75;
        boolean estudiante = true;

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
    }
}
```

Salida:

```text
Alejo
20
1.75
true
```

---

## Conceptos clave

- Una variable almacena información.
- Cada variable tiene un nombre.
- Cada variable tiene un tipo de dato.
- El valor de una variable puede cambiar durante la ejecución.
- Las variables permiten que un programa recuerde información.

---

## Resumen

Las variables son uno de los conceptos más importantes de la programación.

Permiten almacenar datos dentro de la memoria para que el programa pueda utilizarlos posteriormente.

Todo programa, desde una calculadora hasta una red social, utiliza variables constantemente para guardar y manipular información.

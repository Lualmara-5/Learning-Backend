# Classes

## ¿Qué es una clase?

Una clase es una plantilla o molde que define cómo serán los objetos que se creen a partir de ella.

No representa un objeto específico.

Representa la descripción de un tipo de objeto.

Por ejemplo:

```text
Clase: Persona
```

Describe características como:

- Nombre
- Edad
- Altura

Y comportamientos como:

- Caminar
- Hablar
- Dormir

Pero la clase no es una persona real.

Es solamente el plano.

---

## Analogía: Plano de una casa

Imagina los planos de una casa.

El plano contiene información sobre:

- Habitaciones
- Puertas
- Ventanas
- Baños

Pero el plano no es una casa.

Es una descripción de cómo construir una.

Lo mismo ocurre con una clase.

```text
Clase
↓
Plano
```

```text
Objeto
↓
Casa construida
```

---

## Definir una clase

Ejemplo:

```java
public class Persona {

}
```

Aquí hemos creado una clase llamada:

```text
Persona
```

Todavía no hace nada.

Simplemente existe.

---

## Atributos

Los atributos representan las características de un objeto.

Ejemplo:

```java
public class Persona {

    String nombre;
    int edad;

}
```

Ahora la clase describe personas que tienen:

- Un nombre.
- Una edad.

---

## Métodos

Los métodos representan acciones o comportamientos.

Ejemplo:

```java
public class Persona {

    String nombre;
    int edad;

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Ahora la clase tiene:

Características:

```text
nombre
edad
```

Comportamiento:

```text
saludar()
```

---

## Clase completa

```java
public class Persona {

    String nombre;
    int edad;

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Esta clase describe cómo debería ser una persona dentro del programa.

---

## Una clase NO es un objeto

Este es uno de los conceptos más importantes.

Muchos principiantes creen que son lo mismo.

No lo son.

Clase:

```java
public class Persona {

    String nombre;
    int edad;

}
```

Objeto:

```java
Persona persona1;
```

La clase es el molde.

El objeto es una instancia creada a partir del molde.

---

## ¿Por qué usar clases?

Las clases permiten organizar el código.

En lugar de trabajar con variables sueltas:

```java
String nombre;
int edad;
```

podemos agrupar información relacionada.

```java
public class Persona {

    String nombre;
    int edad;

}
```

Esto hace que los programas sean más fáciles de entender y mantener.

---

## Convención de nombres

Las clases normalmente utilizan PascalCase.

Ejemplos:

```java
Persona
Usuario
CuentaBancaria
Producto
Empleado
```

Incorrecto:

```java
persona
usuario
cuenta_bancaria
```

---

## Relación con el mundo real

Clase:

```text
Persona
```

Posibles objetos:

```text
Alejo
Juan
María
Carlos
```

Clase:

```text
Vehiculo
```

Posibles objetos:

```text
Toyota
Mazda
Chevrolet
```

Una clase define un tipo.

Los objetos representan elementos concretos de ese tipo.

---

## Error común de principiantes

Pensar que una clase almacena datos específicos.

La clase solo define la estructura.

Los datos concretos pertenecen a los objetos.

---

## Pregunta típica de entrevista

### ¿Qué es una clase?

Respuesta corta:

Una clase es una plantilla que define atributos y comportamientos para los objetos que serán creados a partir de ella.

---

## Conceptos clave

- Una clase es un molde o plantilla.
- Los atributos representan características.
- Los métodos representan comportamientos.
- Una clase no es un objeto.
- Los objetos se crean a partir de clases.
- Las clases ayudan a organizar el código.

---

## Resumen

Una clase es una descripción de cómo deben ser ciertos objetos dentro de un programa.

Define atributos y métodos que posteriormente serán utilizados por los objetos creados a partir de ella.

Las clases son uno de los pilares fundamentales de la Programación Orientada a Objetos.

---

## Frase para memorizar

```text
Clase = Plano
Objeto = Construcción real
```

o

```text
Clase = Molde
Objeto = Instancia creada a partir del molde
```

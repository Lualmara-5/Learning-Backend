# Inheritance

## ¿Qué es la herencia?

La herencia es un mecanismo de la Programación Orientada a Objetos que permite que una clase reutilice atributos y métodos de otra clase.

La idea principal es evitar repetir código.

---

## El problema sin herencia

Supongamos que tenemos estas clases:

```java
public class Estudiante {

    private String nombre;
    private int edad;

}
```

```java
public class Profesor {

    private String nombre;
    private int edad;

}
```

Observa que ambas clases tienen los mismos atributos.

Si seguimos creando clases similares:

```java
Empleado
Administrador
Coordinador
```

Terminaremos repitiendo código una y otra vez.

---

## La idea de la herencia

Podemos crear una clase más general:

```java
public class Persona {

    private String nombre;
    private int edad;

}
```

Y luego crear clases más específicas:

```java
public class Estudiante extends Persona {

}
```

```java
public class Profesor extends Persona {

}
```

Ahora:

```text
Persona
├── Estudiante
└── Profesor
```

Las clases hijas reutilizan lo que existe en la clase padre.

---

## La palabra clave `extends`

En Java la herencia se realiza mediante:

```java
extends
```

Ejemplo:

```java
public class Estudiante extends Persona {

}
```

Se puede leer como:

```text
Estudiante hereda de Persona
```

o

```text
Estudiante es una Persona
```

---

## Clase padre y clase hija

También escucharás estos nombres:

```text
Clase padre
Clase base
Superclase
```

Y:

```text
Clase hija
Clase derivada
Subclase
```

Por ejemplo:

```java
public class Persona {

}
```

Es la clase padre.

```java
public class Estudiante extends Persona {

}
```

Es la clase hija.

---

## Heredando atributos

Supongamos:

```java
public class Persona {

    protected String nombre;
    protected int edad;

}
```

```java
public class Estudiante extends Persona {

}
```

Ahora:

```java
Estudiante estudiante = new Estudiante();

estudiante.nombre = "Alejo";
estudiante.edad = 20;
```

La clase hija puede utilizar los atributos heredados.

---

## ¿Qué es `protected`?

Hasta ahora conocemos:

```java
private
```

y

```java
public
```

Existe un nivel intermedio:

```java
protected
```

De forma simplificada para este momento:

```text
private
↓
Solo la propia clase
```

```text
protected
↓
La propia clase y sus hijos
```

```text
public
↓
Todo el programa
```

Más adelante veremos los detalles completos cuando estudiemos modificadores de acceso.

---

## Heredando métodos

La herencia también permite reutilizar métodos.

Clase padre:

```java
public class Persona {

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Clase hija:

```java
public class Estudiante extends Persona {

}
```

Uso:

```java
Estudiante estudiante = new Estudiante();

estudiante.saludar();
```

Salida:

```text
Hola
```

Aunque el método no fue escrito dentro de `Estudiante`.

---

## Agregando nuevas características

La clase hija puede tener atributos propios.

```java
public class Persona {

    protected String nombre;

}
```

```java
public class Estudiante extends Persona {

    private String carrera;

}
```

Ahora un estudiante tiene:

```text
nombre
```

heredado de `Persona`.

Y además:

```text
carrera
```

propio de `Estudiante`.

---

## Ejemplo completo

Clase padre:

```java
public class Persona {

    protected String nombre;

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Clase hija:

```java
public class Estudiante extends Persona {

    private String carrera;

}
```

Uso:

```java
Estudiante estudiante = new Estudiante();

estudiante.nombre = "Alejo";

estudiante.saludar();
```

Salida:

```text
Hola
```

---

## Relación "es un"

Una forma sencilla de detectar herencia es preguntar:

```text
¿La clase hija ES una versión de la clase padre?
```

Ejemplos correctos:

```text
Estudiante ES una Persona
```

```text
Profesor ES una Persona
```

```text
Perro ES un Animal
```

```text
Gato ES un Animal
```

---

## Ejemplos incorrectos

```text
Motor ES un Carro
```

No.

Más bien:

```text
Carro TIENE un Motor
```

Eso no es herencia.

Más adelante veremos que eso se llama composición.

---

## Herencia y constructores

Supongamos:

```java
public class Persona {

    protected String nombre;

    public Persona(String nombre) {

        this.nombre = nombre;

    }

}
```

Clase hija:

```java
public class Estudiante extends Persona {

    public Estudiante(String nombre) {

        super(nombre);

    }

}
```

---

## ¿Qué es `super`?

`super` permite acceder a elementos de la clase padre.

Por ejemplo:

```java
super(nombre);
```

Llama al constructor de la clase padre.

Se puede leer como:

```text
Oye Persona,
inicializa la parte que te corresponde.
```

---

## Analogía

Imagina una empresa.

Clase padre:

```text
Empleado
```

Contiene:

```text
nombre
salario
trabajar()
```

Clases hijas:

```text
Programador
Diseñador
Contador
```

Todos comparten:

```text
nombre
salario
trabajar()
```

Pero cada uno puede tener características adicionales.

---

## Ventajas de la herencia

- Reutiliza código.
- Reduce duplicación.
- Facilita el mantenimiento.
- Permite crear jerarquías de clases.
- Hace más claro el modelo del problema.

---

## Importante

Herencia NO significa copiar y pegar código.

Cuando una clase hereda:

```java
public class Estudiante extends Persona
```

Existe una relación real entre ambas clases.

La clase hija es una especialización de la clase padre.

---

## Error común de principiantes

Usar herencia para cualquier relación.

Por ejemplo:

```text
Carro → Motor
```

No es herencia.

Porque:

```text
Motor NO es un Carro
```

La pregunta clave siempre es:

```text
¿ES UN?
```

Si la respuesta es sí, probablemente sea herencia.

Si la respuesta es no, probablemente sea otra relación.

---

## Pregunta típica de entrevista

### ¿Qué es la herencia?

Respuesta corta:

La herencia es un mecanismo que permite que una clase reutilice atributos y métodos de otra clase mediante una relación padre-hijo.

---

## Conceptos clave

- La herencia reutiliza código.
- Se implementa con `extends`.
- Existe una clase padre y una clase hija.
- La clase hija hereda atributos y métodos.
- `super` permite acceder a la clase padre.
- La relación típica es "ES UN".

---

## Resumen

La herencia permite construir clases especializadas a partir de clases más generales.

Gracias a ella es posible reutilizar atributos y métodos, reducir la duplicación de código y modelar relaciones del tipo "ES UN".

---

## Frase para memorizar

```text
Herencia = reutilizar código mediante una relación padre-hijo.
```

o

```text
Si A es una versión más específica de B,
entonces A puede heredar de B.
```

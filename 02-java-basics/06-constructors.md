# Constructors

## ¿Qué es un constructor?

Un constructor es un método especial que se ejecuta automáticamente cuando se crea un objeto.

Su principal función es inicializar los atributos del objeto.

Por ejemplo:

```java
Persona persona1 = new Persona();
```

Cuando Java crea el objeto, ejecuta automáticamente el constructor de la clase.

---

## ¿Por qué existen los constructores?

Imagina que cada vez que creas una persona debes asignar manualmente todos sus datos.

```java
Persona persona1 = new Persona();

persona1.nombre = "Alejo";
persona1.edad = 20;
```

Esto funciona, pero puede volverse repetitivo.

Los constructores permiten inicializar los objetos desde el momento en que son creados.

---

## Constructor básico

Supongamos la siguiente clase:

```java
public class Persona {

    String nombre;

    public Persona() {

        nombre = "Sin nombre";

    }

}
```

Observa que el constructor tiene el mismo nombre de la clase.

Creamos un objeto:

```java
Persona persona1 = new Persona();
```

Resultado:

```java
System.out.println(persona1.nombre);
```

Salida:

```text
Sin nombre
```

---

## Características de un constructor

Un constructor:

- Tiene el mismo nombre de la clase.
- No tiene tipo de retorno.
- Se ejecuta automáticamente al crear un objeto.
- Puede recibir parámetros.

---

## Constructor con parámetros

Los parámetros permiten enviar información al constructor.

Ejemplo:

```java
public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

}
```

Creación del objeto:

```java
Persona persona1 = new Persona("Alejo", 20);
```

Ahora el objeto ya contiene información desde el momento en que fue creado.

---

## ¿Qué significa `this`?

Observa:

```java
public Persona(String nombre) {

    this.nombre = nombre;

}
```

Aquí existen dos variables llamadas `nombre`.

La primera:

```java
this.nombre
```

Es el atributo del objeto.

La segunda:

```java
nombre
```

Es el parámetro recibido.

La palabra clave `this` le indica a Java que se refiere al atributo del objeto actual.

Nota: this.nombre -> el nombre de este objeto será

---

## Constructor sin parámetros

También llamado constructor vacío.

Ejemplo:

```java
public class Persona {

    public Persona() {

    }

}
```

Creamos el objeto:

```java
Persona persona1 = new Persona();
```

Aunque el constructor no haga nada, sigue siendo válido.

---

## Constructor por defecto

Si una clase no tiene constructores, Java crea uno automáticamente.

Por ejemplo:

```java
public class Persona {

    String nombre;

}
```

Java genera internamente algo similar a:

```java
public Persona() {

}
```

A esto se le conoce como constructor por defecto.

---

## Importante

Si escribimos un constructor manualmente:

```java
public class Persona {

    public Persona(String nombre) {

    }

}
```

Java deja de generar automáticamente el constructor vacío.

Entonces este código produciría error:

```java
Persona persona1 = new Persona();
```

Porque el constructor vacío ya no existe.

---

## Sobrecarga de constructores

Una clase puede tener varios constructores.

Ejemplo:

```java
public class Persona {

    String nombre;
    int edad;

    public Persona() {

        nombre = "Desconocido";
        edad = 0;

    }

    public Persona(String nombre) {

        this.nombre = nombre;
        edad = 0;

    }

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;

    }

}
```

Ahora podemos crear objetos de distintas maneras.

```java
Persona persona1 = new Persona();

Persona persona2 = new Persona("Alejo");

Persona persona3 = new Persona("Alejo", 20);
```

Java identifica qué constructor utilizar según los argumentos enviados.

---

## Relación entre `new` y los constructores

Cuando escribimos:

```java
Persona persona1 = new Persona();
```

Ocurren dos cosas:

1. `new` crea el objeto.
2. El constructor inicializa el objeto.

Podemos verlo así:

```text
new
 ↓
Crea el objeto

Constructor
 ↓
Inicializa el objeto
```

Ambos trabajan juntos durante la creación del objeto.

---

## Analogía

Clase:

```text
Plano de una casa
```

Constructor:

```text
Instrucciones iniciales de construcción
```

Objeto:

```text
Casa construida
```

Cada vez que construimos una casa, seguimos las instrucciones definidas por el constructor.

---

## Error común de principiantes

Pensar que un constructor es un método normal.

Por ejemplo:

```java
public Persona() {

}
```

Aunque su sintaxis es parecida, no es un método común.

Los constructores:

- No tienen tipo de retorno.
- Se ejecutan automáticamente.
- Sirven para crear e inicializar objetos.

---

## Pregunta típica de entrevista

### ¿Qué es un constructor?

Respuesta corta:

Un constructor es un método especial que se ejecuta automáticamente al crear un objeto y se utiliza para inicializar sus atributos.

---

## Conceptos clave

- Un constructor se ejecuta cuando se crea un objeto.
- Tiene el mismo nombre de la clase.
- No tiene tipo de retorno.
- Puede recibir parámetros.
- Puede existir más de un constructor en una clase.
- `this` permite referirse al objeto actual.

---

## Resumen

Los constructores permiten inicializar objetos de forma automática durante su creación.

Gracias a ellos podemos asignar valores iniciales, evitar código repetitivo y crear objetos con distintos estados desde el primer momento.

---

## Frase para memorizar

```text
new crea el objeto
constructor lo inicializa
```

o

```text
Constructor = configuración inicial del objeto
```

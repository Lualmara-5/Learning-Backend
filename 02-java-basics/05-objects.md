# Objects

## ¿Qué es un objeto?

Un objeto es una instancia creada a partir de una clase.

Si una clase es un molde, un objeto es una entidad real construida utilizando ese molde.

Por ejemplo:

```text
Clase: Persona
```

Posibles objetos:

```text
Alejo
Juan
María
Carlos
```

Todos son personas, pero cada uno tiene sus propios datos.

---

## Relación entre clase y objeto

Clase:

```java
public class Persona {

    String nombre;
    int edad;

}
```

Objeto:

```java
Persona persona1 = new Persona();
```

La clase define cómo será una persona.

El objeto representa una persona específica.

---

## Crear un objeto

Supongamos la siguiente clase:

```java
public class Persona {

    String nombre;
    int edad;

}
```

Podemos crear un objeto así:

```java
Persona persona1 = new Persona();
```

Veamos cada parte.

---

### Tipo de dato

```java
Persona
```

Indica que la variable almacenará un objeto de tipo Persona.

---

### Nombre de la variable

```java
persona1
```

Es el nombre que utilizaremos para referirnos al objeto.

---

### Operador `new`

```java
new
```

Le indica a Java que debe crear un nuevo objeto.

---

### Constructor

```java
Persona()
```

Es el mecanismo que Java utiliza para construir objetos.

Más adelante veremos los constructores en detalle.

Por ahora basta con saber que ayudan a crear objetos.

---

## Crear múltiples objetos

Podemos crear varios objetos utilizando la misma clase.

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
Persona persona3 = new Persona();
```

Todos son objetos diferentes.

Todos fueron creados a partir del mismo molde.

---

## Asignar valores a los atributos

Supongamos:

```java
public class Persona {

    String nombre;
    int edad;

}
```

Podemos asignar valores así:

```java
Persona persona1 = new Persona();

persona1.nombre = "Alejo";
persona1.edad = 20;
```

Ahora el objeto contiene datos reales.

---

## Acceder a los atributos

Utilizamos el operador punto:

```java
persona1.nombre
```

o

```java
persona1.edad
```

Ejemplo:

```java
System.out.println(persona1.nombre);
```

Resultado:

```text
Alejo
```

---

## Objetos diferentes

Podemos tener:

```java
Persona persona1 = new Persona();

persona1.nombre = "Alejo";
persona1.edad = 20;
```

y también:

```java
Persona persona2 = new Persona();

persona2.nombre = "Juan";
persona2.edad = 35;
```

Observa:

```text
Clase
 ↓
Persona
```

Objetos:

```text
persona1
persona2
```

Datos:

```text
persona1
  nombre = Alejo
  edad = 20

persona2
  nombre = Juan
  edad = 35
```

La clase es una sola.

Los objetos son varios.

---

## Llamar métodos de un objeto

Supongamos:

```java
public class Persona {

    String nombre;

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Creamos el objeto:

```java
Persona persona1 = new Persona();
```

Y llamamos al método:

```java
persona1.saludar();
```

Resultado:

```text
Hola
```

---

## Analogía

Clase:

```text
Molde para hacer galletas
```

Objeto:

```text
Galleta creada usando el molde
```

Podemos crear:

```text
Galleta 1
Galleta 2
Galleta 3
Galleta 4
```

Todas vienen del mismo molde.

---

## Error común de principiantes

Pensar que:

```java
Persona
```

y

```java
Persona persona1 = new Persona();
```

son lo mismo.

No lo son.

La primera es una clase.

La segunda crea un objeto.

---

## Pregunta típica de entrevista

### ¿Qué es un objeto?

Respuesta corta:

Un objeto es una instancia creada a partir de una clase.

Contiene datos y puede ejecutar comportamientos definidos por dicha clase.

---

## Conceptos clave

- Un objeto se crea a partir de una clase.
- Una clase puede generar múltiples objetos.
- Cada objeto tiene sus propios datos.
- Los atributos se acceden usando el operador punto (`.`).
- Los métodos también se invocan usando el operador punto (`.`).

---

## Resumen

Las clases definen la estructura de los objetos.

Los objetos representan entidades reales dentro del programa y almacenan datos específicos.

Podemos crear múltiples objetos utilizando la misma clase, permitiendo representar distintas entidades sin necesidad de duplicar código.

---

## Frase para memorizar

```text
Clase = Molde
Objeto = Instancia creada a partir del molde
```

o

```text
Clase = Plano
Objeto = Construcción real
```

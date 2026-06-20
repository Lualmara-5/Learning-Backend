# Static Keyword

## ¿Qué significa `static`?

La palabra clave `static` indica que algo pertenece a la clase y no a los objetos creados a partir de ella.

Hasta ahora hemos trabajado principalmente con objetos.

Por ejemplo:

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
```

Cada objeto tiene sus propios atributos y métodos.

Con `static`, ciertos elementos pertenecen directamente a la clase.

---

## Antes de entender `static`

Recordemos esta clase:

```java
public class Persona {

    String nombre;

}
```

Creamos dos objetos:

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
```

Asignamos valores:

```java
persona1.nombre = "Alejo";
persona2.nombre = "Juan";
```

Resultado:

```text
persona1.nombre = Alejo
persona2.nombre = Juan
```

Cada objeto tiene su propia copia del atributo.

---

## Atributo estático

Supongamos:

```java
public class Persona {

    static String especie = "Humano";

}
```

Ahora creamos varios objetos:

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
Persona persona3 = new Persona();
```

¿Cuántas copias existen de `especie`?

```text
Una sola
```

Porque pertenece a la clase.

No pertenece a cada objeto.

---

## Acceder a un atributo estático

Podemos hacerlo así:

```java
Persona.especie
```

Ejemplo:

```java
System.out.println(Persona.especie);
```

Salida:

```text
Humano
```

Observa que no fue necesario crear un objeto.

---

## Comparación visual

Sin `static`:

```java
String nombre;
```

Cada objeto tiene su propia copia.

```text
persona1.nombre
persona2.nombre
persona3.nombre
```

---

Con `static`:

```java
static String especie;
```

Existe una única copia compartida.

```text
Persona.especie
```

Todos los objetos utilizan la misma variable.

---

## Método estático

También podemos crear métodos estáticos.

Ejemplo:

```java
public class Calculadora {

    public static int sumar(int a, int b) {

        return a + b;

    }

}
```

Podemos llamarlo directamente:

```java
Calculadora.sumar(5, 3);
```

No necesitamos crear:

```java
Calculadora calculadora = new Calculadora();
```

---

## Ejemplo real: Math

Probablemente ya hayas visto algo parecido.

```java
Math.sqrt(25);
```

Resultado:

```text
5.0
```

Nunca creamos un objeto:

```java
Math math = new Math();
```

Porque `sqrt()` es un método estático.

Pertenece a la clase `Math`.

---

## ¿Cuándo usar static?

Cuando la información debe ser compartida por todos los objetos.

Por ejemplo:

```java
public class Persona {

    static String especie = "Humano";

}
```

No tendría sentido que cada persona almacenara su propia copia de:

```text
Humano
```

Todas pertenecen a la misma especie.

---

## Ejemplo de contador

Supongamos:

```java
public class Persona {

    static int totalPersonas = 0;

    public Persona() {

        totalPersonas++;

    }

}
```

Creamos objetos:

```java
Persona persona1 = new Persona();
Persona persona2 = new Persona();
Persona persona3 = new Persona();
```

Valor:

```java
System.out.println(Persona.totalPersonas);
```

Salida:

```text
3
```

Todos los objetos comparten la misma variable.

---

## Limitación importante

Un método estático no puede acceder directamente a atributos no estáticos.

Ejemplo:

```java
public class Persona {

    String nombre;

    public static void mostrarNombre() {

        System.out.println(nombre);

    }

}
```

Esto produce error.

¿Por qué?

Porque `nombre` pertenece a un objeto.

Pero el método estático pertenece a la clase.

La clase no sabe qué objeto debe utilizar.

---

## Analogía

Clase:

```text
Universidad
```

Objetos:

```text
Estudiante 1
Estudiante 2
Estudiante 3
```

Atributo normal:

```text
nombre
```

Cada estudiante tiene uno diferente.

---

Atributo estático:

```text
nombreUniversidad
```

Todos comparten el mismo valor.

No necesitamos almacenarlo en cada estudiante.

---

## Error común de principiantes

Pensar que `static` significa:

```text
Constante
```

No es cierto.

Esto es válido:

```java
public class Persona {

    static int contador = 0;

}
```

Su valor puede cambiar.

Lo único que significa `static` es:

```text
Pertenece a la clase
```

---

## Pregunta típica de entrevista

### ¿Qué significa static?

Respuesta corta:

`static` indica que un atributo o método pertenece a la clase y no a los objetos creados a partir de ella.

---

## Conceptos clave

- Los miembros estáticos pertenecen a la clase.
- No es necesario crear objetos para acceder a ellos.
- Existe una única copia compartida.
- Los métodos estáticos pueden llamarse usando el nombre de la clase.
- `Math.sqrt()` es un ejemplo de método estático.

---

## Resumen

La palabra clave `static` permite crear atributos y métodos que pertenecen directamente a la clase.

Esto resulta útil cuando la información debe ser compartida entre todos los objetos o cuando una funcionalidad no depende del estado de un objeto específico.

---

## Frase para memorizar

```text
No pertenece al objeto.
Pertenece a la clase.
```

o

```text
Objeto → cada instancia tiene su copia.

Static → existe una sola copia compartida.
```

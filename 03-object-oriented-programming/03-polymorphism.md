# Polymorphism

## ¿Qué es el polimorfismo?

El polimorfismo es uno de los pilares de la Programación Orientada a Objetos.

Su idea principal es que una misma referencia puede apuntar a objetos de diferentes tipos.

Gracias a esto podemos escribir código más flexible y reutilizable.

---

## ¿Qué significa la palabra "polimorfismo"?

Proviene del griego:

```text
Poli = muchos

Morph = formas
```

Es decir:

```text
Muchas formas
```

En programación significa que un mismo código puede trabajar con distintos objetos.

---

## Recordemos la herencia

Supongamos la siguiente jerarquía:

```java
public class Persona {

}
```

```java
public class Estudiante extends Persona {

}
```

```java
public class Profesor extends Persona {

}
```

Sabemos que:

```text
Estudiante ES una Persona

Profesor ES una Persona
```

---

## Creación normal de objetos

Hasta ahora hemos hecho esto:

```java
Estudiante estudiante = new Estudiante();

Profesor profesor = new Profesor();
```

El tipo de la referencia y el objeto son iguales.

---

## Una referencia del padre

Como un `Estudiante` es una `Persona`, Java permite hacer esto:

```java
Persona persona = new Estudiante();
```

También:

```java
Persona persona = new Profesor();
```

Observa bien.

La referencia es:

```java
Persona
```

Pero el objeto creado es:

```java
new Estudiante()
```

Eso es completamente válido.

---

## ¿Por qué funciona?

Porque un estudiante es una persona.

Sería parecido a decir:

```text
Persona
        ↑

Estudiante
```

Todo estudiante puede tratarse como una persona.

---

## Analogía

Imagina una empresa.

Tenemos:

```text
Empleado
```

Y luego:

```text
Programador

Diseñador

Contador
```

Todos son empleados.

Entonces podemos decir:

```text
Empleado empleado = nuevo Programador
```

Aunque internamente siga siendo un programador.

---

## ¿Qué métodos puedo usar?

Supongamos:

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

Ahora:

```java
Persona persona = new Estudiante();

persona.saludar();
```

Funciona correctamente.

¿Por qué?

Porque `saludar()` existe en la clase `Persona`.

---

## Sobrescritura de métodos

Ahora supongamos:

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

    @Override
    public void saludar() {

        System.out.println("Hola, soy estudiante");

    }

}
```

Creamos:

```java
Persona persona = new Estudiante();
```

Y ejecutamos:

```java
persona.saludar();
```

Salida:

```text
Hola, soy estudiante
```

No imprime:

```text
Hola
```

---

## ¿Por qué ocurre eso?

Porque aunque la referencia sea:

```java
Persona
```

El objeto real es:

```java
Estudiante
```

Java ejecuta el método del objeto real.

Esto es el corazón del polimorfismo.

---

## ¿Qué es `@Override`?

`@Override` indica que un método de la clase hija reemplaza la implementación del método heredado.

Ejemplo:

```java
@Override
public void saludar() {

    System.out.println("Hola, soy estudiante");

}
```

Java verifica que realmente exista un método con ese nombre en la clase padre.

Si no existe, mostrará un error.

---

## Otro ejemplo

Clase padre:

```java
public class Animal {

    public void hacerSonido() {

        System.out.println("Sonido");

    }

}
```

Clases hijas:

```java
public class Perro extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Guau");

    }

}
```

```java
public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Miau");

    }

}
```

Ahora:

```java
Animal animal1 = new Perro();

Animal animal2 = new Gato();
```

Ejecutamos:

```java
animal1.hacerSonido();

animal2.hacerSonido();
```

Salida:

```text
Guau

Miau
```

Aunque ambas referencias son de tipo `Animal`.

---

## ¿Cuál es la ventaja?

Imagina que tenemos diez tipos de animales.

Sin polimorfismo necesitaríamos preguntar constantemente:

```text
¿Es un perro?

¿Es un gato?

¿Es un caballo?
```

Con polimorfismo simplemente hacemos:

```java
animal.hacerSonido();
```

Cada objeto sabe qué debe hacer.

---

## Polimorfismo y colecciones

Supongamos:

```java
List<Persona> personas = new ArrayList<>();
```

Podemos guardar:

```java
new Estudiante()

new Profesor()
```

Porque ambos son personas.

Luego recorrer la lista:

```java
for (Persona persona : personas) {

    persona.saludar();

}
```

Cada objeto ejecutará su propia versión del método.

Más adelante aprenderemos las colecciones con detalle.

---

## Analogía

Piensa en un control remoto.

Todos los televisores tienen un botón:

```text
Encender
```

Pero cada marca implementa ese botón de forma diferente.

Tú siempre presionas el mismo botón.

Cada televisor sabe cómo responder.

Eso es polimorfismo.

---

## Ventajas

- Hace el código más flexible.
- Reduce el uso de múltiples condiciones (`if` o `switch`).
- Facilita agregar nuevas clases.
- Aprovecha la herencia.
- Hace el código más mantenible.

---

## Importante

El polimorfismo depende de la herencia (o de interfaces, que veremos después).

Sin una relación entre clases, no existe polimorfismo.

---

## Error común de principiantes

Pensar que:

```java
Persona persona = new Estudiante();
```

Convierte un estudiante en una persona.

No.

El objeto sigue siendo un estudiante.

Solo estamos utilizando una referencia del tipo padre.

---

## Pregunta típica de entrevista

### ¿Qué es el polimorfismo?

Respuesta corta:

El polimorfismo permite que una referencia de una clase padre pueda apuntar a objetos de distintas clases hijas y que Java ejecute el comportamiento correspondiente al objeto real.

---

## Conceptos clave

- Polimorfismo significa "muchas formas".
- Una referencia del padre puede apuntar a un objeto hijo.
- Java ejecuta el método del objeto real.
- `@Override` reemplaza un método heredado.
- Hace el código más flexible.

---

## Resumen

El polimorfismo permite tratar distintos objetos como si fueran del mismo tipo cuando pertenecen a una misma jerarquía.

Aunque las referencias sean iguales, cada objeto puede comportarse de manera diferente gracias a la sobrescritura de métodos.

---

## Frase para memorizar

```text
Una referencia del padre puede apuntar a cualquier objeto hijo.
```

o

```text
La referencia es una Persona.

El objeto sigue siendo un Estudiante.
```

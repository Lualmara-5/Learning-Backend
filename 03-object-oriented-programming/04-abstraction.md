# Abstraction

## ¿Qué es la abstracción?

La abstracción es uno de los pilares de la Programación Orientada a Objetos.

Su idea principal es:

```text
Mostrar lo que un objeto puede hacer
sin obligarnos a conocer cómo lo hace internamente.
```

La abstracción nos permite trabajar con las características importantes de un objeto y ocultar los detalles innecesarios.

---

## Una analogía sencilla

Imagina que utilizas un teléfono.

Cuando presionas:

```text
Llamar
```

no necesitas saber cómo funciona internamente:

```text
La antena
El procesador
La conexión con la red
El sistema operativo
La transmisión de datos
```

Tú simplemente sabes:

```text
Teléfono → llamar()
```

No necesitas conocer todos los detalles internos para utilizarlo.

Eso es una forma de abstracción.

---

## Abstracción en programación

En programación podemos tener:

```java
public class Auto {

    public void encender() {

        // Muchos procesos internos

    }

}
```

Desde fuera simplemente hacemos:

```java
Auto auto = new Auto();

auto.encender();
```

No necesitamos conocer todo lo que ocurre dentro de `encender()`.

Solo necesitamos saber:

```text
El auto puede encenderse.
```

---

## ¿Qué busca la abstracción?

La abstracción busca separar:

```text
QUÉ puede hacer un objeto
```

de:

```text
CÓMO lo hace internamente
```

Por ejemplo:

```text
¿Qué hace?

encender()
frenar()
acelerar()
```

No necesariamente necesitamos conocer:

```text
¿Cómo funciona internamente el motor?
¿Cómo funciona el sistema de frenos?
¿Cómo calcula la velocidad?
```

---

## Abstracción en Java

Java proporciona principalmente dos mecanismos para trabajar con abstracción:

```text
Clases abstractas

Interfaces
```

En este módulo veremos primero:

```text
Clases abstractas
```

Las interfaces las veremos después.

---

# Clases abstractas

Una clase abstracta es una clase que sirve como base para otras clases.

Se declara utilizando:

```java
abstract
```

Por ejemplo:

```java
public abstract class Animal {

}
```

Observa:

```java
public abstract class Animal
       ↑
   abstracta
```

---

## ¿Puedo crear un objeto de una clase abstracta?

No.

Esto:

```java
Animal animal = new Animal();
```

produce un error.

¿Por qué?

Porque una clase abstracta representa una idea general que todavía no está completamente definida.

Por ejemplo:

```text
Animal
```

es demasiado general.

Podemos tener:

```text
Perro
Gato
Caballo
```

Pero ¿qué significa exactamente crear simplemente un `Animal`?

La clase abstracta sirve como base para las clases concretas.

---

## Ejemplo

Tenemos:

```java
public abstract class Animal {

}
```

Y:

```java
public class Perro extends Animal {

}
```

Ahora sí podemos crear:

```java
Perro perro = new Perro();
```

Pero no:

```java
Animal animal = new Animal();
```

---

# Métodos abstractos

Una clase abstracta puede tener métodos abstractos.

Un método abstracto es un método que declara:

```text
QUÉ debe hacer
```

pero no proporciona:

```text
CÓMO hacerlo
```

Ejemplo:

```java
public abstract class Animal {

    public abstract void hacerSonido();

}
```

Observa:

```java
public abstract void hacerSonido();
```

No tiene cuerpo:

```java
{

}
```

Solo tenemos la declaración.

---

## ¿Qué significa esto?

Estamos diciendo:

```text
Todo Animal debe saber hacer un sonido.
```

Pero no estamos diciendo cuál sonido.

Porque cada animal puede hacerlo de una manera diferente.

---

## Implementación en las clases hijas

Ahora tenemos:

```java
public class Perro extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Guau");

    }

}
```

Y:

```java
public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Miau");

    }

}
```

La clase abstracta establece una obligación:

```text
Animal
    ↓
Debe tener hacerSonido()
```

Cada clase hija decide cómo implementarlo.

---

## ¿Qué está ocurriendo?

Tenemos:

```java
public abstract class Animal {

    public abstract void hacerSonido();

}
```

Esto significa:

```text
Animal dice:

"Todo animal debe tener hacerSonido().
Yo no voy a definir cómo."
```

Después:

```java
public class Perro extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Guau");

    }

}
```

El perro dice:

```text
"Yo sé cómo hacer mi sonido."
```

Y el gato:

```java
public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Miau");

    }

}
```

Dice:

```text
"Yo sé cómo hacer mi sonido."
```

---

# Una clase abstracta puede tener métodos normales

Esto es muy importante.

Una clase abstracta **no tiene que tener solamente métodos abstractos**.

Puede tener:

```text
Métodos abstractos
+
Métodos normales
```

Por ejemplo:

```java
public abstract class Animal {

    public abstract void hacerSonido();

    public void dormir() {

        System.out.println("El animal está durmiendo");

    }

}
```

Aquí tenemos:

```java
hacerSonido()
```

que es abstracto.

Y:

```java
dormir()
```

que es un método normal.

---

## ¿Qué significa esto?

La clase abstracta puede decir:

```text
"Todos los animales deben definir su sonido."
```

Pero también puede proporcionar comportamiento que todos los animales comparten:

```text
"Todos los animales pueden dormir de esta manera."
```

---

# Ejemplo completo

Tenemos:

```java
public abstract class Animal {

    public abstract void hacerSonido();

    public void dormir() {

        System.out.println("El animal está durmiendo");

    }

}
```

Perro:

```java
public class Perro extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Guau");

    }

}
```

Gato:

```java
public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Miau");

    }

}
```

Ahora podemos crear:

```java
Perro perro = new Perro();

Gato gato = new Gato();
```

Y utilizar:

```java
perro.hacerSonido();

gato.hacerSonido();
```

Resultado:

```text
Guau
Miau
```

También ambos heredaron:

```java
dormir()
```

Por lo tanto:

```java
perro.dormir();

gato.dormir();
```

Resultado:

```text
El animal está durmiendo
El animal está durmiendo
```

---

# ¿Por qué utilizar una clase abstracta?

Porque nos permite definir una estructura común para un grupo de clases.

Por ejemplo:

```text
              Animal
             /      \
          Perro     Gato
```

Podemos decir:

```text
Todo Animal:

- puede dormir
- debe tener un sonido
```

Pero cada animal define su propio sonido.

---

# Abstracción + herencia

La abstracción normalmente aparece junto con la herencia.

Por ejemplo:

```text
Animal
   ↑
   |
Perro
```

La clase `Animal` define características generales.

La clase `Perro` proporciona los detalles específicos.

---

# Diferencia entre clase normal y clase abstracta

Una clase normal:

```java
public class Animal {

}
```

Puede utilizarse para crear objetos:

```java
Animal animal = new Animal();
```

Una clase abstracta:

```java
public abstract class Animal {

}
```

No puede utilizarse directamente:

```java
Animal animal = new Animal(); // ERROR
```

Su propósito principal es servir como base para otras clases.

---

# Abstracción y polimorfismo

La abstracción también puede utilizarse junto con el polimorfismo.

Tenemos:

```java
public abstract class Animal {

    public abstract void hacerSonido();

}
```

Después:

```java
public class Perro extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Guau");

    }

}
```

Y:

```java
public class Gato extends Animal {

    @Override
    public void hacerSonido() {

        System.out.println("Miau");

    }

}
```

Podemos hacer:

```java
Animal animal1 = new Perro();

Animal animal2 = new Gato();
```

Y:

```java
animal1.hacerSonido();

animal2.hacerSonido();
```

Resultado:

```text
Guau
Miau
```

Aquí tenemos:

```text
Abstracción
+
Herencia
+
Polimorfismo
```

---

# ¿Qué diferencia hay entre abstracción y encapsulación?

Es común confundirlas.

### Encapsulación

Busca proteger y controlar el acceso a los datos internos.

Por ejemplo:

```java
private double saldo;
```

Y utilizamos métodos para acceder o modificar ese dato.

La idea es:

```text
"Protejo mis datos internos."
```

---

### Abstracción

Busca ocultar detalles de implementación y mostrar solamente lo necesario.

La idea es:

```text
"No necesitas saber cómo funciona internamente.
Solo necesitas saber qué puedes hacer."
```

---

## Una forma sencilla de diferenciarlas

Puedes pensar:

```text
Encapsulación
    ↓
Protejo los datos internos.
```

```text
Abstracción
    ↓
Oculto la complejidad innecesaria.
```

---

# Ejemplo de la vida real

Imagina un cajero automático.

Cuando seleccionas:

```text
Retirar dinero
```

no necesitas conocer:

```text
Cómo se comunica con el banco.
Cómo valida la transacción.
Cómo verifica tu cuenta.
Cómo controla el dinero físico.
Cómo registra la operación.
```

Solo necesitas saber:

```text
Retirar dinero
```

Eso representa una abstracción.

El sistema oculta toda esa complejidad detrás de una operación sencilla.

---

# ¿La abstracción significa esconder absolutamente todo?

No.

No significa que nadie pueda conocer la implementación.

Significa que:

```text
El usuario del objeto no necesita conocer todos los detalles internos
para utilizarlo correctamente.
```

---

# Regla mental

Cuando pienses en abstracción, piensa:

```text
¿Qué necesito saber para utilizar esto?
```

y no:

```text
¿Cómo funciona absolutamente todo por dentro?
```

---

# Ejemplo sencillo

Podemos tener:

```java
public abstract class Pago {

    public abstract void procesarPago();

}
```

Tenemos diferentes métodos de pago:

```java
public class PagoTarjeta extends Pago {

    @Override
    public void procesarPago() {

        System.out.println("Procesando pago con tarjeta");

    }

}
```

Y:

```java
public class PagoEfectivo extends Pago {

    @Override
    public void procesarPago() {

        System.out.println("Procesando pago en efectivo");

    }

}
```

Desde fuera solamente necesitamos saber:

```java
pago.procesarPago();
```

No necesariamente necesitamos conocer todos los detalles de cómo cada tipo de pago realiza el proceso.

---

# Ventajas de la abstracción

- Reduce la complejidad.
- Permite trabajar con conceptos generales.
- Facilita organizar el código.
- Permite definir reglas que las clases hijas deben cumplir.
- Facilita el mantenimiento.
- Permite ocultar detalles de implementación.
- Ayuda a crear sistemas más flexibles.

---

# Errores comunes de principiantes

## Error 1: Pensar que una clase abstracta es una clase incompleta que "no sirve"

Sí sirve.

Su propósito es servir como base para otras clases.

Por ejemplo:

```text
Animal
   ↓
Perro
Gato
Caballo
```

`Animal` define lo común.

---

## Error 2: Pensar que todos los métodos de una clase abstracta deben ser abstractos

No.

Una clase abstracta puede tener:

```text
Métodos abstractos
+
Métodos normales
```

---

## Error 3: Pensar que un método abstracto tiene cuerpo

Esto:

```java
public abstract void hacerSonido();
```

es correcto.

Esto:

```java
public abstract void hacerSonido() {

}
```

no es la forma de declarar un método abstracto.

Un método abstracto no tiene implementación en esa clase.

---

## Error 4: Confundir abstracción con encapsulación

Recuerda:

```text
Encapsulación
→ protege y controla el acceso a los datos.
```

```text
Abstracción
→ oculta complejidad y muestra lo necesario.
```

---

# Pregunta típica de entrevista

### ¿Qué es la abstracción?

Respuesta corta:

La abstracción es un principio de la Programación Orientada a Objetos que permite ocultar los detalles de implementación y mostrar solamente las características o comportamientos relevantes de un objeto.

---

# Otra pregunta típica

### ¿Qué es una clase abstracta?

Respuesta corta:

Una clase abstracta es una clase que no puede ser instanciada directamente y que puede utilizarse como base para otras clases. Puede contener métodos abstractos y métodos con implementación.

---

# Conceptos clave

- La abstracción es uno de los pilares de POO.
- Se enfoca en ocultar detalles innecesarios.
- Una clase abstracta se declara con `abstract`.
- No podemos crear directamente objetos de una clase abstracta.
- Una clase abstracta puede tener métodos abstractos.
- Una clase abstracta también puede tener métodos normales.
- Las clases hijas deben implementar los métodos abstractos.
- Las interfaces también permiten trabajar con abstracción.
- Abstracción y encapsulación son conceptos diferentes.

---

# Resumen

La abstracción consiste en mostrar lo necesario y ocultar los detalles de implementación que no necesitamos conocer para utilizar un objeto.

En Java podemos utilizar clases abstractas para definir una estructura común para un grupo de clases.

Por ejemplo:

```text
              Animal
             /      \
            /        \
        Perro        Gato
```

`Animal` puede decir:

```text
Todo animal debe tener un sonido.
```

Pero no necesita decidir cuál.

Entonces:

```text
Perro → Guau
Gato  → Miau
```

La clase abstracta define la idea general y las clases hijas proporcionan los detalles específicos.

---

# Frase para memorizar

```text
Abstracción = mostrar qué puede hacer algo
              sin obligarnos a conocer cómo lo hace.
```

Y recuerda:

```text
Encapsulación
→ Protege los datos.

Abstracción
→ Oculta la complejidad.

Herencia
→ Permite reutilizar y extender.

Polimorfismo
→ Permite diferentes comportamientos mediante una misma referencia.
```

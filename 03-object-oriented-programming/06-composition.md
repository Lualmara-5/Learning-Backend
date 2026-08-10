# Composition

## ¿Qué es la composición?

La composición es una forma de construir objetos utilizando otros objetos.

La idea principal es:

```text
Un objeto TIENE otro objeto.
```

Por ejemplo:

```text
Un Auto TIENE un Motor.
```

En lugar de decir:

```text
Auto ES un Motor
```

decimos:

```text
Auto TIENE un Motor
```

---

# ¿Por qué existe la composición?

Hasta ahora hemos utilizado mucho la herencia:

```java
public class Perro extends Animal {

}
```

Esto representa:

```text
Perro ES un Animal
```

Pero no todas las relaciones entre objetos son de este tipo.

Por ejemplo:

```text
Auto
Motor
```

Un auto no es un motor.

Un auto **tiene** un motor.

Por eso utilizar herencia sería incorrecto:

```java
public class Auto extends Motor {

}
```

No tiene sentido.

La relación correcta es mediante composición.

---

# Una analogía

Piensa en un computador.

Un computador tiene:

```text
Procesador
Memoria RAM
Disco
Fuente de poder
```

Podemos representarlo conceptualmente como:

```text
Computador
    │
    ├── Procesador
    ├── Memoria
    ├── Disco
    └── Fuente
```

El computador no es un procesador.

El computador **tiene un procesador**.

---

# Composición en Java

Podemos crear una clase:

```java
public class Motor {

    public void encender() {

        System.out.println("Motor encendido");

    }

}
```

Y otra:

```java
public class Auto {

    private Motor motor;

}
```

Ahora:

```text
Auto
 │
 └── Motor
```

El atributo:

```java
private Motor motor;
```

significa que un `Auto` tiene una referencia a un objeto `Motor`.

---

# Crear los objetos

Podemos hacer:

```java
Motor motor = new Motor();

Auto auto = new Auto();
```

Pero necesitamos conectar el motor con el auto.

Una forma común es utilizar un constructor:

```java
public class Auto {

    private Motor motor;

    public Auto(Motor motor) {

        this.motor = motor;

    }

}
```

Entonces:

```java
Motor motor = new Motor();

Auto auto = new Auto(motor);
```

Ahora podemos pensar:

```text
auto
  │
  ▼
motor
```

El objeto `Auto` tiene acceso a un objeto `Motor`.

---

# ¿Qué significa `this.motor = motor`?

Esta línea puede resultar confusa:

```java
this.motor = motor;
```

Tenemos:

```java
private Motor motor;
```

y el constructor:

```java
public Auto(Motor motor) {

    this.motor = motor;

}
```

Hay dos cosas llamadas `motor`.

El parámetro:

```java
Motor motor
```

y el atributo:

```java
private Motor motor;
```

`this.motor` significa:

```text
El atributo motor del objeto actual.
```

Mientras que:

```text
motor
```

sin `this` se refiere al parámetro recibido.

Por lo tanto:

```java
this.motor = motor;
```

significa:

```text
El atributo motor del Auto
=
el Motor que recibimos.
```

---

# Utilizar el objeto interno

Podemos agregar un método:

```java
public class Auto {

    private Motor motor;

    public Auto(Motor motor) {

        this.motor = motor;

    }

    public void encender() {

        motor.encender();

    }

}
```

Ahora:

```java
Motor motor = new Motor();

Auto auto = new Auto(motor);

auto.encender();
```

Resultado:

```text
Motor encendido
```

¿Qué ocurrió?

El `Auto` recibió la orden:

```java
auto.encender();
```

Pero internamente utilizó su:

```text
Motor
```

para realizar el trabajo.

---

# Esto es composición

Tenemos:

```text
Auto
 │
 └── Motor
```

El `Auto` utiliza un objeto `Motor`.

No necesitamos que:

```text
Auto extends Motor
```

Porque:

```text
Auto NO ES un Motor.
```

Es:

```text
Auto TIENE un Motor.
```

---

# Composición vs herencia

Esta es una de las diferencias más importantes de todo el tema.

### Herencia

```java
public class Perro extends Animal {

}
```

Representa:

```text
Perro ES un Animal
```

### Composición

```java
public class Auto {

    private Motor motor;

}
```

Representa:

```text
Auto TIENE un Motor
```

---

# Regla mental

Cuando estés diseñando clases, pregúntate:

```text
¿A ES UN B?
```

Si la respuesta es sí, posiblemente exista una relación de herencia.

Por ejemplo:

```text
Perro ES un Animal
Gato ES un Animal
```

Entonces:

```java
class Perro extends Animal
```

---

Si la respuesta es:

```text
A TIENE un B
```

posiblemente exista una relación de composición.

Por ejemplo:

```text
Auto TIENE un Motor
Computador TIENE un Procesador
Casa TIENE una Puerta
Pedido TIENE Productos
```

---

# Otro ejemplo

Tenemos:

```java
public class Direccion {

    private String ciudad;

}
```

Y:

```java
public class Persona {

    private Direccion direccion;

}
```

Conceptualmente:

```text
Persona
   │
   └── Direccion
```

Una persona tiene una dirección.

No tendría sentido:

```java
public class Persona extends Direccion {

}
```

porque:

```text
Persona NO ES una Dirección.
```

Es:

```text
Persona TIENE una Dirección.
```

---

# Composición y objetos

La composición es posible porque una clase puede tener atributos que sean objetos de otras clases.

Por ejemplo:

```java
public class Persona {

    private Direccion direccion;

}
```

Aquí:

```java
private Direccion direccion;
```

significa que `Persona` tiene una referencia a un objeto `Direccion`.

Esto es completamente normal en Java.

---

# Una clase puede tener muchos objetos

Por ejemplo:

```java
public class Computador {

    private Procesador procesador;

    private Memoria memoria;

    private Disco disco;

}
```

Conceptualmente:

```text
Computador
   │
   ├── Procesador
   ├── Memoria
   └── Disco
```

El computador está compuesto por diferentes objetos.

---

# Composición con varios componentes

Podemos construir un objeto complejo utilizando objetos más pequeños.

Por ejemplo:

```text
Computador
     │
     ├── Procesador
     ├── Memoria
     ├── Disco
     └── Fuente
```

Cada clase puede encargarse de su propia responsabilidad.

Por ejemplo:

```java
public class Procesador {

    public void procesar() {

        System.out.println("Procesando...");

    }

}
```

```java
public class Memoria {

    public void cargar() {

        System.out.println("Cargando memoria...");

    }

}
```

Y:

```java
public class Computador {

    private Procesador procesador;

    private Memoria memoria;

}
```

Ahora `Computador` puede utilizar esos componentes.

---

# ¿Por qué es útil?

La composición permite dividir un sistema en objetos más pequeños y especializados.

En lugar de crear una clase gigantesca:

```text
Computador
```

con absolutamente toda la lógica:

```text
procesador
memoria
disco
red
audio
etc.
```

podemos separar responsabilidades:

```text
Procesador
Memoria
Disco
Red
Audio
```

Y después combinarlas.

---

# Composición y responsabilidades

Imagina:

```text
Pedido
```

Un pedido puede tener:

```text
Cliente
Productos
Direccion
Pago
```

Podemos tener:

```java
public class Pedido {

    private Cliente cliente;

    private Direccion direccion;

    private Pago pago;

}
```

Entonces:

```text
Pedido
 ├── Cliente
 ├── Direccion
 └── Pago
```

Cada objeto tiene una responsabilidad diferente.

---

# Composición vs "hacer todo en una clase"

Sin composición podríamos terminar con clases enormes:

```text
Pedido
 ├── información del cliente
 ├── información de dirección
 ├── lógica de pago
 ├── lógica de productos
 ├── lógica de envío
 ├── etc.
```

Con composición podemos separar:

```text
Pedido
 │
 ├── Cliente
 ├── Direccion
 ├── Pago
 └── Envio
```

Esto ayuda a mantener el código organizado.

---

# Composición y encapsulación

La composición también funciona muy bien junto con la encapsulación.

Por ejemplo:

```java
public class Auto {

    private Motor motor;

}
```

El `motor` es:

```java
private
```

Por lo tanto, el acceso al motor puede controlarse desde `Auto`.

Podemos proporcionar métodos:

```java
public void encender() {

    motor.encender();

}
```

Desde fuera hacemos:

```java
auto.encender();
```

No necesitamos acceder directamente al motor.

---

# Composición y abstracción

También podemos combinar composición con abstracción.

Por ejemplo:

```java
public interface Motor {

    void encender();

}
```

Después:

```java
public class MotorElectrico implements Motor {

    @Override
    public void encender() {

        System.out.println("Motor eléctrico encendido");

    }

}
```

Y:

```java
public class Auto {

    private Motor motor;

}
```

Ahora `Auto` no necesariamente necesita conocer la implementación concreta del motor.

Solo necesita saber:

```text
Motor
→ puede encenderse.
```

Esto combina:

```text
Composición
+
Abstracción
+
Interfaces
```

---

# Composición y polimorfismo

También podemos utilizar polimorfismo.

Tenemos:

```java
public interface Motor {

    void encender();

}
```

Y:

```java
public class MotorElectrico implements Motor {

    @Override
    public void encender() {

        System.out.println("Motor eléctrico");

    }

}
```

También:

```java
public class MotorGasolina implements Motor {

    @Override
    public void encender() {

        System.out.println("Motor de gasolina");

    }

}
```

Entonces:

```java
Motor motor = new MotorElectrico();

Auto auto = new Auto(motor);
```

El `Auto` tiene un:

```text
Motor
```

pero el objeto real puede ser:

```text
MotorElectrico
```

o:

```text
MotorGasolina
```

Esto permite cambiar componentes sin tener que modificar necesariamente la clase `Auto`.

---

# "Composición sobre herencia"

Existe una idea muy conocida en programación:

```text
Prefer composition over inheritance
```

En español:

```text
Preferir composición sobre herencia.
```

Esto no significa:

```text
"La herencia es mala."
```

Significa que no deberíamos utilizar herencia simplemente para reutilizar código cuando la relación realmente no es de:

```text
ES UN
```

Por ejemplo, sería incorrecto:

```java
public class Auto extends Motor {

}
```

solo porque queremos reutilizar métodos de `Motor`.

La relación real es:

```text
Auto TIENE un Motor.
```

Por lo tanto, composición.

---

# ¿Cuándo usar herencia?

Cuando exista una relación clara:

```text
ES UN
```

Por ejemplo:

```text
Perro ES un Animal
Gato ES un Animal
```

Entonces:

```java
class Perro extends Animal
```

puede tener sentido.

---

# ¿Cuándo usar composición?

Cuando exista una relación:

```text
TIENE UN
```

Por ejemplo:

```text
Auto TIENE un Motor
Pedido TIENE un Cliente
Persona TIENE una Direccion
Computador TIENE un Procesador
```

Entonces podemos utilizar atributos de objetos:

```java
private Motor motor;
```

---

# Una diferencia importante

Con herencia:

```java
class Perro extends Animal
```

`Perro` hereda características y comportamiento de `Animal`.

Existe una relación fuerte entre las clases:

```text
Animal
   ↑
Perro
```

Con composición:

```java
class Auto {

    private Motor motor;

}
```

`Auto` utiliza otro objeto como parte de su estructura.

```text
Auto
 │
 └── Motor
```

No significa que `Auto` sea un tipo de `Motor`.

---

# Un ejemplo completo

Tenemos:

```java
public class Motor {

    public void encender() {

        System.out.println("Motor encendido");

    }

}
```

Después:

```java
public class Auto {

    private Motor motor;

    public Auto(Motor motor) {

        this.motor = motor;

    }

    public void encender() {

        motor.encender();

    }

}
```

Y finalmente:

```java
Motor motor = new Motor();

Auto auto = new Auto(motor);

auto.encender();
```

El flujo es:

```text
auto.encender()
       ↓
Auto utiliza su motor
       ↓
motor.encender()
       ↓
"Motor encendido"
```

---

# Error común de principiantes

Pensar:

```text
"Si una clase utiliza otra clase,
entonces debería usar herencia."
```

No.

Utilizar una clase no significa heredar de ella.

Por ejemplo:

```text
Auto utiliza Motor
```

no significa:

```text
Auto ES Motor
```

Significa:

```text
Auto TIENE Motor
```

Por eso usamos composición.

---

# Otro error común

Pensar que composición significa necesariamente que el objeto interno no puede existir sin el externo.

No siempre necesitamos preocuparnos por esa distinción al principio.

Lo importante ahora es entender:

```text
Una clase puede contener objetos de otras clases
como parte de su estructura.
```

Más adelante podemos diferenciar conceptos más específicos como:

```text
Composición
Agregación
```

pero por ahora no necesitamos complicarlo.

---

# Composición vs agregación

Aunque son conceptos relacionados, no vamos a profundizar todavía.

Ambos representan relaciones de:

```text
TIENE UN
```

La diferencia está principalmente en qué tan fuerte es la relación entre los objetos y su ciclo de vida.

Por ahora quédate con:

```text
TIENE UN → composición/agregación
```

Y más adelante podremos profundizar si es necesario.

---

# Conceptos clave

- La composición permite construir objetos utilizando otros objetos.
- Representa una relación de "TIENE UN".
- Se implementa normalmente mediante atributos que son objetos de otras clases.
- No debemos utilizar herencia solamente para reutilizar código.
- Herencia representa "ES UN".
- Composición representa "TIENE UN".
- La composición permite separar responsabilidades.
- Una clase puede tener muchos objetos como componentes.
- Puede combinarse con encapsulación.
- Puede combinarse con abstracción.
- Puede combinarse con interfaces.
- Puede combinarse con polimorfismo.

---

# Resumen

La composición consiste en construir objetos complejos utilizando otros objetos.

Por ejemplo:

```text
Auto
 │
 └── Motor
```

El `Auto` no es un `Motor`.

El `Auto` **tiene un Motor**.

En Java podemos representar esto mediante un atributo:

```java
public class Auto {

    private Motor motor;

}
```

Mientras que la herencia representa:

```text
Perro ES un Animal
```

y se expresa mediante:

```java
public class Perro extends Animal {

}
```

La regla mental más importante es:

```text
ES UN
→ Herencia

TIENE UN
→ Composición
```

---

# Frase para memorizar

```text
Herencia:
"Soy una versión de esto."

Composición:
"Tengo una cosa que hace esto."
```

O todavía más sencillo:

```text
ES UN  → extends

TIENE UN → atributo de otra clase
```

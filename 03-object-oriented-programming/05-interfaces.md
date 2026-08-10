# Interfaces

## ¿Qué es una interfaz?

Una interfaz es una forma de definir un **contrato** que una clase debe cumplir.

Una interfaz puede decir:

```text
Si una clase implementa esta interfaz,
debe proporcionar ciertos comportamientos.
```

La interfaz se enfoca principalmente en:

```text
QUÉ debe poder hacer algo
```

y no en:

```text
CÓMO lo hace.
```

---

## Una analogía

Imagina una empresa.

La empresa establece un requisito:

```text
Todo empleado que trabaje como conductor
debe poder conducir.
```

La empresa no necesariamente dice:

```text
Exactamente cómo debes conducir.
```

Solo establece el requisito:

```text
conducir()
```

Cada persona puede realizar esa tarea de una manera diferente.

La interfaz funciona de una manera parecida.

---

# Crear una interfaz

En Java utilizamos:

```java
interface
```

Por ejemplo:

```java
public interface Volador {

}
```

Tenemos una interfaz llamada:

```text
Volador
```

Podemos colocar dentro comportamientos que las clases deberán cumplir.

Por ejemplo:

```java
public interface Volador {

    void volar();

}
```

Estamos diciendo:

```text
Cualquier clase que implemente Volador
debe tener un método volar().
```

---

# Implementar una interfaz

Una clase utiliza:

```java
implements
```

para implementar una interfaz.

Por ejemplo:

```java
public class Pajaro implements Volador {

    @Override
    public void volar() {

        System.out.println("El pájaro está volando");

    }

}
```

Observa:

```java
public class Pajaro implements Volador
                    ↑
                implements
```

La clase `Pajaro` está diciendo:

```text
"Yo acepto el contrato de Volador."
```

Por lo tanto debe implementar:

```java
volar()
```

---

# ¿Qué pasa si no implemento el método?

Tenemos:

```java
public interface Volador {

    void volar();

}
```

Y:

```java
public class Pajaro implements Volador {

}
```

Esto produce un error.

¿Por qué?

Porque `Pajaro` está diciendo:

```text
"Implemento Volador."
```

Pero no está cumpliendo el contrato.

La interfaz exige:

```text
volar()
```

Por lo tanto debemos implementar el método.

---

# Ejemplo completo

Interfaz:

```java
public interface Volador {

    void volar();

}
```

Pájaro:

```java
public class Pajaro implements Volador {

    @Override
    public void volar() {

        System.out.println("El pájaro vuela");

    }

}
```

Avión:

```java
public class Avion implements Volador {

    @Override
    public void volar() {

        System.out.println("El avión vuela");

    }

}
```

Ahora tenemos:

```text
Volador
   ↑
   |
 ┌─┴────────┐
Pajaro     Avion
```

Ambos pueden volar.

Pero no son el mismo tipo de objeto.

```text
Pajaro ≠ Avion
```

---

# ¿Por qué usar una interfaz?

Aquí aparece una de las ideas más importantes.

Una interfaz permite definir una capacidad.

Por ejemplo:

```text
Volador
```

no necesariamente representa una familia de objetos.

Representa una capacidad:

```text
"Puede volar."
```

Por eso podemos tener:

```text
Pájaro → puede volar
Avión → puede volar
Murciélago → puede volar
```

No necesariamente tienen que pertenecer a la misma clase padre.

---

# Herencia vs interfaz

Supongamos:

```java
public class Perro extends Animal {

}
```

Aquí estamos diciendo:

```text
Perro ES un Animal.
```

La herencia representa una relación de:

```text
ES UN
```

---

En cambio:

```java
public class Perro implements Nadador {

}
```

estamos diciendo:

```text
Perro PUEDE nadar.
```

La interfaz representa una capacidad o contrato.

Una forma sencilla de recordarlo:

```text
extends
→ ES UN

implements
→ PUEDE HACER
```

---

# Una clase puede implementar varias interfaces

Esta es una de las grandes ventajas de las interfaces.

Una clase puede implementar varias interfaces.

Por ejemplo:

```java
public interface Volador {

    void volar();

}
```

Y:

```java
public interface Nadador {

    void nadar();

}
```

Ahora:

```java
public class Pato implements Volador, Nadador {

    @Override
    public void volar() {

        System.out.println("El pato vuela");

    }

    @Override
    public void nadar() {

        System.out.println("El pato nada");

    }

}
```

El pato puede:

```text
Volar
Nadar
```

Por eso puede implementar ambas interfaces.

---

# ¿Por qué esto es importante?

Java no permite que una clase herede de varias clases.

Esto no es válido:

```java
public class Pato extends Animal, Ave {

}
```

Una clase no puede extender dos clases.

Pero sí puede implementar varias interfaces:

```java
public class Pato implements Volador, Nadador {

}
```

Esto permite combinar diferentes capacidades.

---

# Una interfaz como contrato

Piensa en una interfaz como un contrato.

Por ejemplo:

```java
public interface Pagable {

    void pagar();

}
```

Estamos diciendo:

```text
Si implementas Pagable,
debes saber pagar.
```

Ahora:

```java
public class Tarjeta implements Pagable {

    @Override
    public void pagar() {

        System.out.println("Pago con tarjeta");

    }

}
```

Y:

```java
public class Efectivo implements Pagable {

    @Override
    public void pagar() {

        System.out.println("Pago en efectivo");

    }

}
```

Ambos cumplen el mismo contrato:

```text
Pagable
    ↓
pagar()
```

Pero cada uno lo implementa de una manera diferente.

---

# Interfaces y abstracción

Las interfaces también permiten trabajar con abstracción.

Tenemos:

```java
public interface Pagable {

    void pagar();

}
```

La interfaz dice:

```text
"Debe existir pagar()."
```

Pero no necesariamente dice:

```text
"Así exactamente debes procesar el pago."
```

Eso lo decide cada clase.

Por ejemplo:

```text
Tarjeta
→ validar tarjeta
→ contactar banco
→ procesar pago

Efectivo
→ recibir dinero
→ calcular cambio
→ registrar pago
```

La interfaz solamente establece:

```text
pagar()
```

---

# Interfaces y polimorfismo

Aquí empieza a aparecer nuevamente el polimorfismo.

Podemos hacer:

```java
Pagable pago1 = new Tarjeta();

Pagable pago2 = new Efectivo();
```

Aunque:

```text
Tarjeta ≠ Efectivo
```

ambos son:

```text
Pagable
```

porque implementan esa interfaz.

Entonces podemos hacer:

```java
pago1.pagar();

pago2.pagar();
```

Resultado:

```text
Pago con tarjeta
Pago en efectivo
```

Esto se parece mucho a lo que vimos anteriormente:

```java
Animal animal = new Perro();
```

La diferencia es que ahora la relación no necesariamente viene de una clase padre.

Puede venir de una interfaz.

---

# Interfaces y colecciones

Aquí nuevamente aparece un caso donde el concepto empieza a ser bastante útil.

Supongamos:

```java
List<Pagable> pagos = new ArrayList<>();
```

Podemos guardar:

```java
pagos.add(new Tarjeta());

pagos.add(new Efectivo());
```

Después:

```java
for (Pagable pago : pagos) {

    pago.pagar();

}
```

Cada objeto ejecutará su propia implementación.

Tenemos:

```text
Tarjeta  → pagar()
Efectivo → pagar()
```

Pero nuestro código solamente necesita saber:

```text
Pagable
```

---

# Una interfaz no es una clase padre

Esto es importante.

Cuando tenemos:

```java
public class Perro extends Animal
```

`Animal` es una clase.

Cuando tenemos:

```java
public class Perro implements Nadador
```

`Nadador` es una interfaz.

No son exactamente lo mismo.

Podemos pensar:

```text
Clase abstracta
→ representa una base común.

Interfaz
→ representa un contrato o capacidad.
```

---

# ¿Una interfaz puede tener atributos?

Sí, pero funcionan de una manera particular.

Los campos declarados en una interfaz son constantes.

Por ejemplo:

```java
public interface Configuracion {

    int MAX_INTENTOS = 3;

}
```

No podemos utilizar una interfaz como un objeto para guardar un estado individual.

Las interfaces están principalmente orientadas a definir contratos.

No necesitamos profundizar demasiado en esto todavía.

---

# ¿Una interfaz puede tener métodos con implementación?

Sí.

Las interfaces modernas de Java pueden tener métodos `default` y `static`.

Por ejemplo:

```java
public interface Volador {

    void volar();

    default void aterrizar() {

        System.out.println("Aterrizando");

    }

}
```

Pero por ahora lo importante es entender:

```text
Método abstracto
→ establece el contrato.

default
→ puede proporcionar una implementación.
```

No necesitamos profundizar en `default` todavía.

---

# Diferencia visual

Podemos pensar en una clase abstracta:

```text
             Animal
                ↑
                |
        ┌───────┴───────┐
        |               |
      Perro            Gato
```

Representa una relación:

```text
Perro ES un Animal
Gato ES un Animal
```

Mientras una interfaz:

```text
          Volador
          /     \
         /       \
     Pajaro      Avion
```

Representa:

```text
Pajaro PUEDE volar
Avion  PUEDE volar
```

---

# Una clase puede tener ambas cosas

Una clase puede extender una clase y además implementar interfaces.

Por ejemplo:

```java
public class Pato extends Animal implements Volador, Nadador {

}
```

Esto significa:

```text
Pato ES un Animal.

Pato PUEDE volar.

Pato PUEDE nadar.
```

Es una combinación muy poderosa.

---

# Ejemplo más realista

Imaginemos un sistema de pagos.

Tenemos:

```java
public interface Pagable {

    void pagar();

}
```

Después:

```java
public class Tarjeta implements Pagable {

    @Override
    public void pagar() {

        System.out.println("Procesando tarjeta");

    }

}
```

Y:

```java
public class Transferencia implements Pagable {

    @Override
    public void pagar() {

        System.out.println("Procesando transferencia");

    }

}
```

Ahora podemos crear:

```java
Pagable pago1 = new Tarjeta();

Pagable pago2 = new Transferencia();
```

Y:

```java
pago1.pagar();

pago2.pagar();
```

Nuestro código puede trabajar con:

```text
Pagable
```

sin necesitar conocer todos los tipos concretos.

---

# ¿Qué problema solucionan las interfaces?

Principalmente permiten que diferentes clases puedan cumplir el mismo contrato sin necesidad de pertenecer a la misma jerarquía de herencia.

Por ejemplo:

```text
Tarjeta
Transferencia
Efectivo
PayPal
```

Todas pueden implementar:

```text
Pagable
```

Aunque cada una funcione internamente de manera diferente.

---

# Error común de principiantes

Pensar:

```text
interface = clase abstracta
```

No exactamente.

Tienen similitudes porque ambas permiten definir contratos y trabajar con abstracción.

Pero conceptualmente:

```text
Clase abstracta
→ puede representar una base común.

Interfaz
→ define un contrato/capacidad.
```

---

# Otro error común

Pensar que `implements` significa:

```text
"heredar de"
```

Es mejor pensar:

```text
implements
→ "cumplo este contrato"
```

Por ejemplo:

```java
public class Pato implements Volador {

}
```

Puedes leerlo:

```text
"Pato implementa Volador."
```

o mentalmente:

```text
"Pato cumple el contrato de Volador."
```

---

# `extends` vs `implements`

Memoriza esta diferencia:

```java
public class Perro extends Animal {

}
```

Significa:

```text
Perro ES un Animal.
```

Mientras:

```java
public class Perro implements Nadador {

}
```

Significa:

```text
Perro PUEDE nadar.
```

---

# Pregunta típica de entrevista

### ¿Qué es una interfaz?

Respuesta corta:

Una interfaz es un contrato que define comportamientos que una clase debe implementar. Permite establecer qué puede hacer una clase sin depender de una implementación concreta.

---

# Otra pregunta típica

### ¿Cuál es la diferencia entre `extends` e `implements`?

Respuesta corta:

`extends` se utiliza para heredar de una clase, mientras `implements` se utiliza para que una clase cumpla el contrato definido por una o más interfaces.

---

# Conceptos clave

- Una interfaz define un contrato.
- Se declara con `interface`.
- Una clase utiliza `implements` para implementar una interfaz.
- Las clases que implementan una interfaz deben cumplir su contrato.
- Una interfaz representa normalmente una capacidad o comportamiento.
- Una clase puede implementar varias interfaces.
- Una clase solo puede extender una clase.
- Las interfaces permiten trabajar con abstracción.
- Las interfaces también permiten polimorfismo.
- `extends` → relación "ES UN".
- `implements` → relación "PUEDE HACER / CUMPLE EL CONTRATO".

---

# Resumen

Una interfaz permite definir un contrato que diferentes clases pueden cumplir.

Por ejemplo:

```text
              Pagable
              /     \
             /       \
        Tarjeta     Efectivo
```

La interfaz dice:

```text
Todo Pagable debe tener:

pagar()
```

Pero cada clase decide cómo hacerlo:

```text
Tarjeta
→ procesa el pago con tarjeta.

Efectivo
→ procesa el pago en efectivo.
```

La interfaz no necesita saber todos esos detalles.

Solo establece el contrato:

```text
"Si eres Pagable, debes poder pagar."
```

---

# Frase para memorizar

```text
Interfaz = contrato.

"No me importa quién eres.
Me importa que cumplas lo que prometiste."
```

Y recuerda:

```text
extends
→ ES UN

implements
→ PUEDE HACER / CUMPLE UN CONTRATO
```

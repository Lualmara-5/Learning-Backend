# Encapsulation

## ¿Qué es la encapsulación?

La encapsulación es uno de los pilares de la Programación Orientada a Objetos.

Su objetivo es proteger los datos de un objeto y controlar cómo pueden ser accedidos o modificados.

En lugar de permitir que cualquier parte del programa cambie los atributos libremente, la clase decide qué está permitido y qué no.

---

## El problema de los atributos públicos

Supongamos la siguiente clase:

```java
public class Persona {

    public String nombre;
    public int edad;

}
```

Creamos un objeto:

```java
Persona persona1 = new Persona();

persona1.nombre = "Alejo";
persona1.edad = 20;
```

Hasta aquí parece correcto.

Pero también podríamos hacer esto:

```java
persona1.edad = -50;
```

O incluso:

```java
persona1.nombre = null;
```

El problema es que cualquier parte del programa puede modificar los atributos sin ninguna validación.

---

## La idea principal de la encapsulación

La encapsulación consiste en ocultar los atributos y permitir el acceso mediante métodos controlados.

En Java normalmente esto se hace utilizando:

```java
private
```

---

## Atributos privados

Ejemplo:

```java
public class Persona {

    private String nombre;
    private int edad;

}
```

Ahora intentemos hacer esto:

```java
Persona persona1 = new Persona();

persona1.nombre = "Alejo";
```

Java producirá un error.

¿Por qué?

Porque los atributos privados solo pueden ser accedidos desde la propia clase.

---

## ¿Cómo acceder entonces?

Utilizando métodos públicos.

Normalmente se usan:

```text
getters
```

para obtener información.

Y:

```text
setters
```

para modificar información.

---

## Getter

Ejemplo:

```java
public class Persona {

    private String nombre;

    public String getNombre() {

        return nombre;

    }

}
```

Uso:

```java
Persona persona1 = new Persona();

String nombre = persona1.getNombre();
```

El método devuelve el valor del atributo.

---

## Setter

Ejemplo:

```java
public class Persona {

    private String nombre;

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

}
```

Uso:

```java
persona1.setNombre("Alejo");
```

Ahora el atributo se modifica a través de un método.

---

## Getters y setters juntos

Clase completa:

```java
public class Persona {

    private String nombre;
    private int edad;

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getEdad() {

        return edad;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

}
```

Uso:

```java
Persona persona1 = new Persona();

persona1.setNombre("Alejo");
persona1.setEdad(20);

System.out.println(persona1.getNombre());
System.out.println(persona1.getEdad());
```

---

## ¿Por qué es mejor?

Porque ahora podemos validar la información antes de modificarla.

Por ejemplo:

```java
public void setEdad(int edad) {

    if (edad >= 0) {

        this.edad = edad;

    }

}
```

Ahora esto:

```java
persona1.setEdad(-50);
```

No modificará la edad.

La clase protege sus propios datos.

---

## Encapsulación no significa esconder todo

Un error común es pensar que encapsular significa volver todo privado.

La idea no es ocultar información sin razón.

La idea es controlar el acceso.

Por ejemplo:

```java
private double saldo;
```

Puede ser privado.

Pero un método público puede permitir consultar el saldo:

```java
public double getSaldo() {

    return saldo;

}
```

---

## Ejemplo real: Cuenta Bancaria

Sin encapsulación:

```java
public class CuentaBancaria {

    public double saldo;

}
```

Cualquier persona podría hacer:

```java
cuenta.saldo = -1000000;
```

Lo cual no tiene sentido.

Con encapsulación:

```java
public class CuentaBancaria {

    private double saldo;

    public double getSaldo() {

        return saldo;

    }

    public void depositar(double monto) {

        if (monto > 0) {

            saldo += monto;

        }

    }

}
```

Ahora el saldo solo puede modificarse mediante reglas definidas por la clase.

---

## Relación con el mundo real

Piensa en un cajero automático.

No tienes acceso directo al dinero que hay dentro.

Solo puedes interactuar mediante opciones controladas:

```text
Consultar saldo
Depositar dinero
Retirar dinero
```

Eso es encapsulación.

Los datos internos están protegidos.

---

## Ventajas de la encapsulación

- Protege los datos.
- Evita estados inválidos.
- Facilita el mantenimiento del código.
- Reduce errores.
- Permite cambiar la implementación interna sin afectar otras partes del programa.

---

## Importante

Encapsulación NO significa:

```text
private + getters + setters
```

Eso es una forma común de implementarla.

La verdadera idea es:

```text
Ocultar los detalles internos y controlar el acceso a ellos.
```

---

## Analogía

Objeto:

```text
Automóvil
```

Datos internos:

```text
Motor
Combustible
Sistema eléctrico
```

Tú no interactúas directamente con esos componentes.

Utilizas controles:

```text
Acelerar
Frenar
Encender
```

La encapsulación protege la complejidad interna.

---

## Error común de principiantes

Pensar que los getters y setters existen únicamente porque Java lo exige.

Java no los exige.

Se utilizan porque permiten controlar el acceso a los atributos.

---

## Pregunta típica de entrevista

### ¿Qué es la encapsulación?

Respuesta corta:

La encapsulación es el principio de ocultar los datos internos de un objeto y controlar su acceso mediante métodos definidos por la propia clase.

---

## Conceptos clave

- La encapsulación protege los datos.
- Los atributos suelen declararse como `private`.
- Los métodos públicos permiten acceder a los datos.
- Los getters obtienen información.
- Los setters modifican información.
- Permite validar datos antes de almacenarlos.

---

## Resumen

La encapsulación consiste en ocultar los detalles internos de un objeto y permitir que la propia clase controle cómo se accede o modifica su información.

Gracias a ella los objetos pueden proteger sus datos y evitar estados inválidos.

---

## Frase para memorizar

```text
Encapsular = proteger datos y controlar el acceso.
```

o

```text
Los datos pertenecen al objeto.
El objeto decide cómo usarlos.
```

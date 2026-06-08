# Conditions

## ¿Qué es una condición?

Una condición es una expresión que puede ser evaluada como:

```java
true
```

o

```java
false
```

Las condiciones permiten que un programa tome decisiones.

Gracias a ellas, el programa puede ejecutar diferentes instrucciones dependiendo de una situación específica.

---

## ¿Por qué son importantes?

Sin condiciones, todos los programas ejecutarían exactamente las mismas instrucciones siempre.

Las condiciones permiten crear comportamientos como:

- Verificar si un usuario puede iniciar sesión.
- Determinar si una persona es mayor de edad.
- Comprobar si un producto tiene stock.
- Validar una contraseña.
- Mostrar mensajes diferentes según una situación.

---

## La estructura if

La forma más simple de una condición es mediante `if`.

```java
if (condicion) {
    // instrucciones
}
```

La palabra `if` significa:

> "Si esta condición es verdadera, ejecuta el bloque de código."

---

## Ejemplo básico

```java
int edad = 20;

if (edad >= 18) {
    System.out.println("Mayor de edad");
}
```

Resultado:

```text
Mayor de edad
```

La condición:

```java
edad >= 18
```

se evalúa como:

```java
true
```

Por lo tanto, el bloque se ejecuta.

---

## Cuando la condición es falsa

```java
int edad = 15;

if (edad >= 18) {
    System.out.println("Mayor de edad");
}
```

Resultado:

```text
(nada)
```

La condición es falsa.

Por lo tanto, el bloque no se ejecuta.

---

## Operadores de comparación

Las condiciones suelen utilizar operadores de comparación.

### Igual que

```java
==
```

Ejemplo:

```java
edad == 18
```

---

### Diferente de

```java
!=
```

Ejemplo:

```java
edad != 18
```

---

### Mayor que

```java
>
```

Ejemplo:

```java
edad > 18
```

---

### Menor que

```java
<
```

Ejemplo:

```java
edad < 18
```

---

### Mayor o igual que

```java
>=
```

Ejemplo:

```java
edad >= 18
```

---

### Menor o igual que

```java
<=
```

Ejemplo:

```java
edad <= 18
```

---

## if - else

Muchas veces necesitamos ejecutar una acción cuando la condición es verdadera y otra cuando es falsa.

Para eso existe `else`.

```java
if (condicion) {
    // verdadero
} else {
    // falso
}
```

Ejemplo:

```java
int edad = 15;

if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}
```

Resultado:

```text
Menor de edad
```

---

## if - else if - else

Cuando existen múltiples posibilidades podemos utilizar `else if`.

```java
if (condicion1) {

} else if (condicion2) {

} else {

}
```

Ejemplo:

```java
int nota = 75;

if (nota >= 90) {
    System.out.println("Excelente");
} else if (nota >= 70) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}
```

Resultado:

```text
Aprobado
```

---

## Variables boolean

Las condiciones trabajan muy bien con variables boolean.

```java
boolean activo = true;

if (activo) {
    System.out.println("Usuario activo");
}
```

Resultado:

```text
Usuario activo
```

---

## Errores comunes

### Confundir = con ==

Incorrecto:

```java
if (edad = 18)
```

Correcto:

```java
if (edad == 18)
```

Recordatorio:

```java
=   -> asignación

==  -> comparación
```

---

## Ejemplo completo

```java
public class Main {

    public static void main(String[] args) {

        int edad = 20;

        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Acceso denegado");
        }

    }
}
```

Resultado:

```text
Puede ingresar
```

---

## Conceptos clave

- Una condición siempre produce `true` o `false`.
- `if` ejecuta código cuando la condición es verdadera.
- `else` ejecuta código cuando la condición es falsa.
- `else if` permite evaluar múltiples escenarios.
- Los operadores de comparación permiten construir condiciones.

---

## Resumen

Las condiciones permiten que un programa tome decisiones.

Son la base de la lógica de programación y están presentes en prácticamente cualquier aplicación, desde una calculadora hasta un sistema bancario.

Gracias a las condiciones, un programa puede reaccionar de manera diferente según los datos que recibe.

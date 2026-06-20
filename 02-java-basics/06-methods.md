# Methods

## ¿Qué es un método?

Un método es un bloque de código que realiza una tarea específica.

Los métodos permiten organizar el código y reutilizar lógica sin necesidad de repetir instrucciones.

---

## ¿Por qué usar métodos?

Supongamos que queremos mostrar un saludo varias veces.

Sin métodos:

```java
System.out.println("Hola");
System.out.println("Hola");
System.out.println("Hola");
```

Con métodos:

```java
saludar();
saludar();
saludar();
```

El código es más limpio y fácil de mantener.

---

## Crear un método

Ejemplo:

```java
public void saludar() {

    System.out.println("Hola");

}
```

---

## Partes de un método

```java
public void saludar() {

    System.out.println("Hola");

}
```

### Modificador de acceso

```java
public
```

Indica desde dónde puede ser utilizado el método.

Por ahora utilizaremos principalmente `public`.

---

### Tipo de retorno

```java
void
```

Indica qué devuelve el método.

`void` significa:

```text
No devuelve ningún valor
```

---

### Nombre del método

```java
saludar
```

Es el identificador del método.

Debe describir claramente su función.

---

### Parámetros

```java
()
```

Los parámetros son datos que el método puede recibir.

En este caso no recibe ninguno.

---

### Cuerpo del método

```java
{
    System.out.println("Hola");
}
```

Contiene las instrucciones que ejecutará el método.

---

## Llamar un método

Supongamos:

```java
public class Persona {

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Creamos un objeto:

```java
Persona persona1 = new Persona();
```

Llamamos el método:

```java
persona1.saludar();
```

Resultado:

```text
Hola
```

---

## Métodos con parámetros

Un método puede recibir información.

Ejemplo:

```java
public void saludar(String nombre) {

    System.out.println("Hola " + nombre);

}
```

Llamada:

```java
persona1.saludar("Alejo");
```

Resultado:

```text
Hola Alejo
```

---

## Métodos que retornan valores

Un método también puede devolver información.

Ejemplo:

```java
public int sumar(int a, int b) {

    return a + b;

}
```

Uso:

```java
int resultado = sumar(5, 3);
```

Resultado:

```text
8
```

---

## La palabra return

`return` finaliza la ejecución del método y devuelve un valor.

Ejemplo:

```java
public int obtenerEdad() {

    return 20;

}
```

---

## Métodos sin retorno

Cuando utilizamos:

```java
void
```

no es obligatorio utilizar `return`.

Ejemplo:

```java
public void mostrarMensaje() {

    System.out.println("Bienvenido");

}
```

---

## Métodos y objetos

Los métodos normalmente describen comportamientos de los objetos.

Clase:

```java
public class Persona {

    String nombre;

    public void saludar() {

        System.out.println("Hola");

    }

}
```

Objeto:

```java
Persona persona1 = new Persona();
```

Llamada:

```java
persona1.saludar();
```

---

## Analogía

Clase:

```text
Persona
```

Atributos:

```text
nombre
edad
```

Métodos:

```text
saludar()
caminar()
estudiar()
```

Los atributos representan datos.

Los métodos representan acciones o comportamientos.

---

## Error común de principiantes

Pensar que un método y un constructor son lo mismo.

No lo son.

Método:

```java
public void saludar() {

}
```

Constructor:

```java
public Persona() {

}
```

El constructor se ejecuta al crear el objeto.

Los métodos se ejecutan cuando los llamamos explícitamente.

---

## Pregunta típica de entrevista

### ¿Qué es un método?

Respuesta corta:

Un método es un bloque de código que define un comportamiento o acción que puede ejecutar un objeto o una clase.

---

## Conceptos clave

- Un método define una acción.
- Puede recibir parámetros.
- Puede devolver valores.
- Puede ser llamado múltiples veces.
- Ayuda a reutilizar código.
- Los métodos representan comportamientos de los objetos.

---

## Resumen

Los métodos permiten encapsular comportamientos dentro de las clases.

Gracias a ellos podemos organizar mejor el código, reutilizar lógica y definir las acciones que pueden realizar los objetos.

---

## Frase para memorizar

```text
Atributos = Datos

Métodos = Acciones
```

o

```text
Los objetos tienen estado y comportamiento.

Estado → atributos
Comportamiento → métodos
```

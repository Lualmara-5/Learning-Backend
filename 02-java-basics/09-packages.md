# Packages

## ¿Qué es un Package?

Un package es un mecanismo que utiliza Java para organizar clases relacionadas.

Podemos pensar en un package como una carpeta lógica dentro de un proyecto.

Su objetivo principal es mantener el código organizado y evitar conflictos entre clases con el mismo nombre.

---

## ¿Por qué existen los Packages?

Imagina un proyecto grande.

```text
Proyecto
│
├── Persona.java
├── Usuario.java
├── Producto.java
├── Pedido.java
├── Factura.java
├── Cliente.java
├── Empleado.java
├── Inventario.java
└── ...
```

Con pocas clases no hay problema.

Pero cuando un proyecto tiene decenas o cientos de clases, encontrar algo se vuelve complicado.

Los packages permiten agrupar clases relacionadas.

---

## Ejemplo de organización

Podríamos organizar el proyecto así:

```text
com.miempresa

├── usuarios
│   ├── Usuario.java
│   ├── Cliente.java
│   └── Empleado.java
│
├── productos
│   ├── Producto.java
│   └── Inventario.java
│
└── ventas
    ├── Pedido.java
    └── Factura.java
```

Ahora es mucho más fácil encontrar cada clase.

---

## Declarar un Package

La primera línea de un archivo Java puede indicar a qué package pertenece.

Ejemplo:

```java
package usuarios;

public class Usuario {

}
```

Esto indica que la clase pertenece al package:

```text
usuarios
```

---

## Estructura típica

Supongamos:

```java
package usuarios;

public class Usuario {

}
```

Normalmente el archivo estará ubicado en:

```text
usuarios/
└── Usuario.java
```

---

## Importar clases de otro Package

Supongamos que existe:

```java
package usuarios;

public class Usuario {

}
```

Y queremos usarla desde otra clase.

Utilizamos `import`.

```java
import usuarios.Usuario;
```

Ahora podemos crear objetos normalmente.

```java
Usuario usuario1 = new Usuario();
```

---

## Ejemplo completo

Clase:

```java
package usuarios;

public class Usuario {

}
```

Otra clase:

```java
import usuarios.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

    }

}
```

---

## Importar múltiples clases

Podemos importar todas las clases de un package.

```java
import usuarios.*;
```

El asterisco significa:

```text
Importa todas las clases del package
```

---

## Packages de la librería estándar

Java incluye miles de clases organizadas en packages.

Por ejemplo:

```java
import java.util.Scanner;
```

Aquí:

```text
java
 └─ util
     └─ Scanner
```

---

Otro ejemplo:

```java
import java.util.ArrayList;
```

Aquí:

```text
java
 └─ util
     └─ ArrayList
```

---

## Package y nombre completo

Dos clases pueden tener el mismo nombre si están en packages diferentes.

Ejemplo:

```text
usuarios.Usuario
```

y

```text
administracion.Usuario
```

No existe conflicto porque pertenecen a packages distintos.

El nombre completo incluye el package.

---

## Analogía

Imagina una universidad.

```text
Universidad
│
├── Ingeniería
├── Medicina
├── Derecho
└── Arquitectura
```

La universidad es el proyecto.

Cada facultad sería un package.

Los estudiantes serían las clases.

---

## Error común de principiantes

Pensar que un package es solamente una carpeta.

Aunque normalmente coincide con una carpeta, un package representa una organización lógica dentro del proyecto.

---

## Pregunta típica de entrevista

### ¿Qué es un package?

Respuesta corta:

Un package es un mecanismo utilizado por Java para organizar clases relacionadas y evitar conflictos de nombres.

---

## Conceptos clave

- Un package agrupa clases relacionadas.
- Ayuda a organizar proyectos grandes.
- Se declara usando la palabra clave `package`.
- Las clases de otros packages pueden utilizarse mediante `import`.
- Java organiza sus librerías utilizando packages.

---

## Resumen

Los packages permiten organizar el código en grupos lógicos de clases relacionadas.

Gracias a ellos es posible mantener proyectos grandes ordenados, reutilizar clases fácilmente y evitar conflictos entre nombres.

---

## Frase para memorizar

```text
Package = grupo organizado de clases relacionadas
```

o

```text
Proyecto → Packages → Clases
```

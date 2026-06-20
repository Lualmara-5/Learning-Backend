# Mini Projects

## Objetivo

Estos ejercicios tienen como propósito reforzar los conceptos aprendidos en:

- Classes
- Objects
- Methods
- Constructors
- Static
- Packages

La idea no es memorizar sintaxis, sino comprender cómo se relacionan las clases, los objetos y la organización del código en Java.

---

## Estado

- [ ] Proyecto 1 - Student Manager
- [ ] Proyecto 2 - Book Catalog
- [ ] Proyecto 3 - Object Counter
- [ ] Proyecto 4 - Static Calculator
- [ ] Proyecto 5 - Package Organization

---

# Proyecto 1 - Student Manager

## Objetivo

Crear una clase llamada `Student`.

La clase debe contener:

```java
String name;
int age;
```

Crear un constructor que reciba ambos atributos.

Agregar un método que muestre la información del estudiante.

Crear al menos tres estudiantes e imprimir sus datos.

## Conceptos utilizados

- Classes
- Objects
- Constructors
- Methods

## Ejemplo de salida

```text
Name: Alejo
Age: 20

Name: Juan
Age: 25

Name: Maria
Age: 19
```

---

# Proyecto 2 - Book Catalog

## Objetivo

Crear una clase llamada `Book`.

La clase debe contener:

```java
String title;
String author;
```

Crear un constructor para inicializar ambos atributos.

Agregar un método para mostrar la información del libro.

Crear varios libros y mostrar sus datos.

## Conceptos utilizados

- Classes
- Objects
- Constructors
- Methods

## Ejemplo de salida

```text
Title: Clean Code
Author: Robert C. Martin

Title: Effective Java
Author: Joshua Bloch
```

---

# Proyecto 3 - Object Counter

## Objetivo

Crear una clase llamada `Person`.

La clase debe contener:

```java
String name;
static int totalPersons;
```

Cada vez que se cree un objeto, el contador debe incrementarse automáticamente.

Mostrar la cantidad total de personas creadas.

## Conceptos utilizados

- Classes
- Objects
- Constructors
- Static

## Ejemplo de salida

```text
Total persons: 3
```

---

# Proyecto 4 - Static Calculator

## Objetivo

Crear una clase llamada `Calculator`.

Implementar los siguientes métodos estáticos:

```java
sum()
subtract()
multiply()
```

Llamar los métodos utilizando el nombre de la clase.

## Conceptos utilizados

- Methods
- Static

## Ejemplo de uso

```java
Calculator.sum(5, 3);
Calculator.subtract(10, 2);
Calculator.multiply(4, 6);
```

## Ejemplo de salida

```text
8
8
24
```

---

# Proyecto 5 - Package Organization

## Objetivo

Crear la siguiente estructura de packages:

```text
com.myapp

├── students
│   └── Student.java

├── books
│   └── Book.java

└── app
    └── Main.java
```

Importar las clases necesarias dentro de `Main.java`.

Crear objetos de cada clase y mostrar su información.

## Conceptos utilizados

- Packages
- Imports
- Classes
- Objects
- Constructors
- Methods

## Ejemplo

```java
import students.Student;
import books.Book;
```

---

## Resumen

Al completar estos proyectos deberías ser capaz de:

- Crear clases y objetos.
- Utilizar constructores para inicializar datos.
- Crear y llamar métodos.
- Comprender la diferencia entre miembros normales y estáticos.
- Organizar código utilizando packages.
- Importar clases desde otros packages.

---

## Nota

Estos proyectos están diseñados para utilizar únicamente los conceptos vistos en el módulo **Java Basics**.

No es necesario utilizar herencia, encapsulación, interfaces o colecciones, ya que esos temas serán estudiados en módulos posteriores.

Recuerdar siempre usar:

```text
javac NombreClase.java -> genera bytecode
java NombreClase       -> corre el bytecode
```

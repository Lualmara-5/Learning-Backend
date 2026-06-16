# JVM, JDK y JRE

## ¿Por qué existe este tema?

Cuando escribimos un programa en Java, nuestro computador no entiende directamente ese código.

La CPU entiende instrucciones de bajo nivel (código máquina), por lo que Java necesita un mecanismo para traducir y ejecutar nuestros programas.

Aquí aparecen tres conceptos fundamentales:

- JVM
- JRE
- JDK

Comprender la relación entre ellos es esencial para entender cómo funciona Java internamente.

---

## JVM (Java Virtual Machine)

La JVM es una máquina virtual encargada de ejecutar programas Java.

No es una máquina física.

Es un software que actúa como intermediario entre nuestro programa y el sistema operativo.

Su función principal es ejecutar el bytecode generado durante la compilación.

---

### ¿Qué problema resuelve?

Permite que un mismo programa Java pueda ejecutarse en distintos sistemas operativos sin necesidad de modificar el código.

Por ejemplo:

```text
Programa Java
      ↓
     JVM
      ↓
 Windows
```

```text
Programa Java
      ↓
     JVM
      ↓
 Linux
```

```text
Programa Java
      ↓
     JVM
      ↓
 MacOS
```

Por esta razón Java es considerado un lenguaje multiplataforma.

---

## Analogía

Imagina que hablas únicamente español.

Viajas a varios países:

- Estados Unidos
- Alemania
- Japón

Para comunicarte utilizas un traductor.

```text
Tú
↓
Traductor
↓
País
```

La JVM cumple el papel de traductor.

Tu programa siempre habla Java.

La JVM traduce las instrucciones para cada sistema operativo.

---

## Bytecode

Cuando compilamos un programa Java, no se genera código máquina directamente.

Se genera un formato intermedio llamado:

```text
Bytecode
```

Los archivos de bytecode tienen extensión:

```text
.class
```

Por ejemplo:

```text
Hola.java
```

se convierte en:

```text
Hola.class
```

La JVM es capaz de ejecutar ese bytecode.

---

## JRE (Java Runtime Environment)

La JRE es el entorno necesario para ejecutar aplicaciones Java.

Está compuesta por:

```text
JRE
│
├── JVM
└── Librerías Java
```

Su objetivo es proporcionar todo lo necesario para correr programas Java.

Sin embargo, no incluye herramientas para desarrollar software.

---

## JDK (Java Development Kit)

El JDK es el paquete completo para desarrolladores.

Contiene:

```text
JDK
│
├── JRE
│    └── JVM
│
├── javac
├── java
├── Herramientas de desarrollo
└── Librerías
```

Con el JDK podemos:

- Escribir programas.
- Compilar programas.
- Ejecutar programas.

---

## Herramienta `javac`

`javac` es el compilador de Java.

Convierte archivos `.java` en archivos `.class`.

Ejemplo:

```bash
javac Hola.java
```

Resultado:

```text
Hola.class
```

---

## Herramienta `java`

La herramienta `java` permite ejecutar el bytecode utilizando la JVM.

Ejemplo:

```bash
java Hola
```

Proceso:

```text
Hola.class
      ↓
     JVM
      ↓
 Resultado
```

---

## Relación entre JVM, JRE y JDK

```text
JDK
│
└── JRE
     │
     └── JVM
```

Otra forma de verlo:

```text
JDK
  contiene
      ↓
JRE
  contiene
      ↓
JVM
```

---

## Error común de principiantes

Muchos desarrolladores nuevos creen que JVM, JRE y JDK son lo mismo.

No lo son.

- JVM → Ejecuta bytecode.
- JRE → Permite ejecutar programas Java.
- JDK → Permite desarrollar y ejecutar programas Java.

---

## Pregunta típica de entrevista

### ¿Cuál es la diferencia entre JDK, JRE y JVM?

Respuesta corta:

- JVM: ejecuta bytecode.
- JRE: contiene la JVM y librerías necesarias para ejecutar programas.
- JDK: contiene la JRE y herramientas para desarrollar software.

---

## Conceptos clave

- La JVM ejecuta bytecode.
- El bytecode se almacena en archivos `.class`.
- La JRE permite ejecutar aplicaciones Java.
- El JDK permite desarrollar aplicaciones Java.
- Java es multiplataforma gracias a la JVM.

---

## Resumen

Cuando escribimos un programa Java, primero se compila utilizando `javac`.

El resultado es un archivo `.class` que contiene bytecode.

Posteriormente la JVM ejecuta ese bytecode sobre el sistema operativo correspondiente.

La JRE proporciona el entorno de ejecución y el JDK proporciona todas las herramientas necesarias para desarrollar aplicaciones Java.

---

## Frase para memorizar

```text
.java
   ↓
 javac
   ↓
.class
   ↓
 JVM
   ↓
 Sistema Operativo
```

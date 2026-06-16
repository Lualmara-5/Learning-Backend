# Compilation Process

## ¿Qué es el proceso de compilación?

El proceso de compilación es el conjunto de pasos que sigue Java para convertir nuestro código fuente en algo que la computadora pueda ejecutar.

Cuando escribimos un programa Java, la CPU no entiende directamente ese código.

Por eso Java necesita transformar nuestro archivo `.java` en un formato que pueda ser ejecutado por la JVM.

---

## Vista general

Todo el proceso puede resumirse así:

```text
Hola.java
    ↓
  javac
    ↓
Hola.class
    ↓
   JVM
    ↓
Resultado
```

---

## Paso 1: Escribir el código fuente

Creamos un archivo con extensión:

```text
.java
```

Por ejemplo:

```java
public class Hola {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

    }

}
```

Archivo:

```text
Hola.java
```

Este archivo contiene código fuente legible para los humanos.

---

## Paso 2: Compilación

Utilizamos el compilador de Java:

```bash
javac Hola.java
```

La herramienta `javac` analiza nuestro código y verifica:

- Errores de sintaxis.
- Variables mal declaradas.
- Métodos inexistentes.
- Problemas de compilación.

Si todo está correcto, genera:

```text
Hola.class
```

---

## ¿Qué ocurre si hay errores?

Ejemplo:

```java
public class Hola {

    public static void main(String[] args) {

        System.out.println("Hola Mundo")

    }

}
```

Falta un punto y coma:

```java
;
```

Al compilar:

```bash
javac Hola.java
```

Java mostrará un error y NO generará el archivo `.class`.

---

## Paso 3: Generación de Bytecode

El archivo:

```text
Hola.class
```

contiene:

```text
Bytecode
```

El bytecode es un lenguaje intermedio.

No es código Java.

Tampoco es código máquina.

Es un formato especial diseñado para ser ejecutado por la JVM.

---

## ¿Por qué Java utiliza Bytecode?

Gracias al bytecode, el mismo programa puede ejecutarse en distintos sistemas operativos.

Por ejemplo:

```text
Hola.class
```

puede ejecutarse en:

- Windows
- Linux
- MacOS

Siempre que exista una JVM para ese sistema.

---

## Paso 4: Ejecución

Una vez tenemos el archivo `.class`, podemos ejecutarlo.

Comando:

```bash
java Hola
```

Importante:

```text
No se escribe .class
```

Correcto:

```bash
java Hola
```

Incorrecto:

```bash
java Hola.class
```

---

## ¿Qué hace la JVM?

Cuando ejecutamos:

```bash
java Hola
```

La JVM:

1. Carga el bytecode.
2. Lo interpreta.
3. Lo ejecuta.
4. Se comunica con el sistema operativo.

Proceso:

```text
Hola.class
      ↓
     JVM
      ↓
 Sistema Operativo
      ↓
 Resultado
```

---

## Analogía

Imagina que escribes un libro en español.

```text
Código Java
```

Luego alguien lo traduce a un idioma universal.

```text
Bytecode
```

Finalmente un traductor local lo adapta al idioma de cada país.

```text
JVM
```

Resultado:

```text
Puede leerse en cualquier lugar
```

---

## Compilación vs Ejecución

Muchos principiantes confunden estos conceptos.

### Compilación

Transforma:

```text
.java
```

en:

```text
.class
```

Utilizando:

```bash
javac
```

---

### Ejecución

Transforma:

```text
.class
```

en:

```text
Programa funcionando
```

Utilizando:

```bash
java
```

---

## Error común de principiantes

Pensar que:

```bash
javac
```

y

```bash
java
```

hacen lo mismo.

No es así.

`javac` compila.

`java` ejecuta.

Son herramientas diferentes.

---

## Pregunta típica de entrevista

### ¿Cuál es la diferencia entre compilación y ejecución?

Respuesta corta:

La compilación convierte código fuente (`.java`) en bytecode (`.class`).

La ejecución consiste en que la JVM cargue y ejecute ese bytecode.

---

## Conceptos clave

- El código fuente se guarda en archivos `.java`.
- `javac` compila el código.
- La compilación genera archivos `.class`.
- Los archivos `.class` contienen bytecode.
- La JVM ejecuta el bytecode.
- `java` se utiliza para ejecutar programas.

---

## Resumen

El proceso de compilación y ejecución de Java ocurre en dos etapas principales.

Primero el compilador (`javac`) transforma el código fuente en bytecode.

Luego la JVM ejecuta ese bytecode utilizando el comando `java`.

Gracias a este proceso, Java puede ejecutarse en distintos sistemas operativos sin modificar el código original.

---

## Frase para memorizar

```text
Código Fuente (.java)
          ↓
       javac
          ↓
 Bytecode (.class)
          ↓
         JVM
          ↓
      Resultado
```

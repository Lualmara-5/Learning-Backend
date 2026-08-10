# Mini Projects

## Objetivo

Estos ejercicios tienen como propósito reforzar los conceptos aprendidos en:

- Classes
- Objects
- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Composition

La idea no es memorizar sintaxis.

El objetivo es aprender a identificar **qué relación existe entre las clases**, cómo se crean los objetos y cómo interactúan entre ellos.

---

# Proyecto 1 - Bank Account

## Objetivo

Crear una clase llamada `BankAccount`.

La cuenta debe contener:

```java
private String owner;
private double balance;
```

Crear un constructor que reciba el propietario y el saldo inicial.

Implementar los métodos:

```java
deposit()
withdraw()
showBalance()
```

El método `withdraw()` debe evitar retirar una cantidad mayor al saldo disponible.

Por ejemplo:

```text
Balance: 100000

Withdraw: 30000

Balance: 70000
```

Si se intenta retirar:

```text
Withdraw: 80000
```

debe mostrar un mensaje indicando que no hay saldo suficiente.

## Conceptos utilizados

- Classes
- Objects
- Constructors
- Encapsulation
- Methods

## Objetivo adicional

Los atributos deben permanecer `private`.

El acceso al estado de la cuenta debe realizarse mediante métodos.

---

# Proyecto 2 - Animal System

## Objetivo

Crear una clase abstracta llamada `Animal`.

Debe contener un método abstracto:

```java
public abstract void makeSound();
```

También debe tener un método normal:

```java
public void sleep() {

    System.out.println("The animal is sleeping");

}
```

Crear dos clases:

```text
Dog
Cat
```

Ambas deben heredar de `Animal`.

Cada una debe implementar su propio `makeSound()`.

Por ejemplo:

```text
Dog → Guau
Cat → Miau
```

En `Main`, crear los objetos utilizando una referencia de tipo `Animal`.

```java
Animal dog = new Dog();
Animal cat = new Cat();
```

Después:

```java
dog.makeSound();
cat.makeSound();
```

## Conceptos utilizados

- Abstract classes
- Inheritance
- Abstract methods
- Method overriding
- Polymorphism

## Objetivo adicional

Utilizar:

```java
@Override
```

en los métodos sobrescritos.

---

# Proyecto 3 - Payment System

## Objetivo

Crear una interfaz llamada:

```java
Payable
```

La interfaz debe definir:

```java
void pay(double amount);
```

Crear dos clases que implementen la interfaz:

```text
CreditCardPayment
CashPayment
```

Cada clase debe implementar `pay()` de una manera diferente.

Por ejemplo:

```text
Paying $50000 with credit card

Paying $50000 with cash
```

Después, crear objetos utilizando una referencia de tipo `Payable`.

```java
Payable payment1 = new CreditCardPayment();
Payable payment2 = new CashPayment();
```

Ejecutar:

```java
payment1.pay(50000);
payment2.pay(50000);
```

## Conceptos utilizados

- Interfaces
- Implements
- Method overriding
- Polymorphism

## Objetivo adicional

Identificar claramente:

```text
Payable → contrato
CreditCardPayment → implementación
CashPayment → implementación
```

---

# Proyecto 4 - Car and Engine

## Objetivo

Crear una clase:

```text
Engine
```

Debe tener un método:

```java
start()
```

Crear una clase:

```text
Car
```

El `Car` debe tener un atributo:

```java
private Engine engine;
```

El constructor de `Car` debe recibir un `Engine`.

Por ejemplo:

```java
Engine engine = new Engine();

Car car = new Car(engine);
```

El `Car` debe tener un método:

```java
start()
```

que utilice el motor internamente.

Por ejemplo:

```java
public void start() {

    engine.start();

}
```

Finalmente:

```java
car.start();
```

debe iniciar el motor.

## Conceptos utilizados

- Composition
- Objects
- Constructors
- Encapsulation
- Object references

## Pregunta para reflexionar

¿Por qué esto representa:

```text
Car TIENE un Engine
```

y no:

```text
Car ES un Engine
```

---

# Proyecto 5 - Employees

## Objetivo

Crear una clase abstracta:

```text
Employee
```

Debe contener:

```java
private String name;
```

y un método abstracto:

```java
public abstract double calculateSalary();
```

Además, debe tener un método normal:

```java
public void showName()
```

Crear dos clases:

```text
Developer
Designer
```

Ambas deben heredar de `Employee`.

Cada una debe implementar `calculateSalary()` de manera diferente.

Por ejemplo:

```text
Developer → salario calculado según sus condiciones

Designer → salario calculado según sus condiciones
```

Después:

```java
Employee employee1 = new Developer();
Employee employee2 = new Designer();
```

Ejecutar:

```java
employee1.showName();
employee1.calculateSalary();

employee2.showName();
employee2.calculateSalary();
```

## Conceptos utilizados

- Abstract classes
- Inheritance
- Encapsulation
- Polymorphism
- Method overriding

## Objetivo adicional

Prestar atención a esta línea:

```java
Employee employee1 = new Developer();
```

Explicar por qué es válida.

---

# Proyecto 6 - Mini E-Commerce

## Objetivo

Construir un pequeño sistema de compras utilizando varios conceptos de POO.

El sistema debe contener como mínimo:

```text
Product
Customer
Payment
Order
```

---

## Product

Crear una clase:

```text
Product
```

Debe contener atributos como:

```java
private String name;
private double price;
```

Utilizar encapsulación.

---

## Customer

Crear una clase:

```text
Customer
```

Debe contener información básica del cliente.

Por ejemplo:

```java
private String name;
```

---

## Payment

Crear una interfaz:

```text
Payable
```

con:

```java
void pay(double amount);
```

Crear al menos dos métodos de pago:

```text
CardPayment
CashPayment
```

Ambos deben implementar la interfaz.

---

## Order

Crear una clase:

```text
Order
```

El pedido debe tener:

```text
Customer
Product
Payable
```

Es decir:

```text
Order
 ├── Customer
 ├── Product
 └── Payable
```

Esto representa composición.

El pedido **tiene** un cliente, productos y un método de pago.

---

## Polimorfismo

El pedido debe poder recibir diferentes formas de pago.

Por ejemplo:

```java
Payable payment = new CardPayment();
```

o:

```java
Payable payment = new CashPayment();
```

El `Order` debería trabajar con:

```java
Payable
```

sin necesitar conocer directamente si el pago es con tarjeta o efectivo.

---

## Ejemplo conceptual

El programa podría terminar haciendo algo parecido a:

```java
Customer customer = new Customer("Alejo");

Product product = new Product("Keyboard", 150000);

Payable payment = new CardPayment();

Order order = new Order(customer, product, payment);

order.checkout();
```

La salida podría ser:

```text
Customer: Alejo
Product: Keyboard
Price: 150000

Processing payment...

Payment completed successfully.
```

## Conceptos utilizados

Este proyecto debe combinar:

- Classes
- Objects
- Constructors
- Encapsulation
- Composition
- Interfaces
- Polymorphism

---

# Orden recomendado

Los ejercicios están organizados de menor a mayor dificultad:

```text
Proyecto 1
Bank Account
       ↓
Proyecto 2
Animal System
       ↓
Proyecto 3
Payment System
       ↓
Proyecto 4
Car and Engine
       ↓
Proyecto 5
Employees
       ↓
Proyecto 6
Mini E-Commerce
```

No es necesario intentar hacerlos todos de una vez.

La dificultad debe aumentar progresivamente.

---

# Regla de los ejercicios

No buscar implementar conceptos que todavía no hemos estudiado.

La intención es resolver los problemas utilizando únicamente las herramientas conocidas hasta este módulo.

Si aparece una duda sobre sintaxis, se puede consultar.

Pero antes de buscar una solución completa, intentar razonar:

```text
¿Qué clases necesito?

¿Qué objetos voy a crear?

¿Qué relación existe entre esas clases?

¿Es un ES UN?

¿Es un TIENE UN?

¿Necesito herencia?

¿Necesito composición?

¿Necesito una interfaz?

¿Dónde tiene sentido el polimorfismo?
```

---

# Objetivo final

Al terminar estos ejercicios deberías ser capaz de mirar un problema sencillo y comenzar a identificar:

```text
Clases
    ↓
Atributos
    ↓
Métodos
    ↓
Objetos
    ↓
Relaciones entre objetos
    ↓
Herencia
    ↓
Composición
    ↓
Abstracción
    ↓
Interfaces
    ↓
Polimorfismo
```

La meta no es escribir código perfecto.

La meta es empezar a **pensar en objetos y en las relaciones entre ellos**.

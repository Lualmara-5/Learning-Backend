# Exercises

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

Crear un sistema sencillo de empleados utilizando una **clase abstracta** como clase base.

El sistema tendrá:

```text
Employee
├── Developer
└── Designer
```

La clase `Employee` debe ser abstracta y las clases `Developer` y `Designer` deben heredar de ella.

---

## 1. Clase `Employee`

Crear una clase abstracta llamada:

```text
Employee
```

Debe tener un atributo privado:

```java
private String name;
```

Como el nombre debe ser proporcionado al crear un empleado, crea un constructor.

También debe contener el método abstracto:

```java
public abstract double calculateSalary();
```

Y un método normal:

```java
public void showName() {}
```

---

## 2. Clase `Developer`

Crear una clase:

```text
Developer
```

que herede de `Employee`.

Su constructor debe recibir el nombre y utilizar `super()` para enviar ese nombre al constructor de la clase padre.

Implementar `calculateSalary()` utilizando `@Override`.

Puedes utilizar un salario fijo para este ejercicio.

Por ejemplo:

```text
Developer → 3.000.000
```

---

## 3. Clase `Designer`

Crear una clase:

```text
Designer
```

que herede de `Employee`.

También debe tener un constructor que reciba el nombre y utilice:

```java
super(name);
```

Implementar `calculateSalary()` utilizando `@Override`.

Puedes utilizar un salario diferente al del `Developer`.

Por ejemplo:

```text
Designer → 2.500.000
```

---

## 4. Main

En `Main`, crear los empleados utilizando una referencia de tipo `Employee`:

```java
Employee employee1 = new Developer("Alejandro");
Employee employee2 = new Designer("Carlos");
```

Después ejecutar:

```java
employee1.showName();
System.out.println(employee1.calculateSalary());

employee2.showName();
System.out.println(employee2.calculateSalary());
```

La salida puede ser similar a:

```text
Employee: Alejandro
3000000.0

Employee: Carlos
2500000.0
```

---

## Conceptos utilizados

- Abstract classes
- Inheritance
- Encapsulation
- Constructors
- `super()`
- Method overriding
- Polymorphism

---

## Objetivo adicional

Prestar especial atención a:

### `super(name)`

Recordar que:

```java
super(name);
```

llama al constructor de la clase padre (`Employee`) y le entrega el nombre.

### Polymorphism

Entender por qué esto es válido:

```java
Employee employee1 = new Developer("Alejandro");
```

La referencia es de tipo `Employee`, pero el objeto creado es un `Developer`.

Por eso, cuando se ejecuta:

```java
employee1.calculateSalary();
```

Java utiliza la implementación de `calculateSalary()` que pertenece a `Developer`.

---

## Preguntas para reflexionar

1. ¿Por qué `Employee` es una clase abstracta?
2. ¿Por qué `calculateSalary()` es abstracto?
3. ¿Qué función cumple `super(name)`?
4. ¿Qué diferencia existe entre el tipo de la referencia (`Employee`) y el tipo del objeto (`Developer`)?
5. ¿Qué implementación de `calculateSalary()` se ejecuta al utilizar `employee1.calculateSalary()`?

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

// Clase principal
public class Main {

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Creación de objetos utilizando una referencia de tipo Animal
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Llamada al método sobrescrito
        dog.makeSound();
        cat.makeSound();

        // Llamada al método heredado
        dog.sleep();
        cat.sleep();
    }
}
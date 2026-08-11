// Clase Abstracta
public abstract class Employee {

    // Atributo Privado
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Método Abstracto
    public abstract double calculateSalary();

    // Método Normal
    public void showName() {
        System.out.println("Empleado: " + name);
    }
}

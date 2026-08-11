// Clase + Herencia
public class Developer extends Employee {

    // Constructor
    public Developer(String name) {
        super(name);
    }

    // Metodo
    @Override
    public double calculateSalary() {
        return 3000000;
    }
}

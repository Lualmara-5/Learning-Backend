// Clase + Herencia
public class Designer extends Employee {

    // Constructor
    public Designer(String name) {
        super(name);
    }

    // Metodo
    @Override
    public double calculateSalary() {
        return 2500000;
    }
}

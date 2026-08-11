public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Alejandro");
        Employee employee2 = new Designer("Carlos");

        employee1.showName();
        System.out.println(employee1.calculateSalary());

        employee2.showName();
        System.out.println(employee2.calculateSalary());
    }
}

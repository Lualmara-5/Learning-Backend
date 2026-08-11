// La Clase
public class BankAccount {

    // Atributos
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {

        this.owner = owner;
        this.balance = balance;

    }

    // Métodos
    public void deposit(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        } else {
            System.out.println("No puedes depositar saldo Negativo o Nulo");
        }

        System.out.println("Depositaste: " + cantidad + " a tu cuenta!");
    }

    public void withdraw(double cantidad) {
        if (balance >= cantidad && cantidad > 0) {
            balance -= cantidad;

            System.out.println("Retiraste: " + cantidad + " de tu cuenta!");
        }

        else {
            System.out.println("No tienes saldo suficiente en tu cuenta.");
        }
    }

    public void showBalance() {
        System.out.println("En tu cuenta quedó: " + balance);
    }

    // Ejecutar
    public static void main(String[] args) {
        BankAccount cuenta = new BankAccount("Alejo", 100000);
        cuenta.deposit(100000);
        cuenta.withdraw(150000);
        cuenta.showBalance();
    }
}
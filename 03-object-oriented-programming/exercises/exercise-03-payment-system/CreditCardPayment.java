// Clase
public class CreditCardPayment implements Payable {

    // Implementamos el método definido por el contrato
    @Override
    public void pay(double amount) {

        System.out.println("Paying " + amount + " with credit card");

    }
}
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alejo");

        Product product = new Product("Keyboard", 150000);

        Payable payment = new CashPayment();

        Order order = new Order(customer, product, payment);

        order.checkout();
    }
}

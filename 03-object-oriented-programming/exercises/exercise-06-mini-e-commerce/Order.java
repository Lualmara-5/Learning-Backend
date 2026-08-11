public class Order {

    private Customer customer;
    private Product product;
    private Payable payable;

    public Order(Customer customer, Product product, Payable payable) {

        this.customer = customer;
        this.product = product;
        this.payable = payable;

    }

    public void checkout() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice() + "\n");

        System.out.println("Processing payment... \n");
        payable.pay(product.getPrice());
        System.out.println("\nPayment completed successfully.");
    }
}

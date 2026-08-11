public class CardPayment implements Payable {

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with card...");
    }
}

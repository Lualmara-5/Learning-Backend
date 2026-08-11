public class Main {
    public static void main(String[] args) {

        Payable payment1 = new CreditCardPayment();
        Payable payment2 = new CashPayment();

        payment1.pay(50000);
        payment2.pay(50000);
    }
}

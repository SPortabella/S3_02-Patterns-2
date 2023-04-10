package Callback;

public final class BankPayment extends Payment {

    public BankPayment(Double totalPrice) {
        super(totalPrice);
    }

    @Override
    public void execute() {

        System.out.println("S'ha fet el pagament per Bank correctament de: ");
    }
}

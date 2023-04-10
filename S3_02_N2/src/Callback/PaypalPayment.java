package Callback;

import Callback.Payment;

public final class PaypalPayment extends Payment {

    public PaypalPayment(Double totalPrice) {
        super(totalPrice);
    }

    @Override
    public void execute() {
        System.out.println("S'ha fet el pagament per Paypal correctament");
    }
}

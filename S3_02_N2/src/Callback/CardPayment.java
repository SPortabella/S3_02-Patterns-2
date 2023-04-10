package Callback;

import Callback.Payment;

public final class CardPayment extends Payment {

    public CardPayment(Double totalPrice) {
        super(totalPrice);
    }

    @Override
    public void execute() {
        System.out.println("S'ha fet el pagament per Card correctament");
    }
}

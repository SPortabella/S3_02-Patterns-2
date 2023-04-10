package Callback;

import interfaces.Callback;

import java.util.Optional;

public abstract class Payment {
    public Payment(Double totalPrice) {

    }


    public final void executeWith(Callback callback) {
        Optional.ofNullable(callback).ifPresent(Callback::call);
        execute();
    }

    public abstract void execute();
}
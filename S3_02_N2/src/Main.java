import Callback.BankPayment;
import Callback.CardPayment;
import Callback.Payment;
import Callback.PaypalPayment;
import domain.Client;
import domain.Order;
import domain.Shoes;
import domain.StoreShoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StoreShoes storeShoes = new StoreShoes();
        storeShoes.shoes.add(new Shoes(1L, "Bambas", 4, 35.0));
        storeShoes.shoes.add(new Shoes(2L, "Chanclas", 10, 13.50));
        storeShoes.shoes.add(new Shoes(3L, "Alpargata", 15, 20.0));
        storeShoes.shoes.add(new Shoes(4L, "Zueco", 8, 18.50));

        Client client = new Client(1L, "Pere Albert", null, null, "21003434561234567890");

        Order order = new Order(client);
        order.clientShoes.add(storeShoes.shoes.get(0));
        order.clientShoes.add(storeShoes.shoes.get(3));
        Double totalPrice = order.clientShoes
                .stream()
                .mapToDouble(shoe->shoe.getPrice()).sum();

        System.out.println("Total comanda: " + totalPrice);

        Scanner sc = new Scanner(System.in);
        Integer typePayment=0;
        Boolean ok = false;
        Payment payment = null;

        do {
            System.out.println("Introduzca forma de pago 1-Paypal, 2-Card, 3-Bank");
            typePayment = sc.nextInt();

            switch (typePayment) {
                case 1:
                    payment = new PaypalPayment(totalPrice);
                    ok = true;
                    break;
                case 2:
                    payment = new CardPayment(totalPrice);
                    ok = true;
                    break;
                case 3:
                    payment = new BankPayment(totalPrice);
                    ok = true;
                    break;
            }
        } while (!ok);

        payment.executeWith(() -> System.out.println("I'm done now."));

    }
}
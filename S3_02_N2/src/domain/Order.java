package domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public Client client;
    public List<Shoes> clientShoes;

    public Order(Client client) {
        this.client = client;
        this.clientShoes = new ArrayList<>();
    }

}

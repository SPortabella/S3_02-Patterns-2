package domain;

public class Client {

    private Long id;
    private String name;
    private Integer numCard;
    private String paypal;
    private String ccBank;

    public Client(Long id, String name, Integer numCard, String paypal, String ccBank) {
        this.id = id;
        this.name = name;
        this.numCard = numCard;
        this.paypal = paypal;
        this.ccBank = ccBank;
    }

}

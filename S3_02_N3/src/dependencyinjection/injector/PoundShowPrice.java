package dependencyinjection.injector;

import dependencyinjection.service.PriceService;

public class PoundShowPrice implements PriceService {

    @Override
    public void showPrice(String currency, Double price) {
        price = price*0.88;
        System.out.println("The price in " + currency + " is " + price);
    }
}

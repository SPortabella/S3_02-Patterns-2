package dependencyinjection.injector;

import dependencyinjection.service.PriceService;

public class EuroShowPrice implements PriceService {

    @Override
    public void showPrice(String currency, Double price) {
        System.out.println("The price in " + currency + " is " + price);
    }
}

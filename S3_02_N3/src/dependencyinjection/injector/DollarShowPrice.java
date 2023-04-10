package dependencyinjection.injector;

import dependencyinjection.service.PriceService;

public class DollarShowPrice implements PriceService {

    @Override
    public void showPrice(String currency, Double price) {
        price = price*1.09;
        System.out.println("The price in " + currency + " is " + price);
    }
}


import dependencyinjection.injector.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter import to convert:");
        Double price = Double.valueOf(sc.nextInt());

        Boolean ok = false;
        Integer option = 0;
        String currency;

        do{
            System.out.println("Select currency to change: 1-Euro, 2-Pound, 3-Dollar");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    currency = "EURO";
                    EuroShowPrice euroShowPrice = new EuroShowPrice();
                    euroShowPrice.showPrice(currency,price);
                    ok = true;
                    break;
                case 2:
                    currency = "POUNDS";
                    PoundShowPrice poundShowPrice = new PoundShowPrice();
                    poundShowPrice.showPrice(currency,price);
                    ok = true;
                    break;
                case 3:
                    currency = "DOLLAR";
                    DollarShowPrice dollarShowPrice = new DollarShowPrice();
                    dollarShowPrice.showPrice(currency,price);
                    ok= true;
                    break;
                default :
                    break;
            }
        }while (!ok);

     }
}
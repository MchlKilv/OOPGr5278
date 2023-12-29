package Seminar2.SuperMarketApp;

import Seminar2.SuperMarketApp.Classes.Actor;
import Seminar2.SuperMarketApp.Classes.OrdinaryClient;
import Seminar2.SuperMarketApp.Classes.PromoClient;
import Seminar2.SuperMarketApp.Classes.SpecialClient;

import Seminar2.SuperMarketApp.Classes.Market;

public class App {
    public static void main(String[] args) throws Exception {

        Market fiveMarket = new Market();

        Actor client1 = new OrdinaryClient("Володя", 1);
        Actor client2 = new OrdinaryClient("Анатоль", 2);
        Actor client3 = new OrdinaryClient("Мария", 3);
        Actor client4 = new SpecialClient("Mr. Robot", 1);
        Actor client5 = new PromoClient("Покупатель", 1, "Покупка", true, false);

        fiveMarket.acceptToMarket(client1);
        fiveMarket.acceptToMarket(client2);
        fiveMarket.acceptToMarket(client3);
        fiveMarket.acceptToMarket(client4);

        fiveMarket.acceptToMarket(client5);

        fiveMarket.update();

    }
}

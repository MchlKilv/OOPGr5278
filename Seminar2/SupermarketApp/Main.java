package OOPGr5278.Seminar2.SupermarketApp;

import OOPGr5278.Seminar2.SupermarketApp.Classes.Actor;
import OOPGr5278.Seminar2.SupermarketApp.Classes.OrdinaryClient;
import OOPGr5278.Seminar2.SupermarketApp.Classes.SpecialClient;

public class Main {
    public static void main(String[] args) {

        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Вася", 1);
        Actor client2 = new OrdinaryClient("Оля", 2);
        Actor client3 = new SpecialClient("Киркоров", 1);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.update();

    }

}

package OOPGr5278.Seminar2.SupermarketApp.Interfaces;

import OOPGr5278.Seminar2.SupermarketApp.Classes.Actor;

public interface IMarketBehaviour {
    public void acceptToMarket(Actor actor);

    public void releaseFromMarket(Actor actor);

    public void update();

}

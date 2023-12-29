package Seminar2.SuperMarketApp.Interfaces;

import java.util.List;

import Seminar2.SuperMarketApp.Classes.Actor;

public interface iMarketBehavior {
    public void acceptToMarket(iActorBehavior actor);

    public void releseFromMarket(List<Actor> actors);

    public void update();
}

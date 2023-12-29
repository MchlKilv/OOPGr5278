package Seminar2.SuperMarketApp.Classes;

import Seminar2.SuperMarketApp.Interfaces.iActorBehavior;

public abstract class Actor implements iActorBehavior {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
        this.isTakeOrder = isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }

}

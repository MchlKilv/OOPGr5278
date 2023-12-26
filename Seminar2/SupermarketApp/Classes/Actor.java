package OOPGr5278.Seminar2.SupermarketApp.Classes;

public abstract class Actor {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;

    }

    public abstract String getName();

    public abstract void setName(String name);
}

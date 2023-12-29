package Seminar2.SuperMarketApp.Classes;

public class OrdinaryClient extends Actor {

    private int number;

    public int getNumber() {
        return number;
    }

    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder();
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

}

package Seminar2.SuperMarketApp.Classes;

public class SpecialClient extends Actor {

    private int idVip;

    public int getIdVip() {
        return idVip;
    }

    public SpecialClient(String name, int number) {
        super(name);
        this.idVip = number;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
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

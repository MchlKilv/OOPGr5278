package OOPGr5278.Seminar2.SupermarketApp.Interfaces;

public interface IQueueBehavior {

    public void takeInQueue(Actor actor);

    public void releaseFromQueue();

    public void TakeOrder();

    public void giveOrder();
}

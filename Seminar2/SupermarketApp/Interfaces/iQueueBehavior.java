package Seminar2.SuperMarketApp.Interfaces;

public interface iQueueBehavior {
    public void takeInQueue(iActorBehavior actor);

    public void releaseFromQueue();

    public void takeOrder();

    public void giveOrder();
}

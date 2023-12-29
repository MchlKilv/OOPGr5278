package Seminar2.SuperMarketApp.Classes;

import Seminar2.SuperMarketApp.Interfaces.iReturnOrder;

public class PromoClient extends Actor implements iReturnOrder {
    private int clientId;
    private String actionName;
    private static int participantsCount;

    // Дополнительные поля для возврата заказа
    private boolean returnInitiated;
    private boolean returnProcessed;

    public PromoClient(String name, int clientId, String actionName, boolean returnInitiated, boolean returnProcessed) {
        super(name);
        this.clientId = clientId;
        this.actionName = actionName;
        this.returnInitiated = returnInitiated;
        this.returnProcessed = returnProcessed;
    }

    // Геттеры и сеттеры для дополнительных полей возврата заказа
    public boolean isReturnInitiated() {
        return returnInitiated;
    }

    public void setReturnInitiated(boolean returnInitiated) {
        this.returnInitiated = returnInitiated;
    }

    public boolean isReturnProcessed() {
        return returnProcessed;
    }

    public void setReturnProcessed(boolean returnProcessed) {
        this.returnProcessed = returnProcessed;
    }

    // Реализация методов из интерфейса iReturnOrder
    @Override
    public void initiateReturn() {
        // Логика для инициирования возврата товара
        setReturnInitiated(true);
        System.out.println("Return initiated for Client ID: " + clientId);
    }

    @Override
    public Actor getActor() {
        return new PromoClient(name, clientId, actionName, returnInitiated, returnProcessed);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    // Дополнительные методы класса
    public void displayInfo() {
        System.out.println("Client ID: " + clientId);
        System.out.println("Action Name: " + actionName);
        System.out.println("Participants Count: " + participantsCount);
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

}

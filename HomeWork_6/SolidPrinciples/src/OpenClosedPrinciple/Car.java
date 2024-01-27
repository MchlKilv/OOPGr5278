package OpenClosedPrinciple;

public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        // Переопределяем метод родительского класса
        return getMaxSpeed() * 0.8;
    }

}

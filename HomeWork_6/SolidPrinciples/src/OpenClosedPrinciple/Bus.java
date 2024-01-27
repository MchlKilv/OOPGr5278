package OpenClosedPrinciple;

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        // Переопределяем метод родительского класса
        return getMaxSpeed() * 0.6;
    }
}

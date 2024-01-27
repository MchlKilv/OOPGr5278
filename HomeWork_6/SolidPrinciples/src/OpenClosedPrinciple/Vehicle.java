package OpenClosedPrinciple;

//Класс Vehicle описывает транспортное средство, включая максимальную скорость и тип.
public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    // Метод для получения максимальной скорости
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Метод для получения типа транспортного средства
    public String getType() {
        return type;
    }

    // Метод для вычисления допустимой скорости
    public double calculateAllowedSpeed() {
        return 0.0;
    }
}

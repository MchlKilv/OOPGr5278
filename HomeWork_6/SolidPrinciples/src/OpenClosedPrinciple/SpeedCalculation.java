package OpenClosedPrinciple;

/*
Класс SpeedCalculation описывает метод для вычисления допустимой скорости.
Использованы наследование, полиморфизм. Класс открыт для расширения.
Класс закрыт для изменения благодаря использованию полиморфизма (метод calculateAllowedSpeed() в данном случае имеет разную реализацию для родительского и дочернего класса Vehicle).
*/
public class SpeedCalculation {

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}

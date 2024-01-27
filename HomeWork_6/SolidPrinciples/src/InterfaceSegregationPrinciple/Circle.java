package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.Interfaces.TwoDimensionShape;

public class Circle extends Shape implements TwoDimensionShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // Переопределяем метод родительского класса
        return 2 * 3.14 * radius;
    }

    @Override
    public void commonMethod() {
        // Некий общий метод
        super.commonMethod();
    }
}

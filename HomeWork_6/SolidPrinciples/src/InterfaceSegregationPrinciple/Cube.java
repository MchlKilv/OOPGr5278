package InterfaceSegregationPrinciple;

import InterfaceSegregationPrinciple.Interfaces.ThreeDimensionShape;
import InterfaceSegregationPrinciple.Interfaces.TwoDimensionShape;

public class Cube extends Shape implements TwoDimensionShape, ThreeDimensionShape {

    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        // Площадь куба, переопределяем метод родительского класса
        return 6 * edge * edge;
    }

    @Override
    public double calculateVolume() {
        // Обьем куба, переопределяем метод родительского класса
        return edge * edge * edge;
    }

    @Override
    public void commonMethod() {
        // Некий общий метод
        super.commonMethod();
    }

}

package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.Interface.Shape;

public class Square implements Shape {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        // Переопределяем метод родительского класса Shape. Для вычисления площади
        // квадрата
        return this.side * this.side;
    }

}

package Model;

/**
 * Интерфейс для модели калькулятора
 */
public interface iCalculatorModel {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}

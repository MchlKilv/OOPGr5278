package Model;

public class ComplexCalculatorModel implements iCalculatorModel {

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        // Реализация сложения
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        // Реализация умножения
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        /// Реализация вычитания
        return new ComplexNumber(num1.getReal() - num2.getReal(), num1.getImaginary() - num2.getImaginary());
    }

}

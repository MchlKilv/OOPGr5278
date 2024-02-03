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

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        // Check if the denominator is not zero to avoid division by zero
        if (num2.getReal() == 0 && num2.getImaginary() == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }

        // Perform complex division
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;

        return new ComplexNumber(real, imaginary);
    }

}

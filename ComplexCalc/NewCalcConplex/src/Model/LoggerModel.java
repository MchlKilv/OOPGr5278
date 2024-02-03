package Model;

/**
 * Реализация модели калькулятора с логгером
 */
public class LoggerModel implements iCalculatorModel {
    private iCalculatorModel calculatorModel;
    private iLogger logger;

    /**
     * Конструктор, принимает модель калькулятора и логгер
     * 
     * @param calculatorModel передает модель калькулятора
     * @param logger          передает логгер
     */
    public LoggerModel(iCalculatorModel calculatorModel, iLogger logger) {
        this.calculatorModel = calculatorModel;
        this.logger = logger;
    }

    /**
     * Методы для операций сложения, вычитания, умножения, деления
     */
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        // Сложение комплексных чисел
        ComplexNumber result = calculatorModel.add(num1, num2);
        logger.log("Сложение: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        // Умножение комплексных чисел
        ComplexNumber result = calculatorModel.multiply(num1, num2);
        logger.log("Умножение: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        // Вычитание комплексных чисел
        ComplexNumber result = calculatorModel.subtract(num1, num2);
        logger.log("Вычитание: " + num1 + " - " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        // Проверка, чтобы избежать деления на ноль
        if (num2.getReal() == 0 && num2.getImaginary() == 0) {
            throw new ArithmeticException("Деление на ноль не возможно.");
        }
        // Деление комплексных чисел
        ComplexNumber result = calculatorModel.divide(num1, num2);
        logger.log("Деление: " + num1 + " / " + num2 + " = " + result);
        return result;
    }

}

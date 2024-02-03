package Model;

public class LoggerModel implements iCalculatorModel {
    private iCalculatorModel calculatorModel;
    private iLogger logger;

    public LoggerModel(iCalculatorModel calculatorModel, iLogger logger) {
        this.calculatorModel = calculatorModel;
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        // TODO Auto-generated method stub
        ComplexNumber result = calculatorModel.add(num1, num2);
        logger.log("Сложение: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        // TODO Auto-generated method stub
        ComplexNumber result = calculatorModel.multiply(num1, num2);
        logger.log("Умножение: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        // TODO Auto-generated method stub
        ComplexNumber result = calculatorModel.subtract(num1, num2);
        logger.log("Вычитание: " + num1 + " - " + num2 + " = " + result);
        return result;
    }

}

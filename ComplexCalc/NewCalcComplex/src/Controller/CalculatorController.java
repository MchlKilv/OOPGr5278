package Controller;

import java.util.Scanner;

import Model.ComplexNumber;
import Model.iCalculatorModel;
import View.iCalculatorView;

/**
 * Контроллер калькулятора для взаимодействия с пользователем
 */
public class CalculatorController {
    private iCalculatorModel calculatorModel;
    private iCalculatorView calculatorView;

    /**
     * Конструктор, принимает модель калькулятора и интерфейс для вывода результата
     * 
     * @param calculatorModel принимает модель калькулятора
     * @param calculatorView  принимает интерфейс для вывода результата
     */
    public CalculatorController(iCalculatorModel calculatorModel, iCalculatorView calculatorView) {
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
    }

    /**
     * Метод для запуска приложения калькулятора комплексных чисел
     * полчает данные с клавиатуры и передает их в модель (значения частей числа и
     * выбор операции)
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое комплексное число:");
        ComplexNumber num1 = readComplexNumber(scanner);

        System.out.println("Введите второе комплексное число:");
        ComplexNumber num2 = readComplexNumber(scanner);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int choice = scanner.nextInt();
        /**
         * Выполняет выбранную пользователем операцию
         */
        switch (choice) {
            case 1:
                calculatorView.displayResult(calculatorModel.add(num1, num2));
                break;
            case 2:
                calculatorView.displayResult(calculatorModel.subtract(num1, num2));
                break;
            case 3:
                calculatorView.displayResult(calculatorModel.multiply(num1, num2));
                break;
            case 4:
                calculatorView.displayResult(calculatorModel.divide(num1, num2));
                break;
            default:
                System.out.println("Неверный выбор операции.");
        }
    }

    /**
     * Метод для считывания комплексного числа
     * 
     * @param scanner считывает данные
     * @return
     */
    private ComplexNumber readComplexNumber(Scanner scanner) {
        System.out.print("Реальная часть: ");
        double real = scanner.nextDouble();
        System.out.print("Мнимая часть: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}
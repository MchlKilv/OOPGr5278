package View;

import Model.ComplexNumber;

public class DefaultCalculatorView implements iCalculatorView {

    @Override
    public void displayResult(ComplexNumber result) {
        // Реализация вывода результата на экран
        System.out.println("Результат: " + result);
    }

}

package View;

import Model.ComplexNumber;

/**
 * Реализация интерфейса iCalculatorView с выводом результата
 */
public class DefaultCalculatorView implements iCalculatorView {

    @Override
    public void displayResult(ComplexNumber result) {
        // Вывод результата на экран
        System.out.println("Результат: " + result);
    }

}

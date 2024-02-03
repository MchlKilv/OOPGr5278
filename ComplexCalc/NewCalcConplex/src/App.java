import Controller.CalculatorController;
import Model.TextLogger;
import Model.iCalculatorModel;
import Model.iLogger;
import View.DefaultCalculatorView;
import View.iCalculatorView;
import Model.ComplexCalculatorModel;
import Model.LoggerModel;

public class App {
    public static void main(String[] args) {
        iLogger textLogger = new TextLogger("loggers/log_complexCalc.txt");
        iCalculatorModel complexCalculatorModel = new LoggerModel(new ComplexCalculatorModel(), textLogger);
        iCalculatorView calculatorView = new DefaultCalculatorView();
        CalculatorController calculatorController = new CalculatorController(complexCalculatorModel, calculatorView);

        // Запуск приложения
        calculatorController.start();
    }
}
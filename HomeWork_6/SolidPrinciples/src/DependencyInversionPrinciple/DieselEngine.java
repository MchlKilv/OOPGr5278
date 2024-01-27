package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Interface.Engine;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        // Запускаем двигатель
        System.out.println("Diesel engine started");
    }

}

package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Interface.Engine;

public class PetrolEngine implements Engine {

    @Override
    public void start() {
        // Запускаем двигатель
        System.out.println("Petrol engine started");
    }

}

package DependencyInversionPrinciple;

import DependencyInversionPrinciple.Interface.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        this.engine.start();
    }
}

package pl.marcinszewczyk.carmanager;

import pl.marcinszewczyk.CarSegment;

public class Car {
    String modelName;
    CarSegment carSegment;
    String description;
    int introduced;
    String engine;
    int power;

    public Car(String modelName, CarSegment carSegment, String description, int introduced, String engine, int power) {
        this.modelName = modelName;
        this.carSegment = carSegment;
        this.description = description;
        this.introduced = introduced;
        this.engine = engine;
        this.power = power;
    }

    public String getModelName() {
        return modelName;
    }

    public CarSegment getCarSegment() {
        return carSegment;
    }

    public String getDescription() {
        return description;
    }

    public int getIntroduced() {
        return introduced;
    }

    public String getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }
}

package pl.marcinszewczyk.carmanager;

import java.io.Serializable;

public class Car implements Serializable {
    int id;
    String modelName;
    CarSegment carSegment;
    String description;
    int introduced;
    String engine;
    int power;
    boolean available;

    public Car() {
        // needed for deserialization
    }

    public Car(int id, String modelName, CarSegment carSegment, String description, int introduced, String engine, int power, boolean available) {
        this.id = id;
        this.modelName = modelName;
        this.carSegment = carSegment;
        this.description = description;
        this.introduced = introduced;
        this.engine = engine;
        this.power = power;
        this.available = available;
    }

    public int getId() {
        return id;
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

    public boolean isAvailable() {
        return available;
    }
}

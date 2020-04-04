package pl.marcinszewczyk.cars;

public class Car {
    String modelName;
    String description;
    int introduced;
    String engine;
    int power;

    public Car(String modelName, String description, int introduced, String engine, int power) {
        this.modelName = modelName;
        this.description = description;
        this.introduced = introduced;
        this.engine = engine;
        this.power = power;
    }

    public String getModelName() {
        return modelName;
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

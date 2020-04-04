package pl.marcinszewczyk.cars.data;

import pl.marcinszewczyk.cars.Car;

public class TestCarDataProvider implements CarDataProvider {
    public Car getCarInformation(String model) {
        System.out.println("Getting data from test database");
        return new Car(model, "description", 1980, "1.0", 95);
    }
}

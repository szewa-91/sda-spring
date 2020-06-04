package pl.marcinszewczyk.cars.data;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.cars.Car;

public class TestCarDataSource {
    public Car getCarData(String model) {
        System.out.println("Getting data from test database");
        return new Car(model, CarSegment.A, "description", 1980, "1.0", 95);
    }
}

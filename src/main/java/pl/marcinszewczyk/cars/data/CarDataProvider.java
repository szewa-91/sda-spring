package pl.marcinszewczyk.cars.data;

import pl.marcinszewczyk.cars.Car;

public interface CarDataProvider {
    Car getCarInformation(String model);
}

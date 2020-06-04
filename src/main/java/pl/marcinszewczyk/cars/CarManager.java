package pl.marcinszewczyk.cars;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.cars.data.FordDatabase;
import pl.marcinszewczyk.cars.display.CarFullDataDisplayer;

import java.util.List;
import java.util.stream.Collectors;

public class CarManager {
    public void displayCarData(String model) {
        FordDatabase fordDatabase = new FordDatabase();
        CarFullDataDisplayer carFullDataDisplayer = new CarFullDataDisplayer();

        Car carData = fordDatabase.getCarData(model);
        carFullDataDisplayer.displayCarData(carData);
    }

    public void displayCarsForSegment(CarSegment carSegment) {
        FordDatabase fordDatabase = new FordDatabase();
        List<Car> carsForSegment = fordDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        CarFullDataDisplayer carFullDataDisplayer = new CarFullDataDisplayer();
        carsForSegment.forEach(carFullDataDisplayer::displayCarData);
    }
}

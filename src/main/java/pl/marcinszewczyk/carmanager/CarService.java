package pl.marcinszewczyk.carmanager;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.display.CarDisplayer;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private final CarDatabase carDatabase;
    private final CarDisplayer carDisplayer;

    public CarService(CarDatabase carDatabase, CarDisplayer carDisplayer) {
        this.carDatabase = carDatabase;
        this.carDisplayer = carDisplayer;
    }

    public void displayCarsForSegment(CarSegment carSegment) {
        List<Car> carsForSegment = carDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        carsForSegment.forEach(carDisplayer::displayCarData);
    }
}

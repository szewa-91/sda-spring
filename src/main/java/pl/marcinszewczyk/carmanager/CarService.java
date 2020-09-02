package pl.marcinszewczyk.carmanager;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.data.FordDatabase;
import pl.marcinszewczyk.carmanager.display.CarFullDataDisplayer;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public void displayCarsForSegment(CarSegment carSegment) {
        FordDatabase fordDatabase = new FordDatabase();
        List<Car> carsForSegment = fordDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        CarFullDataDisplayer carFullDataDisplayer = new CarFullDataDisplayer();
        carsForSegment.forEach(carFullDataDisplayer::displayCarData);
    }
}

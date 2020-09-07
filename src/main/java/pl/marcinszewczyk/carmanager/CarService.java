package pl.marcinszewczyk.carmanager;

import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.data.CarDatabase;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private final CarDatabase carDatabase;

    public CarService(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }

    public List<Car> getCarsForSegment(CarSegment carSegment) {
        return carDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return carDatabase.getAllCars();
    }

    public Car getCarById(int id) {
        return carDatabase.getCarById(id);
    }

    public void addCar(Car car) {
        carDatabase.addCar(car);
    }

    public void removeCarById(int id) {
        carDatabase.removeCarById(id);
    }
}

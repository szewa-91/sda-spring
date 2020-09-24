package pl.marcinszewczyk.carmanager;

import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.data.CarDatabase;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class CarService {

    private final CarDatabase carDatabase;

    public CarService(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }

    public List<Car> getCarsForSegment(CarSegment carSegment) {
        return carDatabase.findBySegment(carSegment);
    }

    public List<Car> getAllCars() {
        return carDatabase.findAll();
    }

    public Car getCarById(int id) {
        return carDatabase.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void addCar(Car car) {
        carDatabase.save(car);
    }

    public void removeCarById(int id) {
        Car carToDelete = carDatabase.findById(id).orElseThrow(NoSuchElementException::new);
        carDatabase.delete(carToDelete);
    }
}

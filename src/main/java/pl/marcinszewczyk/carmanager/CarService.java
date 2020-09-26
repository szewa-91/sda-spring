package pl.marcinszewczyk.carmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.data.CarDatabase;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Component
public class CarService {

    @Value("${carmanager.showonlyavailable}")
    private boolean showOnlyAvailable;

    @Value("${carmanager.welcomemessage}")
    String welcomeMessage;

    private final CarDatabase carDatabase;

    public CarService(CarDatabase carDatabase) {
        this.carDatabase = carDatabase;
    }

    public List<Car> getCarsForSegment(CarSegment carSegment) {
        return carDatabase.findBySegment(carSegment);
    }

    public List<Car> getAllCars() {
        System.out.println(welcomeMessage);

        if (showOnlyAvailable) {
            return carDatabase.findAll().stream()
                    .filter(car -> car.isAvailable())
                    .collect(Collectors.toList());
        } else {
            return carDatabase.findAll();
        }
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

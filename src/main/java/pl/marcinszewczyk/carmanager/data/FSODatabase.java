package pl.marcinszewczyk.carmanager.data;

import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
public class FSODatabase implements CarDatabase {
    List<Car> carInformation = new ArrayList<>();

    public FSODatabase() {
        carInformation.add(new Car(1, "Polonez Caro", CarSegment.C, "5-drzwiowy hatchback", 1967, "1.4 l", 86));
        carInformation.add(new Car(2, "Fiat 125p", CarSegment.D, "Samochód osobowy klasy średniej", 1976, "1.5 l", 60));
        carInformation.add(new Car(3, "Fiat 126", CarSegment.A, "Małe autko", 1973, "0.6 l", 23));
    }

    public List<Car> getAllCars() {
        System.out.println("Getting all cars from FSO database");
        return carInformation;
    }

    @Override
    public void addCar(Car car) {
        carInformation.add(car);
    }

    @Override
    public Car getCarById(int id) {
        return carInformation.stream()
                .filter(car -> car.getId() == id)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void removeCarById(int id) {
        Car carToRemove = getCarById(id);
        carInformation.remove(carToRemove);
    }
}

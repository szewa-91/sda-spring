package pl.marcinszewczyk.carmanager.data;

import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FSODatabase implements CarDatabase {
    List<Car> carInformation = new ArrayList<>();

    public FSODatabase() {
        carInformation.add(new Car(1, "Polonez Caro", CarSegment.C, "5-drzwiowy hatchback", 1967, "1.4 l", 86, true));
        carInformation.add(new Car(2, "Fiat 125p", CarSegment.D, "Samochód osobowy klasy średniej", 1976, "1.5 l", 60, false));
        carInformation.add(new Car(3, "Fiat 126", CarSegment.A, "Małe autko", 1973, "0.6 l", 23, true));
    }

    @Override
    public List<Car> findAll() {
        System.out.println("Getting all cars from Ford database");
        return carInformation;
    }

    @Override
    public List<Car> findBySegment(CarSegment carSegment) {
        return carInformation.stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Car> findById(int id) {
        return carInformation.stream()
                .filter(car -> car.getId() == id)
                .findFirst();
    }

    @Override
    public void save(Car car) {
        carInformation.add(car);
    }

    @Override
    public void delete(Car car) {
        carInformation.remove(car);
    }
}

package pl.marcinszewczyk.carmanager.data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Primary
@Component
public class FordDatabase implements CarDatabase {
    List<Car> carInformation = new ArrayList<>();

    public FordDatabase() {
        carInformation.add(new Car(1, "Ford Focus", CarSegment.C, "Ford's Compact car based on global C-car platform", 1998, "1.5 l", 134));
        carInformation.add(new Car(2, "Ford Fiesta", CarSegment.B, "Ford's long running subcompact line based on global B-car Platform", 1976, "1.5 l", 200));
        carInformation.add(new Car(3, "Ford Transit", CarSegment.B, "Leisure activity vehicle", 2014, "1.6 l", 100));
        carInformation.add(new Car(4, "Ford Mondeo", CarSegment.D, "Mid sized passenger sedan with \"One-Ford\" design based on CD4 platform.", 1998, "2 l", 203));
    }

    public List<Car> getAllCars() {
        System.out.println("Getting all cars from Ford database");
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

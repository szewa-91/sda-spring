package pl.marcinszewczyk.carmanager.data;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.Car;

import java.util.*;

public class FSODatabase {
    List<Car> carInformation = new ArrayList<>();

    public FSODatabase() {
        carInformation.add(new Car("Polonez Caro", CarSegment.C, "5-drzwiowy hatchback", 1967, "1.4 l", 86));
        carInformation.add(new Car("Fiat 125p", CarSegment.D, "Samochód osobowy klasy średniej", 1976, "1.5 l", 60));
        carInformation.add(new Car("Fiat 126", CarSegment.A, "Małe autko", 1973, "0.6 l", 23));
    }

    public Collection<Car> getAllCars() {
        System.out.println("Getting all cars from Ford database");
        return carInformation;
    }
}

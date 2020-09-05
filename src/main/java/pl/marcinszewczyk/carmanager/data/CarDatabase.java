package pl.marcinszewczyk.carmanager.data;

import pl.marcinszewczyk.carmanager.Car;

import java.util.Collection;

public interface CarDatabase {
    Collection<Car> getAllCars();
}

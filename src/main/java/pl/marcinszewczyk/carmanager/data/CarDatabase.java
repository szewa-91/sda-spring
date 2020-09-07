package pl.marcinszewczyk.carmanager.data;

import pl.marcinszewczyk.carmanager.Car;

import java.util.List;

public interface CarDatabase {
    List<Car> getAllCars();

    void addCar(Car car);

    Car getCarById(int id);

    void removeCarById(int id);
}

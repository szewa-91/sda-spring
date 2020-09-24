package pl.marcinszewczyk.carmanager.data;

import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;

import java.util.List;
import java.util.Optional;

public interface CarDatabase {
    List<Car> findAll();

    void save(Car car);

    Optional<Car> findById(int id);

    void delete(Car car);

    List<Car> findBySegment(CarSegment carSegment);
}

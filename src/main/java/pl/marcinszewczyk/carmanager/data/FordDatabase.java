package pl.marcinszewczyk.carmanager.data;

import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.Car;

import java.util.*;

public class FordDatabase implements CarDatabase {
    List<Car> carInformation = new ArrayList<>();

    public FordDatabase() {
        carInformation.add(new Car("Ford Focus", CarSegment.C, "Ford's Compact car based on global C-car platform", 1998, "1.5 l", 134));
        carInformation.add(new Car("Ford Fiesta", CarSegment.B, "Ford's long running subcompact line based on global B-car Platform", 1976, "1.5 l", 200));
        carInformation.add(new Car("Ford Transit", CarSegment.B, "Leisure activity vehicle", 2014, "1.6 l", 100));
        carInformation.add(new Car("Ford Mondeo", CarSegment.D, "Mid sized passenger sedan with \"One-Ford\" design based on CD4 platform.", 1998, "2 l", 203));
    }

    public Collection<Car> getAllCars() {
        System.out.println("Getting all cars from Ford database");
        return carInformation;
    }
}

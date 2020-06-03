package pl.marcinszewczyk.cars.data;

import pl.marcinszewczyk.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class FordDatabase {
    Map<String, Car> carInformation = new HashMap<>();

    public FordDatabase() {
        carInformation.put("Focus", new Car("Ford Focus", "Ford's Compact car based on global C-car platform", 1998, "1.5 l", 134));
        carInformation.put("Fiesta", new Car("Ford Fiesta", "Ford's long running subcompact line based on global B-car Platform", 1976, "1.5 l", 200));
        carInformation.put("Mondeo", new Car("Ford Mondeo", "Mid sized passenger sedan with \"One-Ford\" design based on CD4 platform.", 1998, "2 l", 203));
    }

    public Car getCarData(String model) {
        System.out.println("Getting data from Ford database");
        return carInformation.get(model);
    }
}

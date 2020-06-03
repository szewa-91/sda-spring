package pl.marcinszewczyk.cars.data;

import pl.marcinszewczyk.cars.Car;

import java.util.HashMap;
import java.util.Map;

public class FSODatabase {
    Map<String, Car> carInformation = new HashMap<>();

    public FSODatabase() {
        carInformation.put("Caro", new Car("Polonez Caro", "5-drzwiowy hatchback", 1967, "1.4 l", 86));
        carInformation.put("125p", new Car("Fiat 125p", "Samochód osobowy klasy średniej", 1976, "1.5 l", 60));
        carInformation.put("126", new Car("Fiat 126", "Małe autko", 1973, "0.6 l", 23));
    }

    public Car getCarData(String modelName) {
        System.out.println("Getting data from FSO database");
        return carInformation.get(modelName);
    }
}

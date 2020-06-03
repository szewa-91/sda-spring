package pl.marcinszewczyk.cars;

import pl.marcinszewczyk.cars.data.FordDatabase;
import pl.marcinszewczyk.cars.display.CarDescriptionDisplayer;
import pl.marcinszewczyk.cars.display.CarFullDataDisplayer;

public class CarManager {
    public void displayCarData(String model) {
        FordDatabase fordDatabase = new FordDatabase();
        CarFullDataDisplayer carFullDataDisplayer = new CarFullDataDisplayer();

        Car carData = fordDatabase.getCarData(model);
        carFullDataDisplayer.displayCarData(carData);
    }
}

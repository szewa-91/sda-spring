package pl.marcinszewczyk.cars;

import pl.marcinszewczyk.cars.data.FordDatabase;
import pl.marcinszewczyk.cars.display.CarDisplayer;

public class CarManager {
    public void displayCarData(String model) {
        FordDatabase fordDatabase = new FordDatabase();

        CarDisplayer carDisplayer = new CarDisplayer();

        carDisplayer.displayCarInformation(fordDatabase.getCarInformation(model));
    };
}

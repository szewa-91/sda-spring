package pl.marcinszewczyk;

import pl.marcinszewczyk.cars.CarManager;

public class Application {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();

        carManager.displayCarData("Focus");
    }
}

package pl.marcinszewczyk.carmanager.display;

import pl.marcinszewczyk.carmanager.Car;

public class CarDescriptionDisplayer implements CarDisplayer {

    public void displayCarData(Car car) {
        System.out.println(car.getDescription());
    }
}

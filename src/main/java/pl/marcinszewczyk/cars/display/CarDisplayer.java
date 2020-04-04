package pl.marcinszewczyk.cars.display;

import pl.marcinszewczyk.cars.Car;

public class CarDisplayer {

    public void displayCarInformation(Car car) {
        System.out.println("----------" + car.getModelName() + "----------");
        System.out.println("\tSince " + car.getIntroduced());
        System.out.println("\tPower: " + car.getPower());
        System.out.println("\tEngine: " + car.getEngine());
        System.out.println("\t" + car.getDescription());
    }
}

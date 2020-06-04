package pl.marcinszewczyk;

import pl.marcinszewczyk.cars.CarManager;

public class Application {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();

        System.out.println("Look for all cars from B segment");
        carManager.displayCarsForSegment(CarSegment.B);

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("Display data for Ford Fiesta");
        carManager.displayCarData("Fiesta");
    }
}

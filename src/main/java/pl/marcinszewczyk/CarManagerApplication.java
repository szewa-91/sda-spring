package pl.marcinszewczyk;

import pl.marcinszewczyk.carmanager.CarService;

public class CarManagerApplication {
    public static void main(String[] args) {
        CarService carService = new CarService();

        System.out.println("Look for all cars from B segment");
        carService.displayCarsForSegment(CarSegment.B);
    }
}

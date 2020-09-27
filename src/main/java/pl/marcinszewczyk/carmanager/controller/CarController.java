package pl.marcinszewczyk.carmanager.controller;

import org.springframework.web.bind.annotation.*;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;
import pl.marcinszewczyk.carmanager.CarService;

import java.util.List;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/segment/{segment}")
    public List<Car> getCarsBySegment(@PathVariable("segment") CarSegment segment) {
        return carService.getCarsForSegment(segment);
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public void removeCar(@PathVariable int id) {
        carService.removeCarById(id);
    }
}

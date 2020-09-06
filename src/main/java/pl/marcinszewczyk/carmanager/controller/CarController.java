package pl.marcinszewczyk.carmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinszewczyk.carmanager.CarSegment;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarService;

import java.util.List;

@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{segment}")
    public List<Car> getCarsBySegment(@PathVariable("segment") CarSegment segment) {
        return carService.getCarsForSegment(segment);
    }
}

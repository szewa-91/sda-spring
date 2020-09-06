package pl.marcinszewczyk.carmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.display.CarDisplayer;

import java.util.List;
import java.util.stream.Collectors;

@Lazy
@Component
public class CarService {

    private CarDatabase carDatabase;
    private CarDisplayer carDisplayer;

    @Autowired
    public CarService(CarDatabase carDatabase, @Qualifier("displayer1") CarDisplayer carDisplayer) {
        System.out.println("Tworze car service");
        this.carDatabase = carDatabase;
        this.carDisplayer = carDisplayer;
    }

    public void displayCarsForSegment(CarSegment carSegment) {
        List<Car> carsForSegment = carDatabase.getAllCars().stream()
                .filter(car -> car.getCarSegment().equals(carSegment))
                .collect(Collectors.toList());

        carsForSegment.forEach(carDisplayer::displayCarData);
    }
}

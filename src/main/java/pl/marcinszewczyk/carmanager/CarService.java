package pl.marcinszewczyk.carmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.data.JpaCarRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Component
public class CarService {

    @Value("${carmanager.showonlyavailable}")
    private boolean showOnlyAvailable;

    @Value("${carmanager.welcomemessage}")
    String welcomeMessage;

    private final JpaCarRepository jpaCarRepository;

    public CarService( JpaCarRepository jpaCarRepository) {
        this.jpaCarRepository = jpaCarRepository;
    }

    public List<Car> getCarsForSegment(CarSegment carSegment) {
        return jpaCarRepository.findByCarSegment(carSegment);
    }

    public List<Car> getAllCars() {
        System.out.println(welcomeMessage);

        List<Car> allCars = jpaCarRepository.findAll();

        if (showOnlyAvailable) {
            return allCars.stream()
                    .filter(car -> car.isAvailable())
                    .collect(Collectors.toList());
        } else {
            return allCars;
        }
    }

    public Car getCarById(int id) {
        return jpaCarRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void addCar(Car car) {
        jpaCarRepository.save(car);
    }

    public void removeCarById(int id) {
        Car carToDelete = jpaCarRepository.findById(id).orElseThrow(NoSuchElementException::new);
        jpaCarRepository.delete(carToDelete);
    }
}

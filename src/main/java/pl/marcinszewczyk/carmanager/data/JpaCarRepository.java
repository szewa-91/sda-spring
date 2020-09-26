package pl.marcinszewczyk.carmanager.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcinszewczyk.carmanager.Car;
import pl.marcinszewczyk.carmanager.CarSegment;

import java.util.List;

@Repository
public interface JpaCarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByCarSegment(CarSegment carSegment);
}

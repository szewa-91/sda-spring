package pl.marcinszewczyk.carmanager;


import org.junit.Test;
import org.mockito.Mockito;
import pl.marcinszewczyk.CarSegment;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.display.CarDisplayer;

import javax.swing.text.Segment;
import java.util.Arrays;

class CarServiceTest {
    @Test
    public void carServiceShouldWork() {

        CarDatabase carDatabase = Mockito.mock(CarDatabase.class);
        CarDisplayer carDisplayer = Mockito.mock(CarDisplayer.class);

        Mockito.when(carDatabase.getAllCars())
                .thenReturn(
                        Arrays.asList(new Car(
                                "Test auto",
                                CarSegment.C,
                                "description",
                                1991,
                                "1,4",
                                120)));

        CarService carService = new CarService(carDatabase, carDisplayer);

        carService.displayCarsForSegment(CarSegment.C);

        Mockito.verify(carDisplayer);
    }
}
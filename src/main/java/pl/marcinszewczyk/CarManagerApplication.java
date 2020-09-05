package pl.marcinszewczyk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.marcinszewczyk.carmanager.CarService;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.data.FordDatabase;
import pl.marcinszewczyk.carmanager.display.CarFullDataDisplayer;

public class CarManagerApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CarManagerConfiguration.class);

//        CarService carService = applicationContext.getBean(CarService.class); //przez typ
        CarService carService = applicationContext.getBean("carService", CarService.class);

        System.out.println("Look for all cars from B segment");
        carService.displayCarsForSegment(CarSegment.B);
    }
}

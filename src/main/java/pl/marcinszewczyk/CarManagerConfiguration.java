package pl.marcinszewczyk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import pl.marcinszewczyk.carmanager.CarService;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.data.FSODatabase;
import pl.marcinszewczyk.carmanager.data.FordDatabase;
import pl.marcinszewczyk.carmanager.display.CarDisplayer;
import pl.marcinszewczyk.carmanager.display.CarFullDataDisplayer;

public class CarManagerConfiguration {
    @Bean
    @Profile({"default"})
    public CarDatabase forDatabase() {
        return new FordDatabase();
    }

    @Bean
    @Profile({"fso"})
    CarDatabase fsoDatabase() {
        return new FSODatabase();
    }

    @Bean
    public CarDisplayer carFullDataDisplayer() {
        return new CarFullDataDisplayer();
    }

    @Bean
    public CarService carService(
            CarDatabase carDatabase,
            CarDisplayer carDisplayer
    ) {
        return new CarService(carDatabase, carDisplayer);
    }
}

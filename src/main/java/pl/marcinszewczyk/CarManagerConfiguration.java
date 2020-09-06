package pl.marcinszewczyk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import pl.marcinszewczyk.carmanager.CarService;
import pl.marcinszewczyk.carmanager.data.CarDatabase;
import pl.marcinszewczyk.carmanager.data.FSODatabase;
import pl.marcinszewczyk.carmanager.data.FordDatabase;
import pl.marcinszewczyk.carmanager.display.CarDisplayer;
import pl.marcinszewczyk.carmanager.display.CarFullDataDisplayer;

@Configuration
@ComponentScan("pl.marcinszewczyk.carmanager")
public class CarManagerConfiguration {
}


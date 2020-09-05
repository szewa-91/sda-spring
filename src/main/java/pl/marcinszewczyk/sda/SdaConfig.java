package pl.marcinszewczyk.sda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import java.util.List;

public class SdaConfig {
    @Bean
    @Order(6)
    public PeopleProvider nameProvider() {
        return new NameProvider();
    }

    @Bean
    @Order(3)
    public PeopleProvider surnameProvider() {
        return new SurnameProvider();
    }

    @Bean
    public SdaService sdaService(
            List<PeopleProvider> peopleProvider
    ) {
        return new SdaService(peopleProvider);
    }
}

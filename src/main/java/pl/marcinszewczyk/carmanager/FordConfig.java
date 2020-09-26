package pl.marcinszewczyk.carmanager;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("ford")
@PropertySource("carmanager-ford.properties")
public class FordConfig {
}

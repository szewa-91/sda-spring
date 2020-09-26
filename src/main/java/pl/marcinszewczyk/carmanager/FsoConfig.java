package pl.marcinszewczyk.carmanager;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("fso")
@PropertySource("carmanager-fso.properties")
public class FsoConfig {
}

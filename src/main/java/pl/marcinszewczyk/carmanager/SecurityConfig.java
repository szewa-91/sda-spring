package pl.marcinszewczyk.carmanager;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
            .and()
                .headers()
                .frameOptions()
                .sameOrigin()

            .and()
                .authorizeRequests()
                .antMatchers( "/h2-console/**").permitAll()
                .antMatchers(HttpMethod.GET, "/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/cars/segment/*").hasRole("MOD")
                .antMatchers(HttpMethod.POST, "/**").hasRole("SHOGUN")
                .antMatchers(HttpMethod.DELETE, "/**").hasRole("SHOGUN")
            .and()
                .formLogin();

        http.csrf().disable();
    }
}

package pl.marcinszewczyk.carmanager.users;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserService implements UserDetailsService {
    private List<CarManagerUser> users = new ArrayList<>();

    public UserService() {
        users.add(
                new CarManagerUser("user1", "{noop}password",
                        Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")),
                        true, true, true, true
                )
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findAny().orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }
}

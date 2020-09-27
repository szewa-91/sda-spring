package pl.marcinszewczyk.carmanager.users;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITY")
public class CarManagerAuthority implements GrantedAuthority {
    @Id
    String authority;

    public CarManagerAuthority() {
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}

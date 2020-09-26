package pl.marcinszewczyk.carmanager;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "ver_seq", initialValue = 101)
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ver_seq")
    int id;
    String name;

    public Version() {
    }

    public Version(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

package pl.marcinszewczyk.carmanager;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "adj_seq")
public class Adjustment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adj_seq")
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

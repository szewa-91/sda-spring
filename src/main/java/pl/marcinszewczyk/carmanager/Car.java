package pl.marcinszewczyk.carmanager;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator(name = "car_seq", initialValue = 101)
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq")
    private int id;
    private String modelName;
    private CarSegment carSegment;
    private String description;
    private int introduced;
    private String engine;
    private int power;
    private boolean available;

    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "CAR_ID")
    private List<Version> versions = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "CAR_TO_CAR_ADJUSTMENTS",
            joinColumns = @JoinColumn(name = "CAR_ID"),
            inverseJoinColumns = @JoinColumn(name = "ADJUSTMENT_ID")
    )
    private List<Adjustment> adjustments;

    public Car() {
        // needed for deserialization
    }

    public Car(int id, String modelName, CarSegment carSegment, String description, int introduced, String engine, int power, boolean available) {
        this.id = id;
        this.modelName = modelName;
        this.carSegment = carSegment;
        this.description = description;
        this.introduced = introduced;
        this.engine = engine;
        this.power = power;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public CarSegment getCarSegment() {
        return carSegment;
    }

    public String getDescription() {
        return description;
    }

    public int getIntroduced() {
        return introduced;
    }

    public String getEngine() {
        return engine;
    }

    public int getPower() {
        return power;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public List<Adjustment> getAdjustments() {
        return adjustments;
    }
}

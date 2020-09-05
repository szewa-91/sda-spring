package pl.marcinszewczyk.sda;

import java.util.Arrays;
import java.util.List;

public class NameProvider implements PeopleProvider {

    @Override
    public List<String> getPeopleList() {
        return Arrays.asList("Asia", "Tomek", "Wojtek");
    }
}

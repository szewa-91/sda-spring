package pl.marcinszewczyk.sda;

import java.util.Arrays;
import java.util.List;

public class SurnameProvider implements PeopleProvider {

    @Override
    public List<String> getPeopleList() {
        return Arrays.asList("Nowak", "Trump", "Obama");
    }
}

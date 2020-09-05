package pl.marcinszewczyk.sda;

import java.util.List;

public class SdaService {
    List<PeopleProvider> peopleProviders;

    public SdaService(List<PeopleProvider> peopleProviders) {
        this.peopleProviders = peopleProviders;
    }

    public void run() {
        for (PeopleProvider peopleProvider: peopleProviders) {
            List<String> peopleList = peopleProvider.getPeopleList();
            System.out.println(peopleList);

        }
    }
}

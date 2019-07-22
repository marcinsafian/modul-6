package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountriesOnContinent);
    }

    public boolean addCountry (Country country){
        return listOfCountriesOnContinent.add(country);
    }
}
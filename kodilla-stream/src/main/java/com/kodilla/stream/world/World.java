package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.*;

public class World {
    private final List<Continent> listOfContinentsOnTheWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listOfContinentsOnTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantyty(){
        BigDecimal peoleQntonTheWorld = listOfContinentsOnTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,country)->sum.add(country));
        return peoleQntonTheWorld;

    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal peopleQty;

    public Country(final String countryName, final BigDecimal peopleQty) {
        this.countryName = countryName;
        this.peopleQty = peopleQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQty;
    }
}

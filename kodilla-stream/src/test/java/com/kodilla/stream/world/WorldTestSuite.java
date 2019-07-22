package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public final class WorldTestSuite {
    @Test
    public void testGetPeopleQnt(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland",new BigDecimal("100000009"));
        Country czechRepublic = new Country("CzechRepublic",new BigDecimal("100000009"));
        Country romania = new Country("Romania",new BigDecimal("100000009"));

        Country japan = new Country("Japan",new BigDecimal("100000009"));
        Country china = new Country("China",new BigDecimal("100000009"));
        Country taiwan = new Country("Taiwan",new BigDecimal("100000009"));

        Country kongo = new Country("Kongo",new BigDecimal("100000009"));
        Country rpa = new Country("RPA",new BigDecimal("100000009"));
        Country maroko = new Country("Maroko",new BigDecimal("100000009"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addCountry(czechRepublic);
        europe.addCountry(poland);
        europe.addCountry(romania);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(taiwan);

        africa.addCountry(kongo);
        africa.addCountry(rpa);
        africa.addCountry(maroko);

        //When
        BigDecimal thePeople = world.getPeopleQuantyty();
        //Then
        BigDecimal expected = new BigDecimal(900000081);
        Assert.assertEquals(expected,thePeople);
    }

}
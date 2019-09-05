package com.kodilla.good.patterns.flight;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

public class FightTestSuite {
    private static Set<Flight> availableFlight;
    private static FlightsDb flightDbMock;
    private static FlightsService flightService;

    @BeforeClass
    public static void beforeFlight(){
        flightDbMock = mock(FlightsDb.class);
        flightService = new FlightsService(flightDbMock);
        availableFlight = new HashSet<>();

        availableFlight.add(new Flight("WRO","WAR"));
        availableFlight.add(new Flight("WAR","GDA"));
        availableFlight.add(new Flight("WRO","BER"));
        availableFlight.add(new Flight("GDA","BER"));
        availableFlight.add(new Flight("WAR","BER"));
        availableFlight.add(new Flight("WRO","GDA"));
    }

    @Test
    public void availableFlightFromTest(){
        //Given
        String departureAirport = "WRO";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO","WAR"));
        expected.add(new Flight("WRO","BER"));
        expected.add(new Flight("WRO","GDA"));
        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<Flight> result = flightService.availableFlightFrom(departureAirport);
        //Then
        Assert.assertEquals(expected,result);
    }
    @Test
    public void noAvailableFlightsFromTest() {
        //Given
        String departureAirport = "BER";
        Set<Flight> expected = new HashSet<>();
        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<Flight> result = flightService.availableFlightFrom(departureAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}

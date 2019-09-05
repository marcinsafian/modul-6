package com.kodilla.good.patterns.flight;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    @Test
    public void availableFlightsToTest(){
        //Given
        String arrivalAirport = "BER";
        Set<Flight> expected = new HashSet<>();
        expected.add(new Flight("WRO","BER"));
        expected.add(new Flight("GDA","BER"));
        expected.add(new Flight("WAR","BER"));
        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<Flight> result = flightService.availableFlightTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected,result);
    }
    @Test
    public void noAvailableFlightsToTest(){
        //Given
        String arrivalAirport = "WRO";
        Set<Flight> expected = new HashSet<>();
        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<Flight> result = flightService.availableFlightTo(arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
    @Test
    public void availableConnectingFlightsTest(){
        //Given
        String departureAirport = "WRO";
        String arrivalAirport = "BER";
        Set<List<Flight>> expect = new HashSet<>();

        List<Flight> wroWarWarBer = new ArrayList<>();
        wroWarWarBer.add(new Flight("WRO","WAR"));
        wroWarWarBer.add(new Flight("WAR","BER"));
        expect.add(wroWarWarBer);

        List<Flight> wroGdaGdaBer = new ArrayList<>();
        wroGdaGdaBer.add(new Flight("WRO", "GDA"));
        wroGdaGdaBer.add(new Flight("GDA", "BER"));

        expect.add(wroGdaGdaBer);
        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<List<Flight>> result = flightService.availableConnect(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expect, result);
    }
    @Test
    public void noAvailableConnectingFlightsTest() {
        //Given
        String departureAirport = "BER";
        String arrivalAirport = "GDA";
        Set<List<Flight>> expected = new HashSet<>();

        //When
        when(flightDbMock.getAvailableFlight()).thenReturn(availableFlight);
        Set<List<Flight>> result = flightService.availableConnect(departureAirport, arrivalAirport);
        //Then
        Assert.assertEquals(expected, result);
    }
}

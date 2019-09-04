package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsService {
    private FlightsDb flightsDb;

    public FlightsService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }
    public Set<Flight> availableFlightFrom (String departureAirport){
        return flightsDb.getAvailableFlight().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }
    public Set<Flight> availableFlightTo (String arrivalAirport){
        return flightsDb.getAvailableFlight().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }
    public Set<List<Flight>> availableConnect (String departureAirport, String arrivalAirport){
        Set<List<Flight>> setFlight = new HashSet<>();

        flightsDb.getAvailableFlight().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .forEach(flight -> {
                    List<Flight> route = flightsDb.getAvailableFlight().stream()
                            .filter(flight1 -> (flight.getArrivalAirport().equals(flight1.getDepartureAirport()) && flight1.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());
                    if (route.size() > 0){
                        List<Flight> flightRoute = new ArrayList<>();
                        flightRoute.add(flight);
                        flightRoute.addAll(route);

                        setFlight.add(flightRoute);
                    }
                });
        return setFlight;
    }
}

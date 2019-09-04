package com.kodilla.good.patterns.flight;

public class FlightsService {
    private FlightsDb flightsDb;

    public FlightsService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }
}

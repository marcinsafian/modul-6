package com.kodilla.good.patterns.flight;

import java.util.Set;

public class FlightsDb {
    private Set<Flight> availableFlight;

    public FlightsDb(Set<Flight> availableFlight) {
        this.availableFlight = availableFlight;
    }

    public Set<Flight> getAvailableFlight() {
        return availableFlight;
    }

}

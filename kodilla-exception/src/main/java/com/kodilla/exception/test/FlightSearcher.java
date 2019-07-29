package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
private final Map<String,Boolean>airportMap;
        public FlightSearcher(){
    airportMap = airportBase();
        }
        public boolean findFlight(Flight flight) throws RouteNotFoundException{
            return findAirport(flight.getArrivalAirport())&&findAirport(flight.getDepartureAirport());
        }
       private boolean findAirport(String airportName) throws RouteNotFoundException{
            if(airportMap.containsKey(airportName)){
                return airportMap.get(airportName);
            }
            else {
                throw new RouteNotFoundException("AirPort does not exist");
            }
        }
        private Map<String,Boolean>airportBase(){
            Map<String,Boolean>airportBase = new HashMap<>();
            airportBase.put("WIEN",false);
            airportBase.put("WAR",true);
            airportBase.put("MOSC",false);
            airportBase.put("PRAG",true);
            airportBase.put("NOWHERE",false);

            return airportBase;
        }
}

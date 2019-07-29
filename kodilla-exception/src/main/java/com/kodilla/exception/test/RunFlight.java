package com.kodilla.exception.test;

public class RunFlight {
    public static void main(String[] args) {
        Flight wienWar = new Flight("WIEN","War");
        Flight moscPrag = new Flight("MOSC","PRAG");
        Flight warPrag = new Flight("WAR","PRAG");
        Flight noName = new Flight("NOWHERE","NAME");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existWienWar = flightSearcher.findFlight(wienWar);
            System.out.println("Flight Vienna Warsaw: "+existWienWar);
        }catch (RouteNotFoundException e){
            System.out.println("You are not allowed to fly");
        }
        try {
            boolean existMoscPrag = flightSearcher.findFlight(moscPrag);
            System.out.println("Flight Moscow Prague: "+existMoscPrag);
        }catch (RouteNotFoundException e){
            System.out.println("You are not allowed to fly");
        }

        try {
            boolean existWarPrag = flightSearcher.findFlight(warPrag);
            System.out.println("Flight Warsaw Prague: "+existWarPrag);
        }catch (RouteNotFoundException e){
            System.out.println("You are not allowed to fly");
        }
        try {
            boolean existNoName = flightSearcher.findFlight(noName);
            System.out.println("Flight from Nowhere to Nowhere: "+existNoName);
        }catch (RouteNotFoundException e){
            System.out.println("You are not allowed to fly");
        }
    }
}

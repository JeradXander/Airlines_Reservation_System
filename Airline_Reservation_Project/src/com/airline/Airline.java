package com.airline;

import com.locations.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Airline {

    //fields
    private String airLineName;
    private Location origin;
    private Location destination;

    HashMap<String, List<Flight>> airlineFlights;
    List<Flight> flightsList;

    //constructor
    public Airline(String airplaneNameArg) {
        setAirLineName(airplaneNameArg);
    }

    //getters and setters
    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airplaneArg) {
        airLineName = airplaneArg;
    }

    //getters and setters
    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location originArg) {
        this.origin = originArg;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destinationArg) {
        this.destination = destinationArg;
    }

    //initial airline flights
    public HashMap<String, List<Flight>> getAirlineFlights() {

        //creating flights
        flightsList = new ArrayList<>();
        flightsList.add(new Flight(1000, getOrigin(), getDestination(), "10:00 AM"));
        flightsList.add(new Flight(33000, getOrigin(), getDestination(), "4:00 PM"));

        //creating hashmap
        airlineFlights = new HashMap<>();
        airlineFlights.put("04/29/2021", flightsList);
        airlineFlights.put("04/30/2021", flightsList);
        airlineFlights.put("05/01/2021", flightsList);
        airlineFlights.put("05/02/2021", flightsList);
        airlineFlights.put("05/03/2021", flightsList);
        airlineFlights.put("05/04/2021", flightsList);
        airlineFlights.put("05/05/2021", flightsList);
        //returning hashmap
        return airlineFlights;
    }

    @Override
    public String toString() {
        return getAirLineName();
    }
}
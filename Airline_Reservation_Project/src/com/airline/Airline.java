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

    HashMap<String, List<Flights>> airlineFlights;
    List<Flights> flightsList;
    List<Flights> flightsListTest;

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
    public HashMap<String, List<Flights>> getAirlineFlights() {

        flightsList = new ArrayList<>();
        flightsList.add(new Flights(1000, getOrigin(), getDestination(), "10:00 AM"));
        flightsList.add(new Flights(33000, getOrigin(), getDestination(),"4:00 PM"));

        flightsListTest = new ArrayList<>();

        airlineFlights = new HashMap<>();
        airlineFlights.put("04/26/2021", flightsList);
        airlineFlights.put("04/27/2021", flightsList);
        airlineFlights.put("04/28/2021", flightsList);
        airlineFlights.put("04/29/2021", flightsList);
        airlineFlights.put("04/30/2021", flightsList);
        airlineFlights.put("05/01/2021", flightsList);
        airlineFlights.put("05/02/2021", flightsList);


        return airlineFlights;
    }

    @Override
    public String toString() {
        return getAirLineName();
    }
}
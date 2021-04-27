package com.airline;

import com.locations.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Airline {


    private String airLineName;
    private Location origin;
    private Location destination;

    HashMap<String, List<Flights>> airlineFlights;
    List<Flights> flightsList;
    List<Flights> flightsListTest;

    public Airline(String airplaneNameArg) {
        setAirLineName(airplaneNameArg);

    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airplaneArg) {
        airLineName = airplaneArg;
    }

    public HashMap<String, List<Flights>> getAirlineFlights() {

        flightsList = new ArrayList<>();
        flightsList.add(new Flights(1000,getOrigin(),getDestination()));
        flightsList.add(new Flights(33000,getOrigin(),getDestination()));

        flightsListTest = new ArrayList<>();

        airlineFlights = new HashMap<>();
        airlineFlights.put("04/26/2021",flightsList);
        airlineFlights.put("04/27/2021",flightsList);
        airlineFlights.put("04/28/2021",flightsList);
        airlineFlights.put("04/29/2021",flightsList);
        airlineFlights.put("04/30/2021",flightsList);
        airlineFlights.put("05/01/2021",flightsList);
        airlineFlights.put("05/02/2021",flightsList);


        return airlineFlights;
    }

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

    @Override
    public String toString() {
        return getAirLineName();
    }
}
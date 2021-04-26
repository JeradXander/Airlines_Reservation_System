package com.airline;

import java.util.HashMap;

public class Airline {


    private String airLineName;
    HashMap<String,Flights> airlineFlights;


    public Airline(String airplaneNameArg) {
        setAirLineName(airplaneNameArg);

    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airplaneArg) {
        airLineName = airplaneArg;
    }

    @Override
    public String toString() {
        return getAirLineName();
    }
}
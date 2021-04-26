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
    public HashMap<String, Flights> getAirlineFlights() {
        airlineFlights = new HashMap<>();
        airlineFlights.put("04/26/2021",new Flights());
        airlineFlights.put("04/27/2021",new Flights());
        airlineFlights.put("04/28/2021",new Flights());
        airlineFlights.put("04/29/2021",new Flights());
        airlineFlights.put("04/30/2021",new Flights());
        airlineFlights.put("05/01/2021",new Flights());
        airlineFlights.put("05/02/2021",new Flights());


        return airlineFlights;
    }


    @Override
    public String toString() {
        return getAirLineName();
    }
}
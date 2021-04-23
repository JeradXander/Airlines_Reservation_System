package com.Airline;

import java.util.Date;

public class Airline {

    private String airplaneName;


    public Airline(String airplaneNameArg) {

        setAirplane(airplaneNameArg);

    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplane(String airplaneArg) {
        airplaneName = airplaneArg;
    }
}

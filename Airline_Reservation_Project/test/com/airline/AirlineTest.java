package com.airline;

import com.locations.Location;
import com.locations.Timezone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class AirlineTest {

    Airline testAirline;
    HashMap<String, List<Flight>> airlineFlightsExpected;
    List<Flight> flightsListExpected;
    Location origin;
    Location destination;

    @Before
    public void setUp(){
        //creating airline
        testAirline = new Airline("TLG Airlines");
        origin = new Location("San Diego", Timezone.PST);
        destination = new Location("San Diego", Timezone.PST);

        testAirline.setOrigin(origin);
        testAirline.setDestination(origin);

        //cre
        flightsListExpected = new ArrayList<>();
        flightsListExpected.add(new Flight(1000, origin, destination, "10:00 AM"));
        flightsListExpected.add(new Flight(33000, origin, destination, "4:00 PM"));


        airlineFlightsExpected = new HashMap<>();
        airlineFlightsExpected.put("04/26/2021", flightsListExpected);
        airlineFlightsExpected.put("04/27/2021", flightsListExpected);
        airlineFlightsExpected.put("04/28/2021", flightsListExpected);
        airlineFlightsExpected.put("04/29/2021", flightsListExpected);
        airlineFlightsExpected.put("04/30/2021", flightsListExpected);
        airlineFlightsExpected.put("05/01/2021", flightsListExpected);
        airlineFlightsExpected.put("05/02/2021", flightsListExpected);
    }

    @Test
    public void getAirLineName() {

        String expected = "TLG Airlines";

       assertEquals(expected,testAirline.getAirLineName());
    }

    @Test
    public void getOrigin() {
        //expected
        String expectedLocationString = new Location("San Diego", Timezone.PST).toString();

        //asserting equals
        assertEquals(origin.toString(), testAirline.getOrigin().toString());
    }

    @Test
    public void getDestination() {
        //expected
        String expectedLocationString = new Location("Seattle", Timezone.PST).toString();

        //asserting equals
        assertEquals(origin.toString(), testAirline.getDestination().toString());
    }

    @Test
    public void getAirlineFlights() {

        assertEquals(airlineFlightsExpected.toString(),testAirline.getAirlineFlights().toString());

    }
}
package com.client;

import com.airline.Airline;
import com.airline.Flight;
import com.locations.Location;
import com.locations.Timezone;
import com.tickets.Ticket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirlineClientTest {

    //initial fields for tests
    Airline testAirline;
    HashMap<String, List<Flight>> airlineFlightsExpected;
    List<Flight> flightsListExpected;
    Location origin;
    Location destination;
    private Airline[] airlinesToChooseFrom = {
        new Airline("TLG Airlines"),
                new Airline("Amazon Airlines"),
                new Airline("Apprenti Airlines"),
                new Airline("Doge Airlines Airlines"),
                new Airline("Kuma Airlines"),
                new Airline("Mark Airlines"),
                new Airline("Jerad Airlines"),
                new Airline("DuckChampion Airlines"),
                new Airline("Java Airlines"),
                new Airline("Wheat Thins Airlines")
    };

    //creating test locations
    Location[] locationsWithTimezone = {
            new Location("San Francisco", Timezone.PST),
            new Location("LA", Timezone.PST),
            new Location("Seattle", Timezone.PST),
            new Location("Denver", Timezone.CST),
            new Location("Dallas", Timezone.CST),
            new Location("OKC", Timezone.CST),
            new Location("NYC", Timezone.EST),
            new Location("Miami", Timezone.EST),
            new Location("Philadelphia", Timezone.EST)
    };

    @Before
    public void setup(){
        //creating airline
        testAirline = new Airline("TLG Airlines");
        origin = new Location("San Diego", Timezone.PST);
        destination = new Location("San Diego", Timezone.PST);

        testAirline.setOrigin(origin);
        testAirline.setDestination(origin);

        //creating flights
        flightsListExpected = new ArrayList<>();
        flightsListExpected.add(new Flight(1000, origin, destination, "10:00 AM"));
        flightsListExpected.add(new Flight(33000, origin, destination, "4:00 PM"));

        //creating flights hashmap for testing
        airlineFlightsExpected = new HashMap<>();
        airlineFlightsExpected.put("04/29/2021", flightsListExpected);
        airlineFlightsExpected.put("04/30/2021", flightsListExpected);
        airlineFlightsExpected.put("05/01/2021", flightsListExpected);
        airlineFlightsExpected.put("05/02/2021", flightsListExpected);
        airlineFlightsExpected.put("05/03/2021", flightsListExpected);
        airlineFlightsExpected.put("05/04/2021", flightsListExpected);
        airlineFlightsExpected.put("05/05/2021", flightsListExpected);
    }

    @Test
    public void userSelectsAirlineFromList(){
        int userInput = 2;

        String expectedAirlineName = "Apprenti Airlines";
        assertEquals(expectedAirlineName, airlinesToChooseFrom[userInput].getAirLineName());
    }


    @Test
    public void userSelectsLocationNameFromList(){
        //variable to test
        int userInput = 2;
        String expectedLocationName = "Seattle";

        //assert to test
        assertEquals(expectedLocationName, locationsWithTimezone[userInput].getName());
    }

    @Test
    public void userSelectsDateFromList(){
        //variable to test
        String userInput = "04/29/2021";

        //asssert to test
        assertEquals(true   , testAirline.getAirlineFlights().containsKey(userInput));
    }

    @Test
    public void userSelectsTicketFromList(){

        //variables to test
        String userdate = "04/29/2021";
        String expectTicketString = "Flight Number: 33000-> Leaving at 4:00 PM";
        int userInput = 1;

        //assert for test
        assertEquals( expectTicketString, testAirline.getAirlineFlights().get(userdate).get(userInput).toString());
    }

}
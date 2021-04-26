package com.client;

import com.airline.Airline;
import com.locations.Location;
import com.locations.Timezone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirlineClientTest {

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

    }

    @Test
    public void userSelectsAirlineFromList(){
        int userInput = 2;
        String expectedAirlineName = "Apprenti Airlines";
        assertEquals(expectedAirlineName, airlinesToChooseFrom[2].getAirLineName());
    }
}
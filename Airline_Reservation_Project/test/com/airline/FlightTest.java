package com.airline;

import com.locations.Location;
import com.locations.Timezone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {

    Flight testFlight;

    @Before
    public void setUp() {
        //setup
        testFlight = new Flight(1000, new Location("LA", Timezone.PST), new Location("NY", Timezone.EST), "11:00 AM");
    }

    @Test
    public void getFlightIdTest() {

        //expected
        int expectedId = 1000;

        //asserting toString
        assertEquals(expectedId, testFlight.getFlightId());
    }

    @Test
    public void getOriginTest() {

        //expected
        String expectedLocationString = new Location("LA", Timezone.PST).toString();

        //asserting actual is same as expected
        assertEquals(expectedLocationString, testFlight.getOrigin().toString());
    }


    @Test
    public void getDestination() {
        //expected
        String expectedLocationString = new Location("NY", Timezone.PST).toString();

        //asserting equals
        assertEquals(expectedLocationString, testFlight.getDestination().toString());
    }

    @Test
    public void getTimeTest() {
        //expected
        String expectedTimeString = "11:00 AM";

        //asserting equals
        assertEquals(expectedTimeString, testFlight.getRoughTimeOfFlight());
    }

}
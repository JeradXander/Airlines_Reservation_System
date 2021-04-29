package com.locations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    //location to test
    Location testLocation = new Location("San Diego", Timezone.PST);

    @Before
    public void setup() {
    }

    @Test
    public void LocationTestForGetName() {
        //expected
        String expectedLocationName = "San Diego";

        //asserting eqauls
        assertEquals(expectedLocationName, testLocation.getName());
    }

    @Test
    public void LocationTestForGetTimezone() {
        //expected
        Timezone expectedTimeZone = Timezone.PST;

        //asserting eqauls
        assertEquals(expectedTimeZone, testLocation.getTimeZone());
    }
}
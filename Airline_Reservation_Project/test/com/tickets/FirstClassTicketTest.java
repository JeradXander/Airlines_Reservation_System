package com.tickets;

import com.locations.Location;
import com.locations.Timezone;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstClassTicketTest {
    @Test
    public void calculateFirstClassTicketPriceSuccessPathDifferentTimeZone() {
        Location origin = new Location("San Francisco", Timezone.PST);
        Location destination = new Location("OKC", Timezone.CST);

        FirstClassTicket firstClassTicket = new FirstClassTicket(origin,destination);

        // We got this by the difference of 2 time zones * 100 + 500 * the multpilier 1.6
        double expectedFirstClassTicketPrice = 1500;
        double actualFirstClassTicketPrice = firstClassTicket.calculateTicketPrice();
        assertEquals(expectedFirstClassTicketPrice, actualFirstClassTicketPrice, 0.001);
    }
    @Test
    public void calculateBusinessTicketPriceSuccessPathSameTimeZone() {
        Location origin = new Location("LA", Timezone.PST);
        Location destination = new Location("San Francisco", Timezone.PST);

        FirstClassTicket businessTicket = new FirstClassTicket(origin,destination);

        // 500 * the multpilier 2.5
        double expectedBusinessTicketPrice = 1250 ;
        double actualBusinessTicketPrice = businessTicket.calculateTicketPrice();
        assertEquals(expectedBusinessTicketPrice, actualBusinessTicketPrice, 0.001);
    }
}
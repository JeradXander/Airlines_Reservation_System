package com.tickets;

import com.locations.Location;
import com.locations.Timezone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessTicketTest {

    @Test
    public void calculateBusinessTicketPriceSuccessPathDifferentTimeZone() {
        Location origin = new Location("Seattle", Timezone.PST);
        Location destination = new Location("NYC", Timezone.EST);

        BusinessTicket businessTicket = new BusinessTicket(origin,destination);

        // We got this by the difference of 2 time zones * 100 + 500 * the multpilier 1.6
        double expectedBusinessTicketPrice = 1120;
        double actualBusinessTicketPrice = businessTicket.calculateTicketPrice();
        assertEquals(expectedBusinessTicketPrice, actualBusinessTicketPrice, 0.001);
    }
    @Test
    public void calculateBusinessTicketPriceSuccessPathSameTimeZone() {
        Location origin = new Location("OKC", Timezone.CST);
        Location destination = new Location("Dallas", Timezone.CST);

        BusinessTicket businessTicket = new BusinessTicket(origin,destination);

        // We got this by the difference of 2 time zones * 100 + 500 * the multpilier 1.6
        double expectedBusinessTicketPrice = 800 ;
        double actualBusinessTicketPrice = businessTicket.calculateTicketPrice();
        assertEquals(expectedBusinessTicketPrice, actualBusinessTicketPrice, 0.001);
    }
}
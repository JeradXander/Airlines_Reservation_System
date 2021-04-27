package com.tickets;

import com.locations.Location;
import com.locations.Timezone;
import org.junit.Test;

import static org.junit.Assert.*;

public class EconomyTicketTest {

    @Test
    public void calculateEconomyTicketPriceSuccessPathDifferentTimeZoneNoBags() {
        Location origin = new Location("Dallas", Timezone.CST);
        Location destination = new Location("Miami", Timezone.EST);

        EconomyTicket economyTicket = new EconomyTicket(origin,destination);

        // We got this by the difference of 2 time zones * 100 + 500
        double expectedEconomyTicketPrice = 600;
        double actualEconomyTicketPrice = economyTicket.calculateTicketPrice();
        assertEquals(expectedEconomyTicketPrice, actualEconomyTicketPrice, 0.001);
    }
    @Test
    public void calculateEconomyTicketPriceSuccessPathSameTimeZoneWith2Bags() {
        Location origin = new Location("Philadelphia", Timezone.EST);
        Location destination = new Location("NYC", Timezone.EST);

        EconomyTicket economyTicket = new EconomyTicket(origin,destination,2);
//        This works too ---> economyTicket.setBags(2);

        // We got 500 + 2(10) for bags
        double expectedEconomyTicketPrice = 520 ;
        double actualEconomyTicketPrice = economyTicket.calculateTicketPrice();
        assertEquals(expectedEconomyTicketPrice, actualEconomyTicketPrice, 0.001);
    }

    @Test
    public void calculateEconomyTicketPriceWithInvalidNumberOfBags() {
        Location origin = new Location("Philadelphia", Timezone.EST);
        Location destination = new Location("NYC", Timezone.EST);

        EconomyTicket economyTicket = new EconomyTicket(origin,destination,-12);

        // We got 500 + 2(10) for bags
        double expectedEconomyTicketPrice = 500 ;
        double actualEconomyTicketPrice = economyTicket.calculateTicketPrice();
        assertEquals(expectedEconomyTicketPrice, actualEconomyTicketPrice, 0.001);

        //anything above two bags check in will be invalid
        EconomyTicket economyTicket2 = new EconomyTicket(origin,destination,10);
        double expectedEconomyTicketPrice2 = 500 ;
        double actualEconomyTicketPrice2 = economyTicket.calculateTicketPrice();
        assertEquals(expectedEconomyTicketPrice2, actualEconomyTicketPrice2, 0.001);
    }

}
package com.tickets;

import com.locations.Location;

public class EconomyTicket implements TicketsCalculator{

    Location origin;
    Location destination;

    public EconomyTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }
    @Override
    public double calculateTicketPrice() {
        return 0;
    }
}

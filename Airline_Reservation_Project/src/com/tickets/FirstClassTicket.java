package com.tickets;

import com.locations.Location;

public class FirstClassTicket implements TicketsCalculator{

    Location origin;
    Location destination;

    public FirstClassTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    @Override
    public double calculateTicketPrice() {
        return 0;
    }
}

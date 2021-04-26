package com.tickets;

import com.locations.Location;

public class BusinessTicket implements TicketsCalculator{

    Location origin;
    Location destination;

    public BusinessTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    @Override
    public double calculateTicketPrice() {
        double price = 0;


        return price;
    }
}

package com.tickets;

import com.locations.Location;

public class FirstClassTicket implements TicketsCalculator{

    private Location origin;
    private Location destination;

    public FirstClassTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    @Override
    public double calculateTicketPrice() {
        double firstClassTicketMultiplier = 2.5;
        //calculates the difference of the two different time zones. larger difference means more
        int difference = Math.abs(origin.getTimeZone().ordinal() - destination.getTimeZone().ordinal());

        //equation to get ticket price from origin to destination
        double initialTicketPrice = 500 + (difference * 100);

        //calculated price from initial ticket price to business multiplier
        return initialTicketPrice * firstClassTicketMultiplier;
    }

    @Override
    public Location getOrigin() {
        return origin;
    }

    @Override
    public Location getDest() {
        return destination;
    }


    @Override
    public String toString() {
        return "First class ticket";
    }
}

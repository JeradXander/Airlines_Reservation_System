package com.tickets;

import com.locations.Location;

public class FirstClassTicket implements TicketsCalculator {

    //fields
    private Location origin;
    private Location destination;

    //constructor
    public FirstClassTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    //override method to calculate Ticket price by ticket type
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

    //methods to return origin and destination
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

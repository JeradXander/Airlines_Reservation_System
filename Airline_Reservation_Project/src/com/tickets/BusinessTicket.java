package com.tickets;

import com.locations.Location;
import com.locations.Timezone;

public class BusinessTicket implements TicketsCalculator {

    //fields
    private Location origin;
    private Location destination;

    //constructor
    public BusinessTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    //method to get price by ticket price
    @Override
    public double calculateTicketPrice() {
        double businessTicketMultiplier = 1.6;
        //calculates the difference of the two different time zones. larger difference means more
        int difference = Math.abs(origin.getTimeZone().ordinal() - destination.getTimeZone().ordinal());

        //equation to get ticket price from origin to destination
        double initialTicketPrice = 500 + (difference * 100);

        //calculated price from initial ticket price to business multiplier
        return initialTicketPrice * businessTicketMultiplier;
    }

    //getting origin and destination
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
        return "Business class ticket";
    }
}

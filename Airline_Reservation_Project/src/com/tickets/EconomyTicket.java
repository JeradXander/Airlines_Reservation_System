package com.tickets;

import com.locations.Location;

public class EconomyTicket implements TicketsCalculator{

    Location origin;
    Location destination;
    int bags = 0;


    public EconomyTicket(Location originArgs, Location destinationArgs) {
        origin = originArgs;
        destination = destinationArgs;
    }

    //created number of bags in constructor to add to the total price of economy
    public EconomyTicket(Location originArgs, Location destinationArgs, int bagNumbers) {
        origin = originArgs;
        destination = destinationArgs;
        setBags(bagNumbers);
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    @Override
    public double calculateTicketPrice() {
        //calculates the difference of the two different time zones. larger difference means more
        int difference = Math.abs(origin.getTimeZone().ordinal() - destination.getTimeZone().ordinal());

        //equation to get ticket price from origin to destination
        //calculated price from initial ticket price to business multiplier plus how many bags they're checking in
        double bagFee = getBags() * 10;
        double initialTicketPrice = 500 + (difference * 100);
        return initialTicketPrice + bagFee;
    }
}

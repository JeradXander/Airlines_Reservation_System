package com.tickets;

import com.locations.Location;

public class EconomyTicket implements TicketsCalculator {

    //fields
    private Location origin;
    private Location destination;
    private int bags = 0;

    //constructors
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

    //getters and setters
    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        if (bags >= 0 && bags <= 2) { this.bags = bags; }
    }

    //method to calculate price by ticket type
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
        return "Economy class ticket";
    }
}

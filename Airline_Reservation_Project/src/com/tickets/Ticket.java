package com.tickets;

import com.locations.Location;

//this has to be abstract?
public class Ticket {

    //fields
    private int ticketId;
    private TicketsCalculator ticketsCalculator;

    //constructor
    public Ticket(int ticketIdArgs, TicketsCalculator ticketsCalculatorArgs) {
        ticketId = ticketIdArgs;
        ticketsCalculator = ticketsCalculatorArgs;

    }

    //using interface to get price
    public double ticketPrice() {
        return ticketsCalculator.calculateTicketPrice();
    }

    //using interface to get origin
    public Location getOrig() {
        return ticketsCalculator.getOrigin();
    }

    //using interface to get destination
    public Location getDest() {
        return ticketsCalculator.getDest();
    }

    //ticket toString
    @Override
    public String toString() {
        return ticketsCalculator.toString() + "--> Seat number: " + ticketId;
    }
}

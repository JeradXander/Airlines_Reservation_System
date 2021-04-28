package com.tickets;

import com.locations.Location;

//this has to be abstract?
public class Ticket {

    private int ticketId;
    private TicketsCalculator ticketsCalculator;


    public Ticket(){}

    public Ticket(int ticketIdArgs, TicketsCalculator ticketsCalculatorArgs) {
        ticketId = ticketIdArgs;
        ticketsCalculator = ticketsCalculatorArgs;

    }

    public double pay(){
        return ticketsCalculator.calculateTicketPrice();
    }

    @Override
    public String toString() {
        return ticketsCalculator.toString() + "--> Seat number: " + ticketId;
    }
}

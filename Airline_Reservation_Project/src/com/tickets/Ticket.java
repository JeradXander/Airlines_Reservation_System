package com.tickets;

import com.locations.Location;

public class Ticket {

    private int ticketId;
    private TicketsCalculator ticketsCalculator;



    public Ticket(int ticketIdArgs, TicketsCalculator ticketsCalculatorArgs) {
        ticketId = ticketIdArgs;
        ticketsCalculator = ticketsCalculatorArgs;

    }



    public double pay(){
        return ticketsCalculator.calculateTicketPrice();
    }




}

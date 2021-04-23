package com.tickets;

public class Ticket {

    private int ticketId;
    private TicketsCalculator ticketsCalculator;

    public Ticket(int ticketIdArgs, TicketsCalculator ticketsCalculatorArgs) {
        this.ticketId = ticketIdArgs;
        this.ticketsCalculator = ticketsCalculatorArgs;
    }

    public double pay(){
        return ticketsCalculator.calculateTicketPrice();
    }
}

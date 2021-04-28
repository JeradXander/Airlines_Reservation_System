package com.tickets;

import com.locations.Location;

public interface TicketsCalculator {

    //interface contract methods
    double calculateTicketPrice();

    Location getOrigin();

    Location getDest();

    String toString();
}

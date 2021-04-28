package com.tickets;

import com.locations.Location;

public interface TicketsCalculator {

    double calculateTicketPrice();
    Location getOrigin();
    Location getDest();
    String toString();
}

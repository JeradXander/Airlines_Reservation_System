package com.airline;

import com.locations.Location;
import com.locations.Timezone;
import com.tickets.*;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    //fields
    private int flightId;
    private List<Ticket> tickets = new ArrayList<>();
    private Location origin;
    private Location destination;
    private String roughTimeOfFlight;

    //constructor
    public Flight(int flightIdArg, Location originArg, Location destinationArg, String timeArgs) {
        flightId = flightIdArg;
        origin = originArg;
        destination = destinationArg;
        roughTimeOfFlight = timeArgs;
        initialTicketList();
    }

    //getter and setters
    public List<Ticket> getTickets() {

        //returning list
        return tickets;
    }

    public int getFlightId() {
        return flightId;
    }

    public void ticketBought(Ticket ticketBoughtArgs) {
        tickets.remove(ticketBoughtArgs);
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public String getRoughTimeOfFlight() {
        return roughTimeOfFlight;
    }

    @Override
    public String toString() {
        return "Flight Number: " + String.valueOf(flightId)  + "-> Leaving at " + roughTimeOfFlight ;
    }

    //adding initial tickets for flight
    private void initialTicketList() {
        //economy tickets
        tickets.add(new Ticket(10, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(11, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(12, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(13, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(14, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(15, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(16, new EconomyTicket(origin, destination)));

        //business tickets
        tickets.add(new Ticket(17, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(18, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(19, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(20, new BusinessTicket(origin, destination)));

        //firstclass tickets
        tickets.add(new Ticket(21, new FirstClassTicket(origin, destination)));
        tickets.add(new Ticket(22, new FirstClassTicket(origin, destination)));
    }
}

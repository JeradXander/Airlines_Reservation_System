package com.airline;

import com.locations.Location;
import com.locations.Timezone;
import com.tickets.*;

import java.util.ArrayList;
import java.util.List;

public class Flights {

    //fields
    private int flightId;
    private List<Ticket> tickets = new ArrayList<>();
    private Location origin;
    private Location destination;


    public Flights(int flightIdArg,Location originArg, Location destinationArg) {
        flightId = flightIdArg;
        origin = originArg;
        destination = destinationArg;
        initialTicketList();
    }

    public List<Ticket> getTickets() {

        //returning list
        return tickets;
    }

    public void ticketBought(Ticket ticketBoughtArgs) {
        tickets.remove(ticketBoughtArgs);
    }

    public int getFlightId() {
        return flightId;
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

    @Override
    public String toString() {
        return String.valueOf(flightId);
    }

    private void initialTicketList(){
        tickets.add(new Ticket(10, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(11, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(12, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(13, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(14, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(15, new EconomyTicket(origin, destination)));
        tickets.add(new Ticket(16, new EconomyTicket(origin, destination)));

        tickets.add(new Ticket(17, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(18, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(19, new BusinessTicket(origin, destination)));
        tickets.add(new Ticket(20, new BusinessTicket(origin, destination)));

        tickets.add(new Ticket(21, new FirstClassTicket(origin, destination)));
        tickets.add(new Ticket(22, new FirstClassTicket(origin, destination)));
    }
}

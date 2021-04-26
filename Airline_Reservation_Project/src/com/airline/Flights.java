package com.airline;

import com.locations.Location;
import com.locations.Timezone;
import com.tickets.*;

import java.util.ArrayList;
import java.util.List;

public class Flights {

    //fields
   List<Ticket> tickets = new ArrayList<>();


   public Flights(){

   }

    public List<Ticket> getTickets() {

       //instantiating lists

        tickets.add(new Ticket(10,new EconomyTicket(new Location("Seattle", Timezone.PST), new Location("San francisco", Timezone.PST))));
        tickets.add(new Ticket(10,new BusinessTicket(new Location("Seattle", Timezone.PST), new Location("San francisco", Timezone.PST))));
        tickets.add(new Ticket(10,new FirstClassTicket(new Location("Seattle", Timezone.PST), new Location("San francisco", Timezone.PST))));

        return tickets;
    }

    public void ticketBought(Ticket ticketBoughtArgs){
        tickets.remove(ticketBoughtArgs);
    }

}

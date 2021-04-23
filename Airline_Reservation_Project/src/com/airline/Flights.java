package com.airline;

import com.tickets.BusinessTicket;
import com.tickets.Ticket;
import com.tickets.TicketsCalculator;
import java.util.ArrayList;
import java.util.List;

public class Flights {

    //fields
   List<Ticket> tickets = new ArrayList<>();

   public Flights(){

   }

    public List<Ticket> getTickets() {

       //instantiating lists
        tickets.add(new Ticket(10,new BusinessTicket()));

        return tickets;
    }

    public void ticketBought(Ticket ticketBoughtArgs){
        tickets.remove(ticketBoughtArgs);
    }

}

package com.shoppingcart;

import com.airline.Airline;
import com.airline.Flights;
import com.tickets.Ticket;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int passengerId;
    private String passengerName;
    private String date;
    private Flights currentFlights;
    private double totalPrice;
    private String customerGuideline ;
    Airline airline;
    private String breakLine = "______________________________________________";
    DecimalFormat decim = new DecimalFormat("0.00");


    List<Ticket> ticketList =  new ArrayList<>();


    public ShoppingCart(Airline airlineArgs, String dateArgs, Flights currentFlightsArgs, List<Ticket>ticketListArgs){
        airline =airlineArgs;
        this.date = dateArgs;
        this.currentFlights = currentFlightsArgs;
        this.ticketList = ticketListArgs;
        buildGuidline();
        processCart();
    }

    private void buildGuidline(){

        customerGuideline = "Flying from: " + ticketList.get(0).getOrig() + " -> " + ticketList.get(0).getDest()
        + "\nAirline: " + airline.getAirLineName() + "\nDate selected: " + date
        + "\nFlight selected: " + currentFlights.getFlightId();
    }

    public void processCart() {

        System.out.println( "\nShopping Cart contains the following:\n"+breakLine +"\n\n"+ customerGuideline+ "\n");


        for (Ticket ticket : ticketList) {
            totalPrice += ticket.ticketPrice();
            System.out.println(ticket.toString() + "\nTicket Price: $" + String.format("%.2f", ticket.ticketPrice()) + "\n");
        }
        System.out.println(breakLine + "\nItems Total: $" + String.format("%.2f", totalPrice));
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Tax= $" + totalPrice;
    }

//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 29 * hash + Objects.hashCode(this.passengerId);
//        hash = 29 * hash + Objects.hashCode(this.passengerName);
//        hash = 29 * hash + Objects.hashCode(this.date);
//        hash = 29 * hash + Objects.hashCode(this.currentFlights);
//        return hash;
//
//        @Override
//        public boolean equals(Object ticketList) {
//            if (this == ticketList) {
//                return true;
//            }
//            if (obj == null) {
//                return false;
//            }
//            if (getClass() != obj.getClass()) {
//                return false;
//            }
//            final Product other = (Product) obj;
//            if (!Objects.equals(this.passengerName, other.passengerName)) {
//                return false;
//            }
//            if (!Objects.equals(this.passengerId, other.passengerId)) {
//                return false;
//            }
//            if (!Objects.equals(this.date, other.date)) {
//                return false;
//            }
//            if (!Objects.equals(this.currentFlights, other.currentFlights)) {
//                return false;
//            }
//            return true;
//        }
//


}
package com.shoppingcart;

import com.airline.Airline;
import com.airline.Flights;
import com.tickets.Ticket;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    //stretch goal fields
    private int passengerId;
    private String passengerName;

    //current fields
    private String date;
    private String customerGuideline;
    private String breakLine = "______________________________________________";
    private double totalPrice;
    private Flights currentFlights;
    private Airline airline;
    List<Ticket> ticketList;
    private DecimalFormat decim = new DecimalFormat("0.00");

    //constructor
    public ShoppingCart(Airline airlineArgs, String dateArgs, Flights currentFlightsArgs, List<Ticket> ticketListArgs) {
        airline = airlineArgs;
        this.date = dateArgs;
        this.currentFlights = currentFlightsArgs;
        this.ticketList = ticketListArgs;
        buildGuidline();
        processCart();
    }

    //getter
    public double getTotalPrice() {
        return totalPrice;
    }

    //method to build output string
    private void buildGuidline() {
        //creating variable
        customerGuideline = "Flying from: " + ticketList.get(0).getOrig() + " -> " + ticketList.get(0).getDest()
                            + "\nAirline: " + airline.getAirLineName() + "\nDate selected: " + date
                            + "\n" + currentFlights.toString();
    }

    ///method to process and output tickets and cart
    public void processCart() {

        //top output
        System.out.println("\nShopping Cart contains the following:\n" + breakLine + "\n\n" + customerGuideline + "\n");

        //loop through each customer ticket
        for (Ticket ticket : ticketList) {
            //adding ticket price to total
            totalPrice += ticket.ticketPrice();
            //output on receipt
            System.out.println(
                    ticket.toString() + "\nTicket Price: $" + String.format("%.2f", ticket.ticketPrice()) + "\n");
        }
        //final receipt output
        System.out.println(breakLine + "\nItems Total: $" + String.format("%.2f", totalPrice));
    }

    @Override
    public String toString() {
        return "Tax= $" + totalPrice;
    }

}
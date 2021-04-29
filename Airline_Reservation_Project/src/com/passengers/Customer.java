package com.passengers;

import com.airline.Airline;
import com.airline.Flight;
import com.shoppingcart.ShoppingCart;
import com.tickets.Ticket;

import java.util.List;

public class Customer {

    //stretch goal fields
    private String customerName = "Billy Bob";
    private int customerId = 1;

    //fields
    private ShoppingCart customerShoppingCart;
    private List<Ticket> ticketList;
    private String date;
    private Flight flight;
    private Airline airline;

    //constructor
    public Customer(String dateArgs, Flight flightSelectedArgs, Airline airlineSelectedArgs, List<Ticket> ticketList) {
        date = dateArgs;
        flight = flightSelectedArgs;
        airline = airlineSelectedArgs;
        this.ticketList = ticketList;
        setUpShoppingCart();
    }

    //set up shopping cart
    private void setUpShoppingCart() {
        customerShoppingCart = new ShoppingCart(airline, date, flight, ticketList);
    }

    //getting to string from chopping cart
    public void shoppingCartOutput() {
        customerShoppingCart.toString();
    }

}

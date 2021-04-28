package com.passengers;

import com.airline.Airline;
import com.airline.Flights;
import com.shoppingcart.ShoppingCart;
import com.tickets.Ticket;

import java.util.List;

public class Customer {
    private String customerName = "Billy Bob";
    private int customerId = 1;
    private ShoppingCart customerShoppingCart;
    private List<Ticket> ticketList;
    private String date;
    private Flights flight;
    private Airline airline;


    public Customer(String dateArgs, Flights flightSelectedArgs, Airline airlineSelectedArgs, List<Ticket> ticketList) {
        date = dateArgs;
        flight = flightSelectedArgs;
        airline = airlineSelectedArgs;
        this.ticketList = ticketList;
        setUpShoppingCart();
    }

    private void setUpShoppingCart(){
        customerShoppingCart = new ShoppingCart(airline,date,flight,ticketList);
    }

    public void shoppingCartOutput(){
        customerShoppingCart.toString();
    }

}

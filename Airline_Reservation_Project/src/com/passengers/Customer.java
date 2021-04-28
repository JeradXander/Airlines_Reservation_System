package com.passengers;

import com.shoppingcart.ShoppingCart;
import com.tickets.Ticket;

import java.util.List;

public class Customer {
    private String customerName;
    private int customerId;
    private ShoppingCart customerShoppingCart;
    private List<Ticket> ticketList;

    public Customer(){

    }

    public Customer(String customerName, int customerId, List<Ticket> ticketList) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.ticketList = ticketList;
    }

    private void setUpShoppingCart(){
        customerShoppingCart = new ShoppingCart();
    }

}

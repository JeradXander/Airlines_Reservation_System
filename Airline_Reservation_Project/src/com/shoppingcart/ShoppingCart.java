package com.shoppingcart;

import com.airline.Flights;
import com.tickets.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private int passengerId;
    private String passengerName;
    private String date;
    private Flights currentFlights;

    List<Ticket> ticketList =  new ArrayList<>();



    public ShoppingCart(){

    }

    public ShoppingCart(String dateArgs, Flights currentFlightsArgs, List<Ticket>ticketListArgs){
        this.date = dateArgs;
        this.currentFlights = currentFlightsArgs;
        this.ticketList = ticketListArgs;
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
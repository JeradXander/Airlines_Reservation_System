package com.client;

import com.airline.Airline;
import java.util.ArrayList;
import java.util.List;

public class AirlineClient {

    List<Airline> listOfAirlines = new ArrayList<>();

    public static void main(String[] args) {

        List<Airline> listOfAirlines = new ArrayList<>();

        listOfAirlines.add(new Airline("TLG Airlines"));
        listOfAirlines.add(new Airline("Amazon Airlines"));
        listOfAirlines.add(new Airline("Apprenti Airlines"));

        System.out.println("Welcome to ReplyBack Airline Reservation System, Which airline would you like to fly with?");
        for(int count = 0; count < listOfAirlines.size();count++){
            System.out.println((count+ 1) + ". " + listOfAirlines.get(count).getAirLineName());
        }
        System.out.println("Which airline would you like to fly with?");

//        //this is if
//        System.out.println("Which airline would you like to fly with?");
//
//        for(Airline airline:listOfAirlines){
//            System.out.println();
//        }



//        System.out.println(greatness + level);
    }
}

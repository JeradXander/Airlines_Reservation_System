package com.client;

import com.airline.Airline;
import com.locations.Location;
import com.locations.Timezone;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

public class AirlineClient {

    private static List<Location> listOfLocations = new ArrayList<>();
    private static List<Airline> listOfAirlines = new ArrayList<>();

    public static void main(String[] args) {

        listOfAirlines.add(new Airline("TLG Airlines"));
        listOfAirlines.add(new Airline("Amazon Airlines"));
        listOfAirlines.add(new Airline("Apprenti Airlines"));

        //gets full list of locations
        getFullListOfLocations();

        System.out.println("Welcome to ReplyBack Airline Reservation System, Which airline would you like to fly with?");
        for(int i = 0; i < listOfAirlines.size();i++){
            System.out.println((i+ 1) + ". " + listOfAirlines.get(i).getAirLineName());
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

    private static void getFullListOfLocations(){
        //add all because intelliJ is smart
         Location[] locationsWithTimezone = {
                new Location("San Francisco", Timezone.PST),
                new Location("LA", Timezone.PST),
                new Location("Seattle", Timezone.PST),
                new Location("Denver", Timezone.CST),
                new Location("Dallas", Timezone.CST),
                new Location("OKC", Timezone.CST),
                new Location("NYC", Timezone.EST),
                new Location("Miami", Timezone.EST),
                new Location("Philadelphia", Timezone.EST)
        };
        listOfLocations.addAll(Arrays.asList(locationsWithTimezone));
    }


}

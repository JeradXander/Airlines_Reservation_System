package com.client;

import com.airline.Airline;
import com.airline.Flights;
import com.locations.Location;
import com.locations.Timezone;
import com.tickets.Ticket;

import java.sql.Time;
import java.util.*;

public class AirlineClient {


    private static List<Location> listOfLocations = new ArrayList<>();
    private static List<Airline> listOfAirlines = new ArrayList<>();
    private static int valueReturnedFromInputMethod;
    private static Location origin;
    private static Location destination;
    private static Airline airlineSelected;
    private static List<Ticket> customerTicketList = new ArrayList<>();
    private static boolean flightHasTickets = false;

    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //get full list of Airlines
        getFullListOfAirlines();

        //gets full list of locations
        getFullListOfLocations();

        //returning value for origin
        valueReturnedFromInputMethod = getValidUserInput("Type in the number associated with which location would you like to fly from?",listOfLocations);
        //setting origin to value
        origin = listOfLocations.get(valueReturnedFromInputMethod-1);
        //removing origin from available list
        listOfLocations.remove(valueReturnedFromInputMethod-1);

        //getting value for destination
        valueReturnedFromInputMethod  = getValidUserInput("Type in the number associated with which location would you like to fly to?",listOfLocations);
        //setting destination to value
        destination = listOfLocations.get(valueReturnedFromInputMethod-1);


        //getting value for Airline
        valueReturnedFromInputMethod = getValidUserInput("Welcome to ReplyBack Airline Reservation System, Which airline would you like to fly with?",listOfAirlines);
        //setting user inout to airline selected
        airlineSelected = listOfAirlines.get(valueReturnedFromInputMethod -1);
        //adding origin and destination to airline to populate the correct flights
        airlineSelected.setDestination(destination);
        airlineSelected.setOrigin(origin);

        //creating list to hold key values
        List<String> dates = new ArrayList<>(airlineSelected.getAirlineFlights().keySet());
        //sorting dates
        Collections.sort(dates);
        //getting user selection from list of dates
        int dateSelected = 0;
        dateSelected = getValidUserInput("What day would you like to fly on?",dates);

        while (!flightHasTickets) {
            //getting list of flights from date selected
            valueReturnedFromInputMethod = getValidUserInput("What flight would you like?", airlineSelected.getAirlineFlights().get(dates.get(dateSelected - 1)));

            Flights flightSelected = airlineSelected.getAirlineFlights().get(dates.get(dateSelected - 1)).get(valueReturnedFromInputMethod - 1);

            if (flightSelected.getTickets().size() == 0) {
                System.out.println("No flights available on flight " + flightSelected.getFlightId() + ". Please select another flight");
                flightHasTickets = false;
            }else{
                flightHasTickets = true;
            }
        }
        //test output
        System.out.println("You're looking at flying from " + origin + " to " + destination + " with " + airlineSelected + " on " + dates.get(valueReturnedFromInputMethod - 1) + (".") + " on flight " +
                           airlineSelected.getAirlineFlights().get(dates.get(dateSelected -1)).get(valueReturnedFromInputMethod-1));

    }


    private static int getValidUserInput(String outToUserArg,List<?> listToiteratThroughArg){
        //initial output
        System.out.println("\n" + outToUserArg);
        //method variables
        boolean isValidNumber = false;
        int userInputInt = 0;

        //loop while userInput is not a valid selection

        while (!isValidNumber){
            for(int i = 0; i < listToiteratThroughArg.size();i++){
                System.out.println((i+ 1) + ". " + listToiteratThroughArg.get(i).toString());
            }

            String userIn = inputScanner.nextLine();

            try{
                //user
                userInputInt = Integer.parseInt(userIn);

                if(userInputInt > 0 && userInputInt <= listToiteratThroughArg.size()){
                    //is valid so returning and exiting method
                    return userInputInt;
                }else {
                    System.out.println("You must select a number from the list");
                }
            }catch (NumberFormatException e){
                //not valid so return output to user and setting valid to false to continue while loop
                System.out.println("You must select a number from the list");
                isValidNumber = false;
            }
        }
        return 0;
    }


    private static void getFullListOfAirlines(){
        Airline[] airlinesToChooseFrom = {
                new Airline("TLG Airlines"),
                new Airline("Amazon Airlines"),
                new Airline("Apprenti Airlines"),
                new Airline("Doge Airlines Airlines"),
                new Airline("Kuma Airlines"),
                new Airline("Mark Airlines"),
                new Airline("Jerad Airlines"),
                new Airline("DuckChampion Airlines"),
                new Airline("Java Airlines"),
                new Airline("Wheat Thins Airlines")
        };
        listOfAirlines.addAll(Arrays.asList(airlinesToChooseFrom));
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

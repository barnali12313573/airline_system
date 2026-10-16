package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirlinesServer {
    private static AirlinesServer instance;
    private List<Flight> flightList = new ArrayList<>();
    private Map<Integer, Reservation> booking = new HashMap<>();

    private AirlinesServer() {

    }

    public static AirlinesServer getInstance() {
        if (instance == null) {
            instance = new AirlinesServer();
        }
        return instance;
    }

    public void addFlight(Flight flight) {
        flightList.add(flight);
    }

    public Flight findFlight(int flightNumber) {
        for (Flight i : flightList) {
            if (i.getFlightNumber() == flightNumber) {
                return i;
            }
        }
        return null;
    }

    public void creteReservation(int flightNumber, String name, int reservationId) {
        Flight flight = findFlight(flightNumber);
        if (flight != null && flight.checkAvailability()) {
            flight.reserveSeat();
            Reservation reservation = new Reservation(reservationId, name, flight);
            booking.put(reservationId, reservation);
            System.out.println("Reservation Successful");

        } else {
            System.out.println("Flight Full");
        }
    }

    public void cancelReservation(int reservationId) {
        Reservation reservation =
                booking.get(reservationId);
        Flight flight = null;
        flight.cancelReservation(reservationId);
        booking.remove(reservationId);

    }
    public void displayFlights(){

        for(Flight flight : flightList){

            System.out.println(flight);

        }

    }
    public void makePayment(int reservationId, double amount) {

        if(booking.containsKey(reservationId)){

            System.out.println("Payment of ₹" + amount + " Successful");
            System.out.println("Reservation Confirmed");

        }
        else{

            System.out.println("Reservation Not Found");

        }

    }
}



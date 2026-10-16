package org.example;

import org.example.Flight;

public class Reservation {

    private int reservationId;
    private String passengerName;
    private Flight flight;

    public Reservation(int reservationId,
                       String passengerName,
                       Flight flight) {

        this.reservationId = reservationId;
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public int getReservationId() {
        return reservationId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public Flight getFlight() {
        return flight;
    }
}
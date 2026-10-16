package org.example;

abstract public class Flight implements Reserveable{
    private int flightNumber;
    protected Aircraft aircraft;
    protected FlightSchedule flightSchedule;
    protected int seatsAvailable;

    public Flight(int flightNumber, Aircraft aircraft, FlightSchedule flightSchedule, int seatAvailable) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.flightSchedule = flightSchedule;
        this.seatsAvailable = seatAvailable;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public boolean reserveSeat(){
        if (seatsAvailable > 0) {

            seatsAvailable--;

            return true;
        }

        return false;
    }
    public boolean checkAvailability(){
        if(seatsAvailable>0){

            return true;

        }

        return false;

    }
    public abstract double calculateDynamicPrice();


}

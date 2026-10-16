package org.example;

import java.util.List;

public class InternationalFlight extends Flight{
    private double basePrice;
    private List<String> requiredVisas;

    public InternationalFlight(int flightNumber, Aircraft aircraft, FlightSchedule flightSchedule, int seatAvailable, double basePrice, List<String> requiredVisas) {
        super(flightNumber, aircraft, flightSchedule, seatAvailable);
        this.basePrice = basePrice;
        this.requiredVisas = requiredVisas;
    }

    @Override
    public double calculateDynamicPrice() {
       double internationalTax=5000;
       return basePrice+internationalTax;
    }

    @Override
    public void createReservation(String name, int reservationid) {
          if(seatsAvailable>0){
              System.out.println("International Ticket Booked Successfully");
              seatsAvailable--;
          }else{
              System.out.println("No Seats Available");
          }
    }

    @Override
    public void cancelReservation(int reservationid) {
        seatsAvailable++;

        System.out.println("Reservation Cancelled");
    }
    public List<String> getRequiredVisas() {
        return requiredVisas;
    }
}

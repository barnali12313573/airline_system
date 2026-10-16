package org.example;

public class DomesticFlight extends Flight{
    public double price;

    public DomesticFlight(int flightNumber, Aircraft aircraft, FlightSchedule flightSchedule, int seat, double price) {
        super(flightNumber, aircraft, flightSchedule, seat);
        this.price = price;
    }

    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public double calculateDynamicPrice(){
        return this.price;
    }

    @Override
    public void createReservation(String name, int id) {
        if(seatsAvailable>0){
            System.out.println("Reservation Successful");
            seatsAvailable--;

        }else {


            System.out.println("Flight Full");

        }
    }

    @Override
    public void cancelReservation(int reservationid) {
         seatsAvailable++;
    }
}

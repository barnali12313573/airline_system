package org.example;

public interface Reserveable {
    void createReservation(String name, int reservationid);
    void cancelReservation(int reservationid);
}

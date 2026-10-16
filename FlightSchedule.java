package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightSchedule {
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public FlightSchedule(LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
}

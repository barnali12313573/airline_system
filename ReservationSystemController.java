package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ReservationSystemController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AirlinesServer server = AirlinesServer.getInstance();

        // Create some flights initially

        Aircraft a1 = new Aircraft("Boeing 737", 180);

        FlightSchedule s1 = new FlightSchedule(
                LocalDateTime.of(2026,7,25,10,0),
                LocalDateTime.of(2026, 7,25,12,30)
        );

        Flight f1 = new DomesticFlight(101, a1, s1, 180, 5000);

        server.addFlight(f1);

        while (true) {


            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    server.displayFlights();
                    break;

                case 2:

                    System.out.print("Flight Number : ");
                    int flightNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Passenger Name : ");
                    String name = sc.nextLine();

                    System.out.print("Reservation ID : ");
                    int reservationId = sc.nextInt();

                    server.creteReservation(flightNo, name, reservationId);

                    break;

                case 3:

                    System.out.print("Reservation ID : ");
                    int cancelId = sc.nextInt();

                    server.cancelReservation(cancelId);

                    break;

                case 4:

                    System.out.print("Reservation ID : ");
                    int payId = sc.nextInt();

                    System.out.print("Amount : ");
                    double amount = sc.nextDouble();

                    server.makePayment(payId, amount);

                    break;

                case 5:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }

        }

    }

}
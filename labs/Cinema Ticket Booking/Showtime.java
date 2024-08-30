package OOPS;

import java.util.ArrayList;
import java.util.List;

public class Showtime extends Main {
 private Movie movie;
 private String startTime;
 private List<Seat> seats;

 // Constructor
 public Showtime(Movie movie, String startTime, int numSeats) {
     this.movie = movie;
     this.startTime = startTime;
     this.seats = new ArrayList<>();
     for (int i = 1; i <= numSeats; i++) {
         seats.add(new Seat(i));
     }
 }

 // Getters
 public Movie getMovie() {
     return movie;
 }

 public String getStartTime() {
     return startTime;
 }

 public List<Seat> getSeats() {
     return seats;
 }

 // Method to display available seats
 public void displayAvailableSeats() {
     System.out.println("Available seats for " + movie.getTitle() + " at " + startTime + ":");
     for (Seat seat : seats) {
         if (!seat.isBooked()) {
             System.out.print("Seat " + seat.getSeatNumber() + " ");
         }
     }
     System.out.println();
 }

 // Book seats for a showtime
 public boolean bookSeats(List<Integer> seatNumbers) {
     for (int seatNumber : seatNumbers) {
         Seat seat = seats.get(seatNumber - 1); // Assuming seatNumber starts from 1
         if (seat.isBooked()) {
             System.out.println("Seat " + seatNumber + " is already booked.");
             return false;
         }
     }
     for (int seatNumber : seatNumbers) {
         seats.get(seatNumber - 1).book();
     }
     return true;
 }

 // Cancel seat bookings
 public void cancelSeats(List<Integer> seatNumbers) {
     for (int seatNumber : seatNumbers) {
         seats.get(seatNumber - 1).cancel();
     }
 }
}


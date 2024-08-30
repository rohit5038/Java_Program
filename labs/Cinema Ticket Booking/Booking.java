package OOPS;

import java.util.List;

public class Booking extends Main {
 private User user;
 private Showtime showtime;
 private List<Integer> seatNumbers;

 // Constructor
 public Booking(User user, Showtime showtime, List<Integer> seatNumbers) {
     this.user = user;
     this.showtime = showtime;
     this.seatNumbers = seatNumbers;
 }

 // Method to confirm the booking
 public boolean confirmBooking() {
     return showtime.bookSeats(seatNumbers);
 }

 // Method to cancel the booking
 public void cancelBooking() {
     showtime.cancelSeats(seatNumbers);
 }

 // Method to display booking details
 public void displayBooking() {
     System.out.println("Booking Details:");
     System.out.println("User: " + user.getName());
     System.out.println("Movie: " + showtime.getMovie().getTitle() + " at " + showtime.getStartTime());
     System.out.print("Seats: ");
     for (int seatNumber : seatNumbers) {
         System.out.print(seatNumber + " ");
     }
     System.out.println();
 }
}

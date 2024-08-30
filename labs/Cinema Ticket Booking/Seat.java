package OOPS;

public class Seat extends Main {
 private int seatNumber;
 private boolean isBooked;

 // Constructor
 public Seat(int seatNumber) {
     this.seatNumber = seatNumber;
     this.isBooked = false; // Initially, the seat is available
 }

 // Getters
 public int getSeatNumber() {
     return seatNumber;
 }

 public boolean isBooked() {
     return isBooked;
 }

 // Method to book the seat
 public void book() {
     if (!isBooked) {
         isBooked = true;
         System.out.println("Seat " + seatNumber + " booked successfully.");
     } else {
         System.out.println("Seat " + seatNumber + " is already booked.");
     }
 }

 // Method to cancel the booking
 public void cancel() {
     if (isBooked) {
         isBooked = false;
         System.out.println("Seat " + seatNumber + " booking canceled.");
     } else {
         System.out.println("Seat " + seatNumber + " is not booked.");
     }
 }
}

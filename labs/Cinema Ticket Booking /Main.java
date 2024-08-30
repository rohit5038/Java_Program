package OOPS;

// You need to design a ticket booking system for a cinema that manages movies, showtimes, seats, and bookings. The system should allow users to:
// Browse movies and showtimes.
// Book seats for a particular showtime.
// View and cancel bookings.
// Requirements:
// Movie: Each movie has a title, genre, and duration.
// Showtime: Each showtime has a movie, a start time, and a list of available seats.
// Seat: Each seat can be booked or available.
// Booking: Each booking is associated with a user, a showtime, and specific seats.
// OOP Concepts to Use:
// Classes and Objects: Create classes for Movie, Showtime, Seat, and Booking.
// Encapsulation: Use private fields and public methods.
// Inheritance: Create a base class for common functionality if applicable (e.g., a base class for different types of seats).
// Polymorphism: Implement methods that can be overridden in subclasses if necessary.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     // Create some movies
     Movie movie1 = new Movie("Interstellar", "Sci-Fi", 180);
     Movie movie2 = new Movie("The Godfather", "Crime", 175);

     // Create some showtimes
     Showtime showtime1 = new Showtime(movie1, "10:00 AM", 5);
     Showtime showtime2 = new Showtime(movie2, "12:00 PM", 5);

     // Create a user
     User user = new User("Rohit", 1);

     // Input handling
     Scanner scanner = new Scanner(System.in);
     System.out.println("Welcome to the Cinema Ticket Booking System!");

     while (true) {
         System.out.println("\n1. Browse Movies and Showtimes\n2. Book Seats\n3. View and Cancel Bookings\n4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         if (choice == 1) {
             // Browse movies and showtimes
             System.out.println("\nMovies and Showtimes:");
             System.out.println("1. " + movie1 + " at " + showtime1.getStartTime());
             System.out.println("2. " + movie2 + " at " + showtime2.getStartTime());

         } else if (choice == 2) {
             // Book seats
             System.out.print("\nEnter the showtime (1 or 2): ");
             int showtimeChoice = scanner.nextInt();
             Showtime selectedShowtime = (showtimeChoice == 1) ? showtime1 : showtime2;

             selectedShowtime.displayAvailableSeats();
             System.out.print("Enter seat numbers to book (comma separated): ");
             scanner.nextLine(); // Consume newline
             String seatNumbersInput = scanner.nextLine();
             String[] seatNumbersArray = seatNumbersInput.split(",");
             List<Integer> seatNumbers = new ArrayList<>();
             for (String seat : seatNumbersArray) {
                 seatNumbers.add(Integer.parseInt(seat.trim()));
             }

             Booking booking = new Booking(user, selectedShowtime, seatNumbers);
             if (booking.confirmBooking()) {
                 System.out.println("Booking confirmed!");
                 booking.displayBooking();
             }

         } else if (choice == 3) {
             // View and cancel bookings (assuming one booking for simplicity)
             System.out.print("\nEnter your booking to cancel: ");
             System.out.print("Enter seat numbers to cancel (comma separated): ");
             scanner.nextLine(); // Consume newline
             String seatNumbersInput = scanner.nextLine();
             String[] seatNumbersArray = seatNumbersInput.split(",");
             List<Integer> seatNumbers = new ArrayList<>();
             for (String seat : seatNumbersArray) {
                 seatNumbers.add(Integer.parseInt(seat.trim()));
             }

             Booking booking = new Booking(user, showtime1, seatNumbers); // Assuming showtime1 for simplicity
             booking.cancelBooking();
             System.out.println("Booking canceled.");

         } else if (choice == 4) {
             // Exit
             break;
         } else {
             System.out.println("Invalid choice.");
         }
     }

     scanner.close();
 }
}

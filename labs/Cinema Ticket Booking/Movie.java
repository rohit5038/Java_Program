package OOPS;

public class Movie extends Main {
 private String title;
 private String genre;
 private int duration; // Duration in minutes

 // Constructor
 public Movie(String title, String genre, int duration) {
     this.title = title;
     this.genre = genre;
     this.duration = duration;
 }

 // Getters
 public String getTitle() {
     return title;
 }

 public String getGenre() {
     return genre;
 }

 public int getDuration() {
     return duration;
 }

 // Override toString method for easier printing of movie details
 @Override
 public String toString() {
     return "Title: " + title + ", Genre: " + genre + ", Duration: " + duration + " mins";
 }
}

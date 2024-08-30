package abc;

import java.util.ArrayList;
import java.util.List;

public class User extends Main {
 private String name;
 private int userId;
 private List<Book> borrowedBooks;

 // Constructor
 public User(String name, int userId) {
     this.name = name;
     this.userId = userId;
     this.borrowedBooks = new ArrayList<>();
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getUserId() {
     return userId;
 }

 public List<Book> getBorrowedBooks() {
     return borrowedBooks;
 }

 // Borrow a book
 public void borrowBook(Book book) {
     if (book.isAvailable()) {
         borrowedBooks.add(book);
         book.setAvailability(false);
         System.out.println(name + " borrowed " + book.getTitle());
     } else {
         System.out.println(book.getTitle() + " is not available.");
     }
 }

 // Return a book
 public void returnBook(Book book) {
     if (borrowedBooks.remove(book)) {
         book.setAvailability(true);
         System.out.println(name + " returned " + book.getTitle());
     } else {
         System.out.println(name + " did not borrow " + book.getTitle());
     }
 }
}


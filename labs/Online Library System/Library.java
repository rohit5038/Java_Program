package abc;

import java.util.ArrayList;
import java.util.List;

public class Library extends Main {
 private List<Book> books;
 private List<User> users;

 // Constructor
 public Library() {
     this.books = new ArrayList<>();
     this.users = new ArrayList<>();
 }

 // Add a book to the library
 public void addBook(Book book) {
     books.add(book);
     System.out.println(book.getTitle() + " added to the library.");
 }

 // Add a user to the library
 public void addUser(User user) {
     users.add(user);
     System.out.println("User " + user.getName() + " added to the library.");
 }

 // Find a book by title
 public Book findBookByTitle(String title) {
     for (Book book : books) {
         if (book.getTitle().equalsIgnoreCase(title)) {
             return book;
         }
     }
     return null;
 }

 // Find a user by name
 public User findUserByName(String name) {
     for (User user : users) {
         if (user.getName().equalsIgnoreCase(name)) {
             return user;
         }
     }
     return null;
 }

 // Borrow a book
 public void borrowBook(String userName, String bookTitle) {
     User user = findUserByName(userName);
     Book book = findBookByTitle(bookTitle);

     if (user != null && book != null) {
         user.borrowBook(book);
     } else {
         System.out.println("User or Book not found.");
     }
 }

 // Return a book
 public void returnBook(String userName, String bookTitle) {
     User user = findUserByName(userName);
     Book book = findBookByTitle(bookTitle);

     if (user != null && book != null) {
         user.returnBook(book);
     } else {
         System.out.println("User or Book not found.");
     }
 }

 // Display all books in the library
 public void displayBooks() {
     System.out.println("Books in Library:");
     for (Book book : books) {
         System.out.println(book);
     }
 }

 // Display all users in the library
 public void displayUsers() {
     System.out.println("Users in Library:");
     for (User user : users) {
         System.out.println("Name: " + user.getName() + ", User ID: " + user.getUserId());
     }
 }
}

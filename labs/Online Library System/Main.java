package abc;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Library library = new Library();

     // Add some books to the library
     library.addBook(new Book("Naruto", "Kishimoto", "123456789"));
     library.addBook(new Book("One Piece", "Eiichiro Oda", "741288963"));
     library.addBook(new Book("Bleach","Tite Kubo","852014796"));
     // Add some users to the library
     library.addUser(new User("Rohit", 1));
     library.addUser(new User("Subodh", 2));
     library.addUser(new User("Ashok", 3));

     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("Enter 1 to borrow a book, 2 to return a book, 3 to display books, 4 to display users, 5 to exit:");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         if (choice == 1) {
             System.out.println("Enter your name:");
             String userName = scanner.nextLine();
             System.out.println("Enter the title of the book you want to borrow:");
             String bookTitle = scanner.nextLine();
             library.borrowBook(userName, bookTitle);
         } else if (choice == 2) {
             System.out.println("Enter your name:");
             String userName = scanner.nextLine();
             System.out.println("Enter the title of the book you want to return:");
             String bookTitle = scanner.nextLine();
             library.returnBook(userName, bookTitle);
         } else if (choice == 3) {
             library.displayBooks();
         } else if (choice == 4) {
             library.displayUsers();
         } else if (choice == 5) {
             break;
         } else {
             System.out.println("Invalid choice.");
         }
     }

     scanner.close();
 }
}

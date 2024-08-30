package OOPS;

public class User extends Main {
 private String name;
 private int userId;

 // Constructor
 public User(String name, int userId) {
     this.name = name;
     this.userId = userId;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getUserId() {
     return userId;
 }
}


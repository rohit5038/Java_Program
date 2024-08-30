import java.util.Scanner;

//Write a program to check if a given string or number is a palindrome.
public class Palindrome {
    public static void main(String[] args){
        int n, rem, rev=0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp=n;
        while (n>0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }

    }
}

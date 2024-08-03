//Write a program to check whether a given number is a prime number.
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int a, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number to Check it is Prime or not: ");
        a = sc.nextInt();
        if(a==1){
            System.out.println("Not a Prime Number");
            return; // It will early exit the case if it is True
        }
        for(i=2; i<=a/2; i++){
            if(a%i==0){ // % is to check the remainder is 0 or not
                System.out.println("Not a Prime Number");
                return; // It will early exit the case if it is True
            }
        }
        System.out.println("Yes it is a Prime Number");
    }
}

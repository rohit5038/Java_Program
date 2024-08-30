package LAB;

//Write a program to find the sum of all even and odd numbers in a given range.

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int n = sc.nextInt();
        int oddSum = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
            oddSum += i;
        }
        int evenSum = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of first " + n + " Odd Numbers is: " + oddSum);
        System.out.println("Sum of first " + n + " Even Numbers is: " + evenSum);
    }
}

//Write a program to print Sum of Digits

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10;        //finds the last digit of the given number
            sum = sum + digit;          //adds last digit to the variable sum
            number = number / 10;       //removes the last digit from the number
        }
        System.out.println("Sum of Digits: "+sum);
    }
}

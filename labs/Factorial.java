// Write a program to calculate the factorial of a given number.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int i, n, fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=i*fact;
        }
        System.out.println(fact);

    }

}

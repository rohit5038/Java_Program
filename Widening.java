import java.util.Scanner;

public class Widening {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        // Read User input using nextInt() and store in number
        short number = sc.nextShort();
        System.out.println("Short Datatype: "+number);
        long num1 = number; //widening
        System.out.println("Long Datatype: "+num1);

        System.out.println("Enter a value: ");
        // Read User input using nextInt() and store in number1
        double number1 = sc.nextDouble();
        System.out.println("Double Datatype: "+number1);
        int num2 = (int)number1; //narrowing
        System.out.println("int Datatype: "+num2);

    }
}

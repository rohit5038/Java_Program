import java.util.Scanner;

public class OperatingEg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        // Read User input using nextInt() and store in Number
        int number = sc.nextInt();
        System.out.println("Enter a value: ");
        // Read User input using nextInt() and store in Number
        int number1 = sc.nextInt();

        System.out.println(number+number1);//arithmatic
        System.out.println(number>number1);//relational
        String s = (number>=number1) ?"great":"less";//ternary
        System.out.println(s);
        System.out.println(number++);//increment
        System.out.println(--number);//decrement
        System.out.println(number);
        System.out.println(number>number1 && number>number1);//logical
        System.out.println(number+=number1);//assignment


    }
}

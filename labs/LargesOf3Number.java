//Find the Largest Number Write a program to find the largest of three numbers.
import java.util.Scanner;

public class LargesOf3Number {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        a=sc.nextInt();
        System.out.println("Enter value for b: ");
        b=sc.nextInt();
        System.out.println("Enter value for c: ");
        c=sc.nextInt();
        
        if(a>=b && a>=c)
        {
            System.out.println(a + " is Largest Number");
        }
        else if (b>=a && b>=c)
        {
            System.out.println(b + " is Largest Number");
        }
        else
        {
            System.out.println(c + " is Largest Number");
        }

    }
}

import java.util.Scanner;

public class ReverseNumberinWhile {
    public static void main(String[] args){
        int n, rem, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            System.out.println(rev);
        }
        System.out.println("Reverse no. is: "+rev);
    }
}

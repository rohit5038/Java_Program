import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        int n, rem, sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp=n;
        while (n>0) {
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
//            System.out.println(rev);
        }
//        System.out.println(sum);
        if(temp==sum){
            System.out.println("Yes its Armstrong");
        }
        else{
            System.out.println("No its not Armstrong");
        }
    }
}

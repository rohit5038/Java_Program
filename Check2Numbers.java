import java.util.Scanner;

public class Check2Numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. a: ");
        int a = sc.nextInt();
        System.out.println("Enter a No. b: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both Numbers are equal");
        }
        else{
            System.out.println("Both Numbers are not equal");
        }
    }
}

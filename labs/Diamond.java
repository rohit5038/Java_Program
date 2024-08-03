import java.util.Scanner;

public class Diamond {
    static void diamondprint(int n){
        int i,j;
        for( i=1;i<=n;i++){
            //inner loop to print spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to print stars
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //loop to print lower half of diamond
        for(i=n-1;i>=1;i--){
            //inner loop to print spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to print stars
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        diamondprint(n);
    }
}
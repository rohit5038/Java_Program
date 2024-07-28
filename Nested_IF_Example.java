import java.util.Scanner;

public class Nested_IF_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Present/Absent ");
        String status = sc.next();

        if (status.equalsIgnoreCase("Present"))               //true-outer if
        {      // equalsIgnoreCase is ignores case sensitive
            System.out.println("Enter Your Score from 1 to 99");
            int score = sc.nextInt();
            if (score < 99 && score >= 80)         //true-inner if
            {
                System.out.println("Pass O+");
            }
            else if (score < 80 && score >= 70)    //true-inner if
            {
                System.out.println("Pass A+");
            }
            else if (score < 70 && score >= 60)    //true-inner if
            {
                System.out.println("A");
            }
            else if (score < 60 && score >= 50)    //false-inner if
            {
                System.out.println("B");
            }
            else if (score < 50 && score >= 40)    //true-inner if
            {
                System.out.println("C");
            }
            else if (score < 30 && score >= 1)     //false-inner if
            {
                System.out.println("Fail");
            } else
            {
                System.out.println("Invalid Score");
            }
        }
        else
        {                                          //false-outer if
            System.out.println("Absent");
        }

    }
}

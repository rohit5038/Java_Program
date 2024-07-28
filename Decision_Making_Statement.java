//Decision Making Statement

//if(condition){
//    code
//        }



import java.util.Objects;
import java.util.Scanner;

public class Decision_Making_Statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Know Programming or not yes/no: ");
        String check = sc.next();

        if(check.equalsIgnoreCase("yes")){      // equalsIgnoreCase is ignores case sensitive
            System.out.println("Waah bete");
        }
        else{
            System.out.println("Bhak bete");
        }

        if(check.equals("yes")){        // equals is case sensitive
            System.out.println("Waah bete");
        }
        else{
            System.out.println("Bhak bete");
        }
    }

}

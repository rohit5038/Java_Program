import java.util.Scanner;

public class Nestedif {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What Language you know development/designing/testing: ");
        String check = sc.next();

        if (check.equalsIgnoreCase("yes"))                       //true-outer if
        {      // equalsIgnoreCase is ignores case sensitive
            System.out.println("Enter You Know Development Language: ");
            String language = sc.next();
            if (language.equalsIgnoreCase("Development"))        //true-inner if
            {
                System.out.println("Knows Development");
            } else if (language.equalsIgnoreCase("designing"))    //true-inner if
            {
                System.out.println("Knows Designing");
            } else if (language.equalsIgnoreCase("testing"))       //true-inner if
            {
                System.out.println("Knows Testing");
            } else                                                            //false-inner if
            {
                System.out.println("Knows Nothing");
            }
        } else {                                                               //false-outer if
            System.out.println("Does not no Programming Language");
        }









//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a No. a: ");
//            int a = sc.nextInt();
//            System.out.println("Enter a No. b: ");
//            int b = sc.nextInt();
//            System.out.println("Enter a No. b: ");
//            int c = sc.nextInt();
//            if(a==b){
//                System.out.println("A and B are Equal");
//            } else if (a==c) {
//                System.out.println("A and C are Equal");
//            } else if (b==c) {
//                System.out.println("B and C are Equal");
//            } else{
//                System.out.println("All Numbers are different");
//            }
        }
    }

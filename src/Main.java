import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Emter a 4 digit year");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
        /* Dividing by 10 to isolate that digit, then finding the modulo of that number divided by 10 will get us the single digit. */
        int first = (year / 1000);
        int second = (year / 100 % 10);
        int third = (year / 10 % 10);
        int fourth = (year / 1 % 10);

        /* printing out the statements, adding ln at the end to print it in another line */
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
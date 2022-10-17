import java.lang.module.FindException;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;

        double userDouble = 0.0;


        System.out.println("Enter integer: ");

        int value = scnr.nextInt();

        System.out.println("Enter double: ");
        double value2 = scnr.nextDouble();

        System.out.println("Enter character: ");
        char ch = scnr.next().charAt(0);

        System.out.println("Enter string: ");
        String s = scnr.next();




        System.out.println(value + " " + value2 + " " + ch + " " + s);

        System.out.println(s + " " + ch + " " + value2 + " " + value);

        int value3 = (int)value2;

        System.out.println(value2 +" cast to an integer is "+ value3);

        return;
    }
}
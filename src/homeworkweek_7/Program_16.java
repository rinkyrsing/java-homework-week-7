package homeworkweek_7;

import java.util.Scanner;

public class Program_16 {
    static int num;

    public static void main(String[] args) {
        // Calling scanner to read the value
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will check, insert number is Positive, Negative or Zero");
        System.out.println("Enter Integer Number");
        num = scanner.nextInt();

        //calling method for checkNumber
        checkNumber();

    }

    public static void checkNumber(){

        if(num > 0)
        {
            System.out.println("Number is positive " + num);
        }else if(num < 0)
        {
            System.out.println("Number is negative " + num);
        }else
        {
            System.out.println("Number is Zero " + num);
        }
        System.out.println("Number is Zero ");
    }
}

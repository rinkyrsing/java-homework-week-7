package homeworkweek_7;

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {

        int num, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = sc.nextInt();
        sc.close();

        remainder = num % 2;
        if (remainder ==0)
            System.out.println(num + " is a Even number" );
        else
            System.out.println(num + " is a Odd number" );

    }

}

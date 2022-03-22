package homeworkweek_7;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {

        // Calling Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas choose your option");// user option input
        System.out.println("Select 1 for numbers divisible by 3");// user option input
        System.out.println("Select 2 for numbers divisible by 5");// user option input
        sc.nextInt();

        // Calling both Static method
        division(); //
        division1();
    }

    public static void division() {
        // Using for loop
        System.out.println("Number divisible by 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    // Using for loop
    public static void division1() {

        System.out.println("Number divisible by 5");

        for (int j = 1; j <= 100; j++) {
            if (j % 5 == 0) {
                System.out.print(j + ",");
            }
        }

    }

}

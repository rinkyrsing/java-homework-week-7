package homeworkweek_7;

import java.util.Scanner;

public class program_12 {

    public static void main(String[] args) {

        // Calling Scanner for user input
        Scanner sc = new Scanner(System.in);
        char ch; // variable
        System.out.println("Enter a Character: ");// User input
        ch = sc.next().charAt(0);

        // Using ternary operator
        System.out.println(ch>='a' && ch <= 'z' ? "Small case alphabet"
                :ch >= 'A' && ch <= 'Z' ? "Capital Alphabet"
                :ch >= '0' && ch <= '9' ? "Number" : "Symbol");
    }

}

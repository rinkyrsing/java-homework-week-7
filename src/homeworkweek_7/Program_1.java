package homeworkweek_7;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {

        ternaryOperator();// calling ternary operator method
    }

    public static void ternaryOperator(){
        Scanner scanner = new Scanner(System.in);// Scanner object
        System.out.println("Enter your number: ");// User input statement
        int num = scanner.nextInt();// reference variable

        String result = (num % 2 ==0) ? "Even" : "Odd" ;// ternary operator
        System.out.println("Enter number result is: " + result);// input statement and outcome
    }
}

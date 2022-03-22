package homeworkweek_7;

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        String cityname;
        // Call Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter upper case alphabet only"); // statement
        System.out.println("Enter any city name start with alphabet A to F: " );// User input
        cityname = scanner.nextLine();

        // Using switch statement
        switch (cityname) {
            case "A":
                System.out.println("Ahmedabad");//city name
                break;

            case "B":
                System.out.println("Bangalore");
                break;

            case "C":
                System.out.println("Chennai");
                break;

            case "D":
                System.out.println("Dehradun");
                break;

            case "E":
                System.out.println("Edinburgh");
                break;

            case "F":
                System.out.println("Faridabad");
                break;

            default:
                System.out.println("Enter alphabet is invalid, please try again");
        }
        }
    }
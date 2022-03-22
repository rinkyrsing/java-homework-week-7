package homeworkweek_7;

import java.util.Scanner;

public class Program_8 {

    static String city;// static variable
    public static void main(String[] args) {

        // Call Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter upper case alphabet only"); // statement
        System.out.println("Enter any city name start with alphabet A to F: " );// User input
        city = scanner.nextLine();
        cityname();
    }
    public static void cityname() {

        if (city == "A") {
            System.out.println("Ahmedabad");

        } else if (city == "B") {

            System.out.println("Bombay");

        } else if(city== "C") {
            System.out.println("Chandigarh");

        }else if(city=="D") {
            System.out.println("Daman");

        } else if(city=="E") {
            System.out.println("Etawah");

        }else if(city=="F") {
            System.out.println("Faridabad");

        }else {
           System.out.println("Invalid alphabet");
        }
    }
}

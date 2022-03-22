package homeworkweek_7;

import java.util.Scanner;

public class Program_13 {
    static int weekday = 7;

    public static void main(String[] args) {
        // Calling Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number any from 1 to 7 to print weekdays: ");//User input
        weekday = sc.nextInt();//obj
        // Calling method
        days();
    }
    public static void days(){
       switch (weekday)
       {
           case 1:
               System.out.println("Today is Monday");
               break;
           case 2:
               System.out.println("Today is Tuesday");
               break;
           case 3:
               System.out.println("Today is Wednesday");
               break;
           case 4:
               System.out.println("Today is Thursday");
               break;
           case 5:
               System.out.println("Today is Friday");
               break;
           case 6:
               System.out.println("Today is Saturday");
               break;
           case 7:
               System.out.println("Today is Sunday");
               break;
           default:
               System.out.println("Invalid week number");
       }
    }

}

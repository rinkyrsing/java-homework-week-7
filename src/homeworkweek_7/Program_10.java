package homeworkweek_7;

import java.util.Scanner;

public class Program_10 {
    // Declaring static variable
    static double input1 = 0;
    static double input2 = 0;
    static double result = 0;
    static byte choice;

    public static void main(String[] args) {
     // call scanner class for user input
        Scanner sc =new  Scanner(System.in);
        System.out.println("Pleas choose your option");// user option input
        System.out.println("Pleas enter 1 for Addition: ");//user option input
        System.out.println("Pleas enter 2 for Subtraction: ");//user option input
        System.out.println("Pleas enter 3 for Division: ");//user option input
        System.out.println("Pleas enter 4 for Multiplication: ");//user option input
        choice = sc.nextByte();//object

        System.out.println("Enter you fist value: "); //user input
        input1 = sc.nextDouble();//obj

        System.out.println("Enter you Second value: ");//user input
        input2 = sc.nextDouble();

        ifElse(); // Call static method into main method
    }

    public static void ifElse(){
        if(choice == 1){

            result = input1 + input2;
            System.out.println("The sun is: " + result);

        }else if(choice==2){

            result = input1 - input2;
            System.out.println("This is subtraction: " +result);

        }else if(choice==3){

                result = input1 / input2;
                System.out.println("This is division: " +result);

        }else if(choice == 4){

            result = input1 * input2;
            System.out.println("This is multiplication: " + result);
        }else {
            System.out.println("Sorry invalid option");
        }
    }
}

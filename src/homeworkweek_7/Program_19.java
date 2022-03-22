package homeworkweek_7;

import java.util.Scanner;

public class Program_19 {

    public static void main(String[] args) {

        //  Java program to calculate the average value of array elements.

        // Variables
        int x, sum = 0;
        float avg;

        // Calling scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want in array: ");
        x = sc.nextInt();


        int[] num = new int[x]; // declaring array
        System.out.println("Enter all value: ");
        for(int i=0; i<x; i++) // Addition of array input
        {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        System.out.println("Sum: " + sum); // total of array
        // Average of array
        avg = (float) sum /x;
        System.out.println("Average: " + avg);

    }
}

package homeworkweek_7;

import java.util.Scanner;

public class Program_7 {
    /*Write a java program input sales id, seller's name, sales amount, and salary basic
    and then fined this sales
            Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
            >= 20,000 10%
            >= 10,000 5%
             < 10,000 2%   */

    public static void main(String[] args) {
        double commission=0.0;
        int rate=0;
        int sales;

        // Calling Scanner for input
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Please enter your Sales Id: ");// sales id input
        scanner.nextLine();//obj
        System.out.println("Please enter your Seller's name: ");// seller's name input
        scanner.nextLine();//obj
        System.out.println("Please enter your Sales amount: "); // sales amount input
        scanner.nextInt();//obj
        System.out.println("Please enter your Salary basic: "); // salary basic input
        scanner.nextInt();//obj
        System.out.println("Enter your sales"); // sales input
        sales = scanner.nextInt();//obj

        //Using for loop for different commission and rate
        if(sales < 10000){
            rate = 2;
            commission = sales * 0.2;
        }
        if( sales>= 10000) {
            rate = 5;
            commission = sales * 0.5;
        }
        if(sales>=20000){
            rate = 10;
            commission = sales * 0.10;
        }
        if(sales>=30000){
            rate = 20;
            commission = sales * 0.20;
        }
        if(sales>=50000){
            rate = 25;
            commission = sales * 0.35;
        }
      //  printing commission and rate
        System.out.println("Commission amount = " + commission);
        System.out.println("Commission amount = " + rate + "%");
    }
}

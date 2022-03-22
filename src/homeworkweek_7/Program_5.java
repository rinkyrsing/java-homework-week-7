package homeworkweek_7;

import java.util.Scanner;

public class Program_5 {
    // Declaring static variable
    static String name;
    static String id;
    static double salary, hra, da, ta, pf, gross;


    public static void main(String[] args) {
        //Calling scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there! I can calculate your salary! Pleas follow instruction ");

        System.out.println("Pleas enter Employee Id: ");
        id = scanner.nextLine(); // scanner obj

        System.out.println("Enter your Employee Name: ");//User input
        name = scanner.nextLine();// scanner obj

        System.out.println("Enter your Basic Salary: ");//User input
        salary = scanner.nextInt();// scanner obj

        // System.out.println("You hra is:");
         //hra = scanner.nextDouble();

        // Printing salary slip
        System.out.println(" ____________________________________");
        System.out.println("|            Salary Slip          |");
        System.out.println("|____________________________________|");
        System.out.println("|  Employee Id         :" + id + "       |");
        System.out.println("|  Employee Name       :" + name + "          |");
        System.out.println("|____________________________________|");
        System.out.println("|  Basic Salary        :" + salary + "       |");
        hraMethod();// calling hra method
        System.out.println("|  HRA 10%             :" + hra + "      |");
        taMethod(); // calling ta method
        System.out.println("|  TA 8%               :" + ta+ "        |");
        daMethod();// calling da method
        System.out.println("|  DA 9%               :" + da +"         |");
        pfMethod(); // calling pf method
        System.out.println("|  PF 20%               :" + pf +"         |");
        System.out.println("|____________________________________|");
        gross();
        System.out.println("|  Gross Salary        :"+ gross +"        |");
        System.out.println("|=================================|");
    }

    public static void hraMethod() {

        hra = (salary * 10) / 100;
    }
    public static void taMethod(){

        ta = (salary * 8)/100;
    }
    public static void daMethod(){

        da = (salary * 9)/100;
    }
    public static void pfMethod(){

        pf = (salary * 20)/100;
    }
    public static void gross(){

        gross = salary + hra + ta + da - pf;
    }
}

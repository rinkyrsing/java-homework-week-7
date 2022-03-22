package homeworkweek_7;

import java.util.Scanner;

public class Program_4 {

    //  static Variable
    static int year;
    static int month;

    public static void main(String[] args) {
        // Scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        year = sc.nextInt();

        System.out.println("Enter month between 1 to 12");
        month = sc.nextInt();

        if(month < 1 && month > 12)
        {
            System.out.println("Enter month between 1 to 12");
        }

        // calling instance variables
        Program_4 obj =new Program_4();
        isLeapYear(year);
        obj.getDaysInMonth(month,year);

    }

    public void getDaysInMonth(int month, int year) {
       // this.month = month;

        // calculating leap year and its month
        if(month < 1 || month > 12 ) {
            System.out.println("Enter year between number 1 to 12: ");
        }else {
            int days = 0;

            switch (month) {
                case 1:
                    System.out.println("Month January");
                    System.out.println("31 days");
                    break;

                case 2:
                  //  isLeapYear(year);
                    System.out.println("Month February");
                    if ((year % 4==0)|| (year % 400 ==0) && (year % 100 != 0))//It is a Leap year
                    {
                    days = 29;
                        System.out.println("Days " + days);

                    }else // not a leap year
                    {
                        days = 28;
                        System.out.println("Month February" + days);
                    }break;
                case 3:
                    System.out.println("Month March");
                    System.out.println("Days 31");
                    break;

                case 4:
                    System.out.println("Month April");
                    System.out.println("Days 30");
                    break;

                case 5:
                    System.out.println("Month May");
                    System.out.println("Days 31");
                    break;

                case 6:
                    System.out.println("Month June");
                    System.out.println("Days 30");
                    break;

                case 7:
                    System.out.println("Month July");
                    System.out.println("Days 31");
                    break;

                case 8:
                    System.out.println("Month August");
                    System.out.println("Days 31");
                    break;

                case 9:
                    System.out.println("Month September");
                    System.out.println("Day 30");
                    break;

                case 10:
                    System.out.println("Month October");
                    System.out.println("Day 30");
                    break;

                case 11:
                    System.out.println("Month November");
                    System.out.println("Day 30");
                    break;

                case 12:
                    System.out.println("Month December");
                    System.out.println("Day 31");
                    break;

                default:
                    System.out.println("Invalid Month");

            }
        }
    }

    // Method for Leap year which return True as 0 or False as 1
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999)
        {
            //check the leap year
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println(year + " It is a leap year");
                System.out.println("     ");
               // i = 0; //return TRUE
            } else
            {
                System.out.println(year + " is not a leap year");
                System.out.println("    ");
               // i = 1; // return False
            }
            return true; // True body
        }else {
            System.out.println("not a valid year");
            return false; //false body
        }
    }
}


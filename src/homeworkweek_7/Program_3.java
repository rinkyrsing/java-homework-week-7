package homeworkweek_7;

import java.util.Scanner;

public class Program_3 {
    //define global variable
    static double percentage;
    static int math,science,english;
    static int sum, roll;
    static String result,grade;
    public static void main(String[] args) {
         String name;

        // Calling Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");//User input
        name = sc.nextLine();//obj

        System.out.println("Enter Roll No: ");
        roll = sc.nextInt();

        System.out.println("Enter you Math Marks");
        math = sc.nextInt();

        System.out.println("Enter you Science Marks");
        science = sc.nextInt();

        System.out.println("Enter you English Marks");
        english = sc.nextInt();

        // printing the Mark Sheet with all the details of the student
        System.out.println(" ____________________________");
        System.out.println("|                            |");
        System.out.println("|      Mark Sheet            |");
        System.out.println("|____________________________|");
        System.out.println("| Name:       " +name+"          |");
        System.out.println("| Roll No:    " +roll+"             |");
        System.out.println("|____________________________|");
        System.out.println("| Subjects:           Marks  |");
        System.out.println("|____________________________|");
        System.out.println("| Math:       "+ math + "             |");
        System.out.println("| Science:    "+ science + "             |");
        System.out.println("| English:    "+ english + "             |");
        System.out.println("|____________________________|");
        total();
        System.out.println("| Total:      "+sum +"            |");
        System.out.println("|____________________________|");
        percentage();
        System.out.println("| Percentage:" + percentage+"            |");
        result();
        System.out.println("| Result:     " + result + "           |");
        grade();
        System.out.println("| Grade :     "+ grade +"             |");
        System.out.println("|____________________________|");


    }

    public static void  total () {
        // add all subj (maths, science and english) marks
      sum = math + science + english ;
    }
    //calculate the percentage
    public static void percentage(){

        //  (total marks of all subjects * number of subjects) / 100
        percentage = (sum*100)/300;

    }

    /*method result() will return the result as Pass or Fail based on the subject marks.
    If the student is failed in one subject and passed in other subjects, will Fail to the student*/
    public static void result(){
     if (math >= 35 && science >= 35 && english >= 35)
     {
         result = "Pass";
     } else
     {
         result = "Fail";
     }
    }
    /* Method grade() will calculate the grade based on the percentage value and result.
    If percentage is more than 33 percent but failed in one subject, then grade will not appear
     */
    public static void grade(){
       if(percentage >= 80 && result == "Pass") {
           grade = "A+";

       }else if(percentage < 80 && percentage >= 60 && result == "Pass"){
        grade = "A" ;

       }else if(percentage <60 && percentage >= 50 && result == "Pass"){
           grade = "B";

       }else if (percentage < 50 && percentage >= 35 && result == "Pass"){
           grade = "C";
       }else{
           grade = "-";
       }

    }
}
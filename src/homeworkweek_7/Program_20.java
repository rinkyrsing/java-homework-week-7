package homeworkweek_7;

public class Program_20 {
    public static void main(String[] args) {

        int[] arr = {24, 7, 33, 6, 12};
        int spcificElement = 6;

        // calling static method
        Program_20.array1(arr, spcificElement);

    }
    //no return type with parameter
    public static void array1(int[]arr,int specificElement){

        int[] input = arr;//local variable
        int element = specificElement;//local variable

        for (int i = 0; i < input.length; i++)
        {
            System.out.println("" + input[i]);

            if (input[i] == element)  //condition to check element in array
            {
                System.out.println("YES");

            }
        }
    }
}

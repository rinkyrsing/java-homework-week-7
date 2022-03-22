package homeworkweek_7;

import java.util.*;

public class Program_18 {

    public static void main(String[] args) {
        // Variables
        int sum = 0;

        // declaring the integer array
        int[] arr = new int[6]; // declaring array
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 34;
        arr[3] = 20;
        arr[4] = 1;
        arr[5] = 9;

        //sum of array numbers
        int lengthOfArray = arr.length;
        for(int i = 0; i < lengthOfArray; i++)

        {
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}
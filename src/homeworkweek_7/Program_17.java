package homeworkweek_7;

import java.util.Arrays;

public class Program_17 {
    public static void main(String[] args) {
        // Java program to sort a numeric array and a string array
        int[] arrdata = {10, 34, 2, 34, 21, 42, 9, 18, 24 };
        String [] arrdata1 = {"orange", "apple", "banana", "cherry", "strawberry","pineapple" };

        // Sorting integer array
        System.out.println("Original value: " + Arrays.toString(arrdata));
        Arrays.sort(arrdata);
        System.out.println("Sorted value: " + Arrays.toString(arrdata));

        // Sorting Sting array
        System.out.println("Original value: " + Arrays.toString(arrdata1));
        Arrays.sort(arrdata1);
        System.out.println("Sorted value: " + Arrays.toString(arrdata1));

    }
}

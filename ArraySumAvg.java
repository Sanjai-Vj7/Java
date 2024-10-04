//Program to find the sum and avg in the array user input : TCS Question 

import java.util.*;

public class ArraySumAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[7]; // Corrected: Use 'new int[7]' to initialize the array
        int days = 7;
        int value = 0,sum=0;

        for (int i = 0; i < days; i++) { // Corrected: Loop starts from 0 and goes to days - 1
            System.out.print("Day " + (i + 1) + " exercise duration:");
            value = scan.nextInt();
            
            arr[i] = value; // Corrected: Assign value to the correctindex of the array
            sum+=arr[i];
        }
            float avg=(float)sum/days;
        // Print the array contents
        // System.out.println("Exercise durations for the week: " + Arrays.toString(arr)); // Improved output formatting
        System.out.print(sum+" ");
        System.out.printf("%.1f", avg);
        
        
        ;
        
    }
}

package icetask1;

import java.util.Arrays;
import java.util.Scanner;

public class IceTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to read user input
        String choice;  // Variable to store user's choice for sorting order
        int i, j;  // Loop variables
        String key;  // Variable to store the key for insertion sort
        String[] inputArray = { "Harry Potter", "The Great Gatsby", "To Kill a Mockingbird", "Pride and Prejudice", "Othello" };
        
        // Display the original array
        System.out.println("Original array: " + Arrays.toString(inputArray));
        
        // Prompt the user to choose sorting order
        System.out.println("Please choose an option:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter your choice (1 or 2): ");
        
        // Get the user's choice
        choice = scanner.nextLine();

           //Title: Insertion Sort using string.compareTo()
           //Author: Rohit Jain
           //Date: 2 july 2013
           //Version: 1
           //Availability: https://stackoverflow.com/questions/17432738/insertion-sort-using-string-compareto 
             
        // Handle the user's choice for sorting
        if (choice.equals("1")) {  // Ascending order
            
            // Implementing Insertion Sort in Ascending Order
            for (j = 1; j < inputArray.length; j++) {
                key = inputArray[j];
                i = j - 1;
                
                // Compare elements and shift them to the right to insert the key
                while (i >= 0 && key.compareTo(inputArray[i]) < 0) {
                    inputArray[i + 1] = inputArray[i];
                    i--;
                }
                
                // Place the key in its correct position
                inputArray[i + 1] = key;
                
                // Print the array after each insertion step
                System.out.println("Step " + j + ": " + Arrays.toString(inputArray));
            }
            
            // Display the final sorted array in ascending order
            System.out.println("Sorted array in Ascending Order: " + Arrays.toString(inputArray));
            
        } else if (choice.equals("2")) {  // Descending order
            
            // Implementing Insertion Sort in Descending Order
            for (j = 1; j < inputArray.length; j++) {
                key = inputArray[j];
                i = j - 1;
                
                // Compare elements and shift them to the right to insert the key
                while (i >= 0 && key.compareTo(inputArray[i]) > 0) {
                    inputArray[i + 1] = inputArray[i];
                    i--;
                }
                
                // Place the key in its correct position
                inputArray[i + 1] = key;
                
                // Print the array after each insertion step
                System.out.println("Step " + j + ": " + Arrays.toString(inputArray));
            }
            
            // Display the final sorted array in descending order
            System.out.println("Sorted array in Descending Order: " + Arrays.toString(inputArray));
            
        } else {
            // Handle invalid choice
            System.out.println("Invalid choice. Please enter 1 for Ascending or 2 for Descending.");
        }
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

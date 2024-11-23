package tasks;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
            return;
        }
        
        int sum = 0;
        
        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10;      // Remove the last digit
        }
        
        // Display the result
        System.out.println("The sum of all digits is " + sum);
    }
}

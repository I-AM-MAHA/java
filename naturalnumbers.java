package tasks;

import java.util.Scanner;

public class naturalnumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the number of odd natural numbers to sum: ");
        int n = scanner.nextInt();

        // Initialize the sum
        int sum = 0;

        // Calculate the sum of the first n odd numbers
        for (int i = 1; i <= 2 * n; i += 2) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

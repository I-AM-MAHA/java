package tasks;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height : ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        //  BMI classification
        if (bmi < 18.5) {
            System.out.println("Classification: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Classification: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Classification: Overweight");
        } else {
            System.out.println("Classification: Obesity");
        }

        // Close the scanner
        scanner.close();
    }
}

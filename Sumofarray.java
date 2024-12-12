package tasks;

import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array values is: " + sum);
    }
}

package tasks;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = 20 - i;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

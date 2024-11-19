package tasks;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number  +  "The given is even.");
        }

        if (number % 2 != 0) {
            System.out.println(number  +   "The given is odd.");
        }

        scanner.close();
    }
}

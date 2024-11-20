package tasks;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int real = num;

        int reverse = 0;

        while (num != 0) {
            int mod = num % 10;  
            reverse = reverse * 10 + mod;  
            num = num / 10;  
        }

        if (reverse == real) {
            System.out.println(real + " is a Palindrome.");
        } else {
            System.out.println(real + " is not a Palindrome.");
        }

        scanner.close();
    }
}

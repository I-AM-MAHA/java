package tasks;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int mod = num % 10;
            sum = sum + (mod * mod * mod);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
}

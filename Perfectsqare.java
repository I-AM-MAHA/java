package tasks;

import java.util.Scanner;

public class Perfectsqare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                System.out.println(num + " is a Perfect Square.");
                scanner.close(); 
                return;  
            }
        }
        
        System.out.println(num + " is not a Perfect Square.");
        scanner.close(); 
    }
}

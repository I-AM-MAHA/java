package tasks;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt(); 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

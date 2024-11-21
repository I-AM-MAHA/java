package tasks;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();         }
        
            }
}


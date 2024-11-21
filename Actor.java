package tasks;

import java.util.Scanner;

public class Actor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an actor:");
        System.out.println("1. Rajinikanth");
        System.out.println("2. Vijay");
        System.out.println("3. Kamal Haasan");
        System.out.print("Enter your choice (1-3): ");
        int actorChoice = scanner.nextInt();

        if (actorChoice == 1) {
            System.out.println("1. Sivaji");
            System.out.println("2. Enthiran");
            System.out.println("3. Kaala");
            System.out.println("4. Darbar");
            System.out.println("5. Lingaa");
            System.out.print("Enter your choice (1-5): ");
            int rajiniMovie = scanner.nextInt();

            switch (rajiniMovie) {
                case 1 : System.out.println("Sivaji: Blockbuster!");
                case 2 : System.out.println("Enthiran: Blockbuster!");
                case 3 : System.out.println("Kaala: Flop.");
                case 4 : System.out.println("Darbar: Average hit.");
                case 5 : System.out.println("Lingaa: Flop.");
                default : System.out.println("Invalid movie choice.");
            }
        } else if (actorChoice == 2) {

        	System.out.println("You selected Vijay. Choose a movie:");
            System.out.println("1. Thuppakki");
            System.out.println("2. Mersal");
            System.out.println("3. Beast");
            System.out.println("4. Master");
            System.out.println("5. Bigil");
            System.out.print("Enter your choice (1-5): ");
            int vijayMovie = scanner.nextInt();

            switch (vijayMovie) {
                case 1 : System.out.println("Thuppakki: Blockbuster!");
                case 2 : System.out.println("Mersal: Blockbuster!");
                case 3 : System.out.println("Beast: Average hit.");
                case 4 : System.out.println("Master: Hit.");
                case 5 : System.out.println("Bigil: Blockbuster!");
                default : System.out.println("Invalid movie choice.");
            }
        } else if (actorChoice == 3) {
            System.out.println("You selected Kamal Haasan. Choose a movie:");
            System.out.println("1. Vishwaroopam");
            System.out.println("2. Dasavatharam");
            System.out.println("3. Vikram");
            System.out.println("4. Indian");
            System.out.println("5. Papanasam");
            System.out.print("Enter your choice (1-5): ");
            int kamalMovie = scanner.nextInt();

            switch (kamalMovie) {
                case 1 : System.out.println("Vishwaroopam: Hit.");
                case 2 : System.out.println("Dasavatharam: Blockbuster!");
                case 3 : System.out.println("Vikram: Blockbuster!");
                case 4 : System.out.println("Indian: Blockbuster!");
                case 5 : System.out.println("Papanasam: Super Hit.");
                default : System.out.println("Invalid movie choice.");
            }
        } else {
            System.out.println("Invalid actor choice.");
        }

        scanner.close();
    }
}

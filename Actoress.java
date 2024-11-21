package tasks;

import java.util.Scanner;

public class Actoress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an actress:");
        System.out.println("1. Samantha");
        System.out.println("2. Nayanthara");
        System.out.println("3. Kajal Aggarwal");
        System.out.print("Enter your choice (1-3): ");
        int actressChoice = scanner.nextInt();

        switch (actressChoice) {
            case 1 : {
                // Samantha's 
                System.out.println("You selected Samantha. Choose an actor:");
                System.out.println("1. Vijay");
                System.out.println("2. Vijay Deverakonda");
                System.out.println("3. Vikram");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Vijay and Samantha starred in: Kaththi.");
                    case 2 : System.out.println("Vijay Deverakonda and Samantha starred in: Kushi.");
                    case 3 : System.out.println("Vikram and Samantha have not starred together.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            case 2 : {
                // Nayanthara's pair
                System.out.println("You selected Nayanthara. Choose an actor:");
                System.out.println("1. Vijay");
                System.out.println("2. Vijay Deverakonda");
                System.out.println("3. Vikram");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Vijay and Nayanthara starred in: Bigil.");
                    case 2 : System.out.println("Vijay Deverakonda and Nayanthara have not starred together.");
                    case 3 : System.out.println("Vikram and Nayanthara starred in: Iru Mugan.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            case 3 : {
                // Kajal Aggarwal's pair
                System.out.println("You selected Kajal Aggarwal. Choose an actor:");
                System.out.println("1. Vijay");
                System.out.println("2. Vijay Deverakonda");
                System.out.println("3. Vikram");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Vijay and Kajal Aggarwal starred in: Thuppakki.");
                    case 2 : System.out.println("Vijay Deverakonda and Kajal Aggarwal have not starred together.");
                    case 3 : System.out.println("Vikram and Kajal Aggarwal have not starred together.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            default : System.out.println("Invalid actress choice.");
        }

        scanner.close();
    }
}

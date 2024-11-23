package tasks;

public class usingif {
    public static void main(String[] args) {
        int number = 500;

        // Print numbers using only if statements
        System.out.print(number + " ");
        if (number >= 400) {
            number -= 100;
            System.out.print(number + " ");
        }
        if (number >= 300) {
            number -= 100;
            System.out.print(number + " ");
        }
        if (number >= 200) {
            number -= 100;
            System.out.print(number + " ");
        }
        if (number >= 100) {
            number -= 100;
            System.out.print(number + " ");
        }
        if (number >= 0) {
            number -= 100;
            System.out.print(number + " ");
        }
    }
}

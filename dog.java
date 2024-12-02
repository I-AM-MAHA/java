package tasks;

public class dog {
    String name;
    String colour;

    public dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void display() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Colour: " + colour);
    }

    public static void main(String[] args) {
        dog dog1 = new dog("Buddy", "Brown");
        dog dog2 = new dog("Lucy", "Black");
        dog dog3 = new dog("Max", "White");
        dog dog4 = new dog("Hero", "Brown");

        System.out.println("Dog 1 Details:");
        dog1.display();

        System.out.println("\nDog 2 Details:");
        dog2.display();

        System.out.println("\nDog 3 Details:");
        dog3.display();

        System.out.println("\nDog 4 Details:");
        dog4.display();
    }
}

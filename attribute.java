package tasks;

class Person {

     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class attribute {

    public static void main(String[] args) {
        Person person1 = new Person("Dhana", 23);
        Person person2 = new Person("Mina", 30);

        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
    }
}

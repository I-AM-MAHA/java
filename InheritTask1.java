package tasks;

class Vehicle {
    public String make;
    public String model;
    public int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Make of Vehicle: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    public int trunkSize;

    Car(String make, String model, int year, int trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public void displayCarDetails() {
        display();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}

class Truck extends Car {
    public int Capacity;

    Truck(String make, String model, int year, int trunkSize, int Capacity) {
        super(make, model, year, trunkSize);
        this.Capacity = Capacity;
    }

    public void displayTruckDetails() {
        displayCarDetails();
        System.out.println("Payload Capacity: " + Capacity + " kg");
    }
}

public class InheritTask1 {
    public static void main(String[] args) {
        Truck truck = new Truck("toyoto", "A6", 2002, 500, 10000);
        Car car = new Car("Benz", "A22", 2005, 500);

        System.out.println("Car Details:");
        car.displayCarDetails();

        System.out.println("Truck Details:");
        truck.displayTruckDetails();
    }
}

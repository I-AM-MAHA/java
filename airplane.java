package tasks;

public class airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void checkFlightStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " is scheduled for departure at " + departureTime + ".");
    }

    public void delayFlight(String newDepartureTime) {
        System.out.println("Flight " + flightNumber + " is delayed. New departure time: " + newDepartureTime);
        this.departureTime = newDepartureTime;
    }

    public static void main(String[] args) {
        airplane flight1 = new airplane("AI123", "New York", "10:00 AM");

        System.out.println("Flight Status:");
        flight1.checkFlightStatus();

        System.out.println("\nUpdating Departure Time:");
        flight1.delayFlight("12:30 PM");

        System.out.println("\nUpdated Flight Status:");
        flight1.checkFlightStatus();
    }
}

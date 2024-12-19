package tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date in the format YYYY-MM-DD:");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_DATE);

            LocalDate modifiedDate = date.plusDays(4).plusMonths(4).plusYears(4);

            System.out.println("The resulting date after adding 4 days, 4 months, and 4 years is: " + modifiedDate);
        } catch (Exception e) {
            System.out.println("Invalid date format.  Enter the date in YYYY-MM-DD format.");
        } finally {
            scanner.close();
        }
    }
}


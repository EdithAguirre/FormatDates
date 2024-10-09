package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();

        // Create a date formatter to display date with slashes and print
        DateTimeFormatter formatDateSlash = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateTime.format(formatDateSlash));

        // Create date formatter to display date with dashes and print
        DateTimeFormatter formatDateDash = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dateTime.format(formatDateDash));

        // Create date formatter to display date with month name and comma then print
        DateTimeFormatter formatDateName = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println(dateTime.format(formatDateName));

        // Create date formatter to display date with day, month name, day, and time then print
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(dateTime.format(formatDateTime));
    }
}
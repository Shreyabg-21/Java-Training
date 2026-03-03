package oop.day6.anonymous;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date :"+date);
        LocalTime time = LocalTime.now();
        System.out.println("Time :"+time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date Time :"+dateTime);

        /*
         E - name of day (mon - sun)
         D - day of the year (1-366)
         dd - day of the month (1 - 31)
         M - month number (1 - 12)
         MMM - month name - (jan - dec)
         */

        DateTimeFormatter format = DateTimeFormatter.
                ofPattern("E, MMM dd yyyy");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted date: " +
                formattedDateTime);
    }
}
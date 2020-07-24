package com.google.ssadm.homework.w21_40.w38;

// Enter the date from the console.
// Compare it with the current date in the system.
// Display the differing parts (year, month) on the screen.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCompare {
    final static String regexp = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)" +
            "(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^" +
            "(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
            "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static void main(String[] args) {
        System.out.println("Enter the date (01/01/2001):");
        Scanner scan = new Scanner(System.in);
        String dateString = scan.nextLine();

        compareDate(dateString);
    }

    private static void compareDate(String dateString) {
        if(dateString.matches(regexp)){
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate input = LocalDate.parse(dateString, f);
            LocalDate now = LocalDate.now();
            if(!now.isEqual(input)){
                if(now.getDayOfMonth()!=input.getDayOfMonth()){
                    System.out.println("Days are different" + " " + now.getDayOfMonth() + " " + input.getDayOfMonth());
                }
                if(now.getMonth()!=input.getMonth()){
                    System.out.println("Months are different" + " " + now.getMonth() + " " + input.getMonth());
                }
                if(now.getYear()!=input.getYear()){
                    System.out.println("Months are different" + " " + now.getYear() + " " + input.getYear());
                }
            } else {
                System.out.println("Yor enter current date");
            }

        } else {
            System.out.println("Invalid input");
        }
    }
}

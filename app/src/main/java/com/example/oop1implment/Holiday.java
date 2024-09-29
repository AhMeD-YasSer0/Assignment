package com.example.oop1implment;

public class Holiday {
    // Instance variables
    private String name;
    private int day;
    private String month;

    // Constructor (a)
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int totalDays = 0;

        for (Holiday holiday : holidays) {
            totalDays += holiday.day; // Direct access to the day variable
        }

        return (double) totalDays / holidays.length;
    }

    public static void main(String[] args) {
        // Creating a com.example.oop1implment.Holiday instance (d)
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        System.out.println("com.example.oop1implment.Holiday: " + independenceDay.name +
                ", Day: " + independenceDay.day +
                ", Month: " + independenceDay.month);

        Holiday[] holidays = {
                new Holiday("New Year's Day", 1, "January"),
                new Holiday("Valentine's Day", 14, "February"),
                new Holiday("Independence Day", 4, "July"),
                new Holiday("Christmas", 25, "December")
        };

        System.out.println("Average day: " + Holiday.avgDate(holidays)); // Example output
    }
}

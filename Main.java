package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please type in a month (1-12) : ");
        int month = in.nextInt();
        System.out.print("Please type in a day (1-31): ");
        int day = in.nextInt();
        System.out.print("Please type in a year : ");
        int year = in.nextInt();

        myDate date = new myDate(day,month,year);
        System.out.println();

        System.out.printf("%-30s","Long Date: ");
        System.out.println(date.longDate());
        System.out.printf("%-30s","Short Date: ");
        System.out.println(date.shortDate());
        System.out.printf("%-30s","Month: ");
        System.out.println(date.getMonthName());
        System.out.printf("%-30s","Day: ");
        System.out.println(date.getDay());
        System.out.printf("%-30s","Year: ");
        System.out.println(date.getYear());
        System.out.printf("%-30s","Is Leap Year: ");
        if (date.isLeapYear())
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.printf("%-30s","Days in the Month: ");
        System.out.println(date.daysInMonth());
        System.out.printf("%-30s","Season: ");
        System.out.println(date.getSeason());

    }
}

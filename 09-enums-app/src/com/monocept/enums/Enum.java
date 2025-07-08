package com.monocept.enums;

import java.util.Scanner;

public class Enum {
	public static void main(String[] args) {

//		Case 1 - To Print the value
		DaysOfTheWeek dayName = DaysOfTheWeek.MONDAY;
		System.out.println(dayName);
		System.out.println(dayName.getDayNumber());
		System.out.println("Ordinal Value of day:" + dayName.ordinal());

		if (dayName == DaysOfTheWeek.MONDAY) {
			System.out.println("It's Monday !!");
		}

//		Case 2 
		for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
			System.out.println(myDay + " " + myDay.getDayNumber());
		}

//		Case 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day: ");
		String response = sc.nextLine().toUpperCase();

		DaysOfTheWeek day = DaysOfTheWeek.valueOf(response);

		switch (day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("It's a WeekDay");
		case SUNDAY, FRIDAY, SATURDAY -> System.out.println("It's a Weekend :)");
		default -> System.out.println("Enter a Valid Day:");
		}
		sc.close();
	}
}
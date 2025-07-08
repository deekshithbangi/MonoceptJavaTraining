package com.monocept.enums;

enum Months {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}

public class Seasons {
	public static void main(String[] args) {

		Months month = Months.JULY;

		switch (month) {
		case DECEMBER, JANUARY, FEBRUARY -> System.out.println("Winter Season");
		case MARCH, APRIL, MAY -> System.out.println("Summer Season");
		case JUNE, JULY, AUGUST -> System.out.println("Rainy Season");
		case SEPTEMBER, OCTOBER, NOVEMBER -> System.out.println("Post-Monsoon Season");
		}
	}
}

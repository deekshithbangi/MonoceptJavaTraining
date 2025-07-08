package com.monocept.enums;

public enum DaysOfTheWeek {

	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private final int dayNumber;

//	Constructor
	DaysOfTheWeek(int dayNumber) {
		this.dayNumber = dayNumber;
	}

//	Get Method 
	public int getDayNumber() {
		return dayNumber;
	}

}

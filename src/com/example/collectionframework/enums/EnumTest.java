package com.example.collectionframework.enums;

public class EnumTest {

	WeekDays weekDays;

	// declaring the constructor
	public EnumTest(WeekDays weekDays) {
		super();
		this.weekDays = weekDays;
	}

	public void showWeekDays() {
		switch (weekDays) {
		case MONDAY:
			System.out.println("Today is : " + weekDays.MONDAY);
			break;

		case TUESDAY:
			System.out.println("Today is : " + weekDays.TUESDAY);
			break;

		case WEDNESDAY:
			System.out.println("Today is : " + weekDays.WEDNESDAY);
			break;

		case THURSDAY:
			System.out.println("Today is : " + weekDays.THURSDAY);
			break;

		case FRIDAY:
			System.out.println("Today is : " + weekDays.FRIDAY);
			break;

		case SATURDAY:
			System.out.println("Today is : " + weekDays.SATURDAY);
			break;
		default:
			System.out.println("Today is : " + WeekDays.SUNDAY);
			break;
		}
	}

	public static void main(String[] args) {
		EnumTest EnumTest = new EnumTest(WeekDays.FRIDAY);
		EnumTest.showWeekDays();

	}

}

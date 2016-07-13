package com.brainacad.oop.testenum1;

public enum MyDayOfWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public MyDayOfWeek nextDay() {
		return MyDayOfWeek.values()[this.ordinal() == (MyDayOfWeek.values().length - 1) ? 0
				: this.ordinal() + 1];
	}
}

package oop_2_13.labs._2_13_1_and_2;

public enum Season {
	
	SPRING, SUMMER, AUTUMN, WINTER;
	
	public static Season nextSeason(Season current) {
		if(current.ordinal() == Season.values().length - 1) 
			return Season.values()[0];
		else
			return Season.values()[current.ordinal() + 1];
	}
}

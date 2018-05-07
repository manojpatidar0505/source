package com.oops;

public class EnumExample {
public enum Days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
public static void main(String[] args) {
	System.out.println(Days.MONDAY);
	for (Days days : Days.values()) {
		System.out.println(days);
		
	}
}
}

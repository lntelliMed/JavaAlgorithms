package com.intellimed.secondset;

public class ClockAngle {

	private static double getClockAngle(int hour, int minutes){
		final double MINUTES_PER_HOUR = 60;
		final double DEGREES_PER_MINUTE = 360 / MINUTES_PER_HOUR;
		final double DEGREES_PER_HOUR = 360/12;
		

		double minutesAngle = minutes * DEGREES_PER_MINUTE;
		double hourAngle = hour * DEGREES_PER_HOUR 
				+ (minutes/MINUTES_PER_HOUR) * DEGREES_PER_HOUR;
		
		double diff = Math.abs(minutesAngle - hourAngle);
		if (diff > 180) {
			return 360 - diff;
		}
		return diff;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getClockAngle(3,0));
		System.out.println(getClockAngle(11,10));

	}

}

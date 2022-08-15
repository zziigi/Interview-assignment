package com.example.calculator;

public class ClockAngleCalculator {
    public int calculateClockAngle(int hour, int minute) {
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Invalid Input. Valid values for hour is between 0 and 23");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("Invalid Input. Valid values for minute is between 0 and 59");
        }
        int hourAngleDisplacement = (360 * minute) / (24 * 60);
        int hourAngle = (360/24 * hour) + hourAngleDisplacement ;
        int minuteAngle = 360/60 * minute;
        int angle =  Math.abs(hourAngle-minuteAngle);
        return Math.min(angle, (360 - angle));
    }
}

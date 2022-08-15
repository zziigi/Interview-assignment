package com.example.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        ClockAngleCalculator clockAngleCalculator = new ClockAngleCalculator();
        Scanner in = new Scanner(System.in);
        System.out.println("This application calculates the minimum angle between the hour and minute hand on a 24 hour clock.");
        System.out.println("Enter value for hour and minute in the format hh mm eg 03 05 to calculate the minimum angle between them.");
        System.out.println("Enter 0 to exit");

        String input = in.nextLine();
        while (!input.equals("0")) {
            try {
                String[] parameters = input.split(" ");
                int hour = Integer.parseInt(parameters[0]);
                int minute =  Integer.parseInt(parameters[1]);

                int angle = clockAngleCalculator.calculateClockAngle(hour, minute);
                System.out.println("Minimum Angle: " + angle);
            }
            catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                System.out.println("Please check your input. Accepted format is hh mm. eg 10 23");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("Error in application: " + e.getMessage());
            }
            System.out.println("Enter value for hour and minute in the format hh mm eg 03 05");
            input = in.nextLine();
        }
        System.out.println("exiting application....");
    }
}

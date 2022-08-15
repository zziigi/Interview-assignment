package com.example.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockAngleCalculatorTest {

    ClockAngleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new ClockAngleCalculator();
    }

    @Test
    public void throwExceptionIfInputIsHourInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateClockAngle(25,0));
    }

    @Test
    public void throwExceptionIfInputIsMinuteInputIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateClockAngle(12,60));
    }

    @Test
    public void validateOutput(){
        int r = calculator.calculateClockAngle(00,00);
        assertEquals(0, r);

        r = calculator.calculateClockAngle(03,00);
        assertEquals(45, r);

        r = calculator.calculateClockAngle(06,00);
        assertEquals(90, r);

        r = calculator.calculateClockAngle(12,00);
        assertEquals(180, r);
    }
}
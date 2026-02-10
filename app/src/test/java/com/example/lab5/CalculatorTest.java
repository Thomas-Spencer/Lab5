package com.example.lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void TestAddwithpositivenumbers() {
        double a = 2;
        double b = 2;
        double actualaddvalue=Calculator.add(a,b);
        double expectedvalue = a+b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }
    @Test
    public void TestAddwithNegativenumbers() {
        double a = -2;
        double b = -2;
        double actualaddvalue=Calculator.add(a,b);
        double expectedvalue = a+b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }
    @Test
    public void TestAddwithpositiveandnegativenumbers() {
        double a = 5;
        double b = -10;
        double actualaddvalue=Calculator.add(a,b);
        double expectedvalue = a+b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }

    @Test
    public void Testsubwithpositivenumbers() {
        double a = 2;
        double b = 2;
        double actualaddvalue=Calculator.sub(a,b);
        double expectedvalue = a-b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }
    @Test
    public void TestsubwithNegativenumbers() {
        double a = -2;
        double b = -2;
        double actualaddvalue=Calculator.sub(a,b);
        double expectedvalue = a-b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }
    @Test
    public void Testsubwithpositiveandnegativenumbers() {
        double a = 5;
        double b = -10;
        double actualaddvalue=Calculator.sub(a,b);
        double expectedvalue = a-b;
        assertEquals(expectedvalue,actualaddvalue,0.0005);
    }
}

package com.example.lab5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathUtilTest {
    @Test
    public void TestAbsofPositiveNumber() {
        double inputvalue = 5;
        double actualabsvalue = MathUtil.abs(inputvalue);
        double expectedvalue = inputvalue;
        assertEquals(expectedvalue,actualabsvalue,0.0005);
    }
    @Test
    public void TestAbsofNegativeNumber() {
        double inputvalue = -5;
        double actualabsvalue = MathUtil.abs(inputvalue);
        double expectedvalue = inputvalue*-1;
        assertEquals(expectedvalue,actualabsvalue,0.0005);
    }
}

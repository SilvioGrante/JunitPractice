package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();

        int result = calculator.multiply(4,5);

        assertEquals(20,result);
    }
}

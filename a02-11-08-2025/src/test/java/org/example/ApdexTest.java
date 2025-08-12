package org.example;

import org.junit.jupiter.api.Test;

public class ApdexTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
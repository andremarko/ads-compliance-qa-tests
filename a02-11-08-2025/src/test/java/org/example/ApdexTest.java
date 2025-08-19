package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {
    private Apdex apdex;
    @BeforeEach
    public void arrange() {
        this.apdex = new Apdex();
    }


    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void apdexBom(){
        Apdex apdex = new Apdex();
        double apdexBom = apdex.calcApdex(80, 20, 100);
        assertEquals(0.9, apdexBom, 0.01);
    }

    @Test
    public void validarApdexExcelente() {
        double score = apdex.calcApdex(1000, 0, 1000);
        assertEquals(1, score, 0.001);
    }
}
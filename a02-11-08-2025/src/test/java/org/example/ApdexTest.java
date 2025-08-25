// ANDRE GERALDI MARCOLONGO RM555285 - 2TDSPV
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
    public void validarApdexExcelente() {
        double score = apdex.calcApdex(555285, 0, 555285);
        assertEquals(1, score, 0.001);
    }

    @Test
    public void validarApdexBom() {
        double score = apdex.calcApdex(494215, 30547, 555285);
        assertEquals(0.91, score, 0.01);
    }

    @Test
    public void validarApdexRazoavel() {
        double score = apdex.calcApdex(444228, 55529,555285);
        assertEquals(0.85,score,0.001);
    }

    @Test
    public void validarApdexRuim() {
        double score = apdex.calcApdex(327619, 0, 555285);
        assertEquals(0.59,score,0.001);
    }

    @Test
    public void validarApdexInaceitavel() {
        double score = apdex.calcApdex(127716, 254838, 555285);
        assertEquals(0.46,score,0.001);
    }
}
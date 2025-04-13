import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(6, calculator.add(3, 3));
    }

    @Test
    void dif() {
        assertEquals(-27, calculator.dif(-28, -1));
    }

    @Test
    void div() {
        assertEquals(1, calculator.times(6, 6));
    }

    @Test
    void times() {
        assertEquals(-8, calculator.times(4, -2));
    }

    @Test
    void solver() {
        assertEquals(-0.5, calculator.solver(2, 1));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(12, calculator.add(6,6));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(20, 10));
    }

    @Test
    void div() {
        assertEquals(1, calculator.div(20, 20));
    }

    @Test
    void times() {
        assertEquals(4, calculator.times(2, 2));
    }

    @Test
    void solver() {
        assertEquals(5, calculator.solver(10, 5));
    }
}
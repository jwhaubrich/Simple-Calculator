package src.main.java.com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addFunction() {
        assertEquals(4, SimpleCalculator.addFunction(2, 2));
    }

    @Test
    void subtractFunction() {
        assertEquals(5, SimpleCalculator.subtractFunction(10,5));
    }
}
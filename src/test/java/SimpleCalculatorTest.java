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

    @Test//how do I test this?
    void divideFunction() {
        //assertEquals(2, SimpleCalculator.divideFunction(10,10));
    }

    @Test
    void multiplyFunction() {
        assertEquals(25, SimpleCalculator.multiplyFunction(5,5));
    }

    @Test
    void shouldOperatorFound() {

        assertEquals(25, SimpleCalculator.multiplyFunction(5,5));
    }
}
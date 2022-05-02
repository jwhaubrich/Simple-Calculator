package JoeCo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addFunction() { Assertions.assertEquals(4, PerformOperations.addFunction(2, 2)); }

    @Test
    void subtractFunction() { Assertions.assertEquals(5, PerformOperations.subtractFunction(10,5)); }

    @Test
    void divideFunction() { Assertions.assertEquals(5, PerformOperations.divideFunction(10,2)); }

    @Test
    void multiplyFunction() { Assertions.assertEquals(25, PerformOperations.multiplyFunction(5,5)); }

}
import joeco.operations.Addition;
import joeco.operations.Division;
import joeco.operations.Multiplication;
import joeco.operations.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleCalculatorTest {

    @Test
    void testAdditionShouldReturnFour() {
        int result;
        Addition additionTest = new Addition();
        result = additionTest.performOperation(2,2);

        Assertions.assertEquals(4,result);
    }


    @Test
    void testSubtractionShouldReturnThree() {
        int result;

        Subtraction subtractionTest = new Subtraction();
        result = subtractionTest.performOperation(6,3);

        Assertions.assertEquals(3,result);
    }

    @Test
    void testSubtractionShouldReturnNegativeFive() {
        int result;

        Subtraction subtractionTest = new Subtraction();
        result = subtractionTest.performOperation(5,10);

        Assertions.assertEquals(-5,result);
    }

    @Test
    void testDivisionShouldReturnSix() {
        int result;

        Division divideTest = new Division();
        result = divideTest.performOperation(12,2);

        Assertions.assertEquals(6,result);
    }


    @Test
    void testDivisionShouldReturnDivideByZeroException() {
        Division newDivisionTest = new Division();

        Assertions.assertThrows(ArithmeticException.class, ()->{newDivisionTest.performOperation(5,0);});
    }


    @Test
    void testMultiplicationShouldReturnTwentyFive() {
        int result;

        Multiplication multiplyTest = new Multiplication();
        result = multiplyTest.performOperation(5,5);

        Assertions.assertEquals(25,result);
    }

    @Test
    void testMultiplicationShouldReturnNegativeTwo() {
        int result;

        Multiplication multiplyTest = new Multiplication();
        result = multiplyTest.performOperation(-1,2);

        Assertions.assertEquals(-2,result);
    }

}
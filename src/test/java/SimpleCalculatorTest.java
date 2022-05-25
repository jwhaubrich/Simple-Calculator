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
        int expectedResult = 4;
        boolean resultEqualsExpected;
        Addition additionTest = new Addition();

        result = additionTest.performOperation(2,2);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Addition test 2 + 2 equals 4: "+resultEqualsExpected);
    }


    @Test
    void testSubtractionShouldReturnThree() {
        int result;
        int expectedResult = 3;
        boolean resultEqualsExpected;

        Subtraction subtractionTest = new Subtraction();
        result = subtractionTest.performOperation(6,3);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Subtraction test 6 - 3 equals 3: "+resultEqualsExpected);
    }

    @Test
    void testSubtractionShouldReturnNegativeFive() {
        int result;
        int expectedResult = -5;
        boolean resultEqualsExpected;

        Subtraction subtractionTest = new Subtraction();
        result = subtractionTest.performOperation(5,10);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Subtraction test 5 - 10 equals -5: "+resultEqualsExpected);
    }

    @Test
    void testDivisionShouldReturnSix() {
        int result;
        int expectedResult = 6;
        boolean resultEqualsExpected;

        Division divideTest = new Division();
        result = divideTest.performOperation(12,2);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Division test 12/2 equals 6: "+resultEqualsExpected);
    }


    @Test
    void testDivisionShouldReturnDivideByZeroException() {
        Division newDivisionTest = new Division();

        Assertions.assertThrows(ArithmeticException.class, ()->{newDivisionTest.performOperation(5,0);});
    }


    @Test
    void testMultiplicationShouldReturnTwentyFive() {
        int result;
        int expectedResult = 25;
        boolean resultEqualsExpected;

        Multiplication multiplyTest = new Multiplication();
        result = multiplyTest.performOperation(5,5);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Multiplication test 5*5 equals 25: "+resultEqualsExpected);
    }

    @Test
    void testMultiplicationShouldReturnNegativeTwo() {
        int result;
        int expectedResult = -2;
        boolean resultEqualsExpected;

        Multiplication multiplyTest = new Multiplication();
        result = multiplyTest.performOperation(-1,2);
        resultEqualsExpected = (expectedResult == result);

        Assertions.assertTrue(expectedResult == result);
        System.out.println("Multiplication test -1*2 equals -2: "+resultEqualsExpected);
    }

}
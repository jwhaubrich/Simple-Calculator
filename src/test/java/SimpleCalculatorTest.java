import JoeCo.Operations.Addition;
import JoeCo.Operations.Division;
import JoeCo.Operations.Multiplication;
import JoeCo.Operations.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SimpleCalculatorTest {

    @Test
    void testAdditionShouldReturnFour() {
        int result;

        Addition exeAdd = new Addition(2,2);
        result = exeAdd.performAddition();

        Assertions.assertEquals(4,result);
    }


    @Test
    void testSubtractionShouldReturnThree() {
        int result;

        Subtraction exeSubtract = new Subtraction(6,3);
        result = exeSubtract.performSubtraction();

        Assertions.assertEquals(3,result);
    }

    @Test
    void testSubtractionShouldReturnNegativeFive() {
        int result;

        Subtraction exeSubtract = new Subtraction(0,5);
        result = exeSubtract.performSubtraction();

        Assertions.assertEquals(-5,result);
    }

    @Test
    void testDivisionShouldReturnSix() {
        int result;

        Division exeDivide = new Division(12,2);
        result = exeDivide.performDivision();

        Assertions.assertEquals(6,result);
    }


    @Test
    void testMultiplicationShouldReturnTwentyFive() {
        int result;

        Multiplication exeMultiply = new Multiplication(5,5);
        result = exeMultiply.performMultiplication();

        Assertions.assertEquals(25,result);
    }

    @Test
    void testMultiplicationShouldReturnNegativeTwo() {
        int result;

        Multiplication exeMultiply = new Multiplication(-1,2);
        result = exeMultiply.performMultiplication();

        Assertions.assertEquals(-2,result);
    }

}
package joeco.operations;

public class Multiplication implements Strategy{
    @Override
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

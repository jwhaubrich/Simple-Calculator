package joeco.operations;

public class Division implements Strategy {
    @Override
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}


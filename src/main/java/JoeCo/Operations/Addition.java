package joeco.operations;

import joeco.utils.Strategy;

public class Addition implements Strategy {
    @Override
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

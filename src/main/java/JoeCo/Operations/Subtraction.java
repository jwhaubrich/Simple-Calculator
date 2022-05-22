package joeco.operations;

import joeco.utils.Strategy;

public class Subtraction implements Strategy {
    @Override
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}

package JoeCo.Operations;

import JoeCo.Operations.OperatorTemplate;

public class Subtraction extends OperatorTemplate {
    private static int firstNumber;
    private static int secondNumber;

    public Subtraction(int a, int b) {
        super(a, b);
        firstNumber = a;
        secondNumber = b;
    }

    public int performSubtraction(){
        int result;
        result = firstNumber - secondNumber;
        return result;
    }
}

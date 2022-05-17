package joeco.operations;

public class Subtraction extends OperatorTemplate {
    public Subtraction(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    public int performSubtraction(){
        return firstNumber - secondNumber;
    }
}

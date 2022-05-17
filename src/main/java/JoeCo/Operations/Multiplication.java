package joeco.operations;

public class Multiplication extends OperatorTemplate{

    public Multiplication(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    public int performMultiplication(){
        return firstNumber * secondNumber;
    }
}

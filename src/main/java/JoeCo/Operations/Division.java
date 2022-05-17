package joeco.operations;

public class Division extends OperatorTemplate{

    public Division(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    public int performDivision(){
        return firstNumber / secondNumber;
    }
}

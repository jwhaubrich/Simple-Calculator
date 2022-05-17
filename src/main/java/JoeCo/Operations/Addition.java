package joeco.operations;

public class Addition extends OperatorTemplate{

    public Addition(int firstNumber, int secondNumber) {
        super(firstNumber, secondNumber);
    }

    public int performAddition(){
        return firstNumber + secondNumber;
    }


}

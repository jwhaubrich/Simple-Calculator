package JoeCo.Operations;

public class Addition extends OperatorTemplate{
    private static int firstNumber;
    private static int secondNumber;

    public Addition(int a, int b) {
        super(a, b);
        firstNumber = a;
        secondNumber = b;
    }

    public int performAddition(){
        int result;
        result = firstNumber + secondNumber;
        return result;
    }
}

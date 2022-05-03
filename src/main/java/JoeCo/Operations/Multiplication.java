package JoeCo.Operations;

public class Multiplication extends OperatorTemplate{
    private static int firstNumber;
    private static int secondNumber;

    public Multiplication(int a, int b) {
        super(a, b);
        firstNumber = a;
        secondNumber = b;
    }

    public int performMultiplication(){
        int result;
        result = firstNumber * secondNumber;
        return result;
    }
}

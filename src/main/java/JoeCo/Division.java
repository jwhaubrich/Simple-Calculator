package JoeCo;

public class Division extends OperatorTemplate{
    private static int firstNumber;
    private static int secondNumber;

    public Division(int a, int b) {
        super(a, b);
        firstNumber = a;
        secondNumber = b;
    }

    public int performDivision(){
        int result = 0;
        result = firstNumber / secondNumber;
        return result;
    }
}

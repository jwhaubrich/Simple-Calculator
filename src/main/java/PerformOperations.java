public class PerformOperations {

    public static int addFunction(int number1, int number2){
        int result;
        result = number1 + number2;
        return result;
    }

    public static int subtractFunction(int number1, int number2){
        int result;
        result = number1 - number2;
        return result;
    }

    public static int multiplyFunction(int number1, int number2){
        int result;
        result = number1 * number2;
        return result;
    }

    public static void divideFunction(int number1, int number2){
        int result = 0;

        try{
            result = number1/number2;
        }
        catch(ArithmeticException e){
            System.out.println("You tried to divide by 0, which is not a number.");
            System.out.println("Don't divide by 0.\n");
            return;
        }
        System.out.println("The division of " + number1 + " by " + number2+ " is: " + result);
    }
}

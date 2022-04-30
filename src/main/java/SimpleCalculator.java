import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        int continueCalculatorOperation = 1;
        Scanner input = new Scanner(System.in);
        String operation;

        System.out.println("*****Simple Calculator***** \n");

        while (continueCalculatorOperation == 1) {
            System.out.println("What operation do you want to perform? (add, subtract, divide, multiply): ");
            operation = input.nextLine().toUpperCase(Locale.ROOT);

            if (operation.contains("ADD") || operation.contains("SUBTRACT") || operation.contains("DIVIDE") || operation.contains("MULTIPLY")) {

                System.out.println("Enter first number: ");
                firstNumber = getNumbers();

                System.out.println("Please enter second number: ");
                secondNumber = getNumbers();

                performOperations(operation, firstNumber, secondNumber);

            } else {
                System.out.println("\n***Warning***");
                System.out.println("You didn't enter one of the listed operations.");
                System.out.println("Please enter one of the listed operations next time.\n");
            }

            System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
            continueCalculatorOperation = Integer.parseInt(input.nextLine());
        }
        System.out.println("You have exited the calculator.");
    }

    public static void performOperations(String myOperation, int myFirstNumber, int mySecondNumber){

        switch (myOperation) {
            case "ADD":
                System.out.println("The addition of " + myFirstNumber + " and " + mySecondNumber + " is: " + addFunction(myFirstNumber, mySecondNumber) );
                break;
            case "SUBTRACT":
                System.out.println("The subtraction of " + myFirstNumber + " by " + mySecondNumber + " is: " + subtractFunction(myFirstNumber, mySecondNumber));
                break;
            case "MULTIPLY":
                System.out.println("The multiplication of " + myFirstNumber + " by " + mySecondNumber + " is: " + multiplyFunction(myFirstNumber, mySecondNumber));
                break;
            case "DIVIDE":
                divideFunction(myFirstNumber, mySecondNumber);
                break;
        }
    }

    public static int getNumbers()  {
        int numberToUse = 0;
        Scanner input = new Scanner(System.in);

            try{
                numberToUse = Integer.parseInt((input.nextLine()));
            }
            catch(NumberFormatException e){
                System.out.println("Type a number next time.");
            }

        return numberToUse;
    }

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

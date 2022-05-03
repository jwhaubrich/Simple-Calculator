package JoeCo;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator.startContinueProgram();
    }

    public static void startContinueProgram(){
        int continueProgram = 1;
        Scanner input = new Scanner(System.in);
        String operation = "";
        UserInput newInput = new UserInput();

        while (continueProgram == 1) {
            operation = newInput.getOperator();
            newInput.checkOperation(operation);
            continueProgram = newInput.continueCheck();
        }
        System.out.println("You have exited the calculator.");
    }


    public static void performOperations(String myOperation, int myFirstNumber, int mySecondNumber){

        switch (myOperation) {
            case "ADD":
                Addition exeAdd = new Addition(myFirstNumber, mySecondNumber);
                System.out.println("The addition of " + myFirstNumber + " and " + mySecondNumber + " is: " + exeAdd.performAddition());
                break;
            case "SUBTRACT":
                Subtraction exeSubtraction = new Subtraction(myFirstNumber, mySecondNumber);
                System.out.println("The subtraction of " + myFirstNumber + " by " + mySecondNumber + " is: " + exeSubtraction.performSubtraction());
                break;
            case "MULTIPLY":
                Multiplication exeMultiplication = new Multiplication(myFirstNumber, mySecondNumber);
                System.out.println("The multiplication of " + myFirstNumber + " by " + mySecondNumber + " is: " + exeMultiplication.performMultiplication());
                break;
            case "DIVIDE":
                Division exeDivision = new Division(myFirstNumber, mySecondNumber);
                System.out.println("The division of " + myFirstNumber + " by " + mySecondNumber+ " is: " + exeDivision.performDivision());
                break;
        }
    }

}

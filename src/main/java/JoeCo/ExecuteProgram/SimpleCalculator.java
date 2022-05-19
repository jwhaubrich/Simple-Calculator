package joeco.executeprogram;
import joeco.operations.*;
import joeco.userinteraction.UserInput;


public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator.startContinueProgram();
    }

    public static void startContinueProgram(){
        int continueProgram = 1;
        String operation;
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
                displayAnswer(exeAdd.performAddition());
                break;
            case "SUBTRACT":
                Subtraction exeSubtraction = new Subtraction(myFirstNumber, mySecondNumber);
                displayAnswer(exeSubtraction.performSubtraction());
                break;
            case "MULTIPLY":
                Multiplication exeMultiplication = new Multiplication(myFirstNumber, mySecondNumber);
                displayAnswer(exeMultiplication.performMultiplication());
                break;
            case "DIVIDE":
                Division exeDivision = new Division(myFirstNumber, mySecondNumber);
                displayAnswer(exeDivision.performDivision());
                break;
            default:
                break;
        }
    }

    public static void displayAnswer(int calculationResult){
        System.out.println("The answer is: "+ calculationResult);
    }

}

package joeco.executeprogram;
import joeco.operations.*;
import joeco.userinteraction.UserInput;
import joeco.utils.Context;
import joeco.utils.OperationHashMap;


public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator.startContinueProgram();
    }

    public static void startContinueProgram(){
        int continueProgram = 1;
        OperationHashMap.mapStringToOperation();
        String operation;
        UserInput newInput = new UserInput();

        while (continueProgram == 1) {
            operation = newInput.getOperator();
            newInput.checkOperation(operation);
            continueProgram = newInput.continueCheck();
        }
        System.out.println("You have exited the calculator.");
    }


    public static void performOperations(Strategy newStrategy, int firstNumber, int secondNumber){
        int answer = 0;
        Context newContext = new Context();

        newContext.setStrategy(newStrategy);
        answer = newContext.executeStrategy(firstNumber, secondNumber);

        displayAnswer(answer);
    }

    public static void displayAnswer(int calculationResult){
        System.out.println("The answer is: "+ calculationResult);
    }

}

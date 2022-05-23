package joeco.executeprogram;
import joeco.userinteraction.UserInput;
import joeco.utils.Context;
import joeco.utils.OperationHashMap;
import joeco.utils.Strategy;

public class SimpleCalculator {
    private static UserInput newInput = new UserInput();

    public static void main(String[] args) {
        SimpleCalculator.startAndContinueProgram();
    }

    private static void startAndContinueProgram(){
        int continueProgram;
        String operation;
        OperationHashMap.mapStringToOperation();

        do {
            operation = newInput.getOperator();
            newInput.checkOperation(operation);
            continueProgram = newInput.continueCheck();
        }while(continueProgram ==1);

        System.out.println("You have exited the calculator.");
    }

    public static void performOperations(Strategy newStrategy, int firstNumber, int secondNumber){
        int answer;
        Context newContext = new Context();

        newContext.setStrategy(newStrategy);
        answer = newContext.executeStrategy(firstNumber, secondNumber);

        displayAnswer(answer);
    }

    private static void displayAnswer(int calculationResult){
        System.out.println("The answer is: "+ calculationResult);
    }

}

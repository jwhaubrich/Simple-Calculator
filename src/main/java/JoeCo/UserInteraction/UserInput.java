package joeco.userinteraction;

import joeco.executeprogram.SimpleCalculator;
import joeco.operations.Strategy;
import joeco.utils.Constants;
import joeco.utils.OperationHashMap;
import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    private final Scanner input = new Scanner(System.in);

    public String getOperator(){
        String operator;

        System.out.println("Select an operation: add, subtract, divide, multiply ");
        operator = input.nextLine().toUpperCase(Locale.ROOT);

        return operator;
    }

    private int receiveNumbersFromUser(){
            int numberToUse = 0;

            try{
                numberToUse = Integer.parseInt((input.nextLine()));
            }
            catch(NumberFormatException e){
                System.out.println("Type a number next time.");
            }

            return numberToUse;
    }

    public void checkOperation(String operation){
        int firstNumber;
        int secondNumber;
        Strategy newStrategy;

        if(Constants.OPERATIONS_LIST.contains(operation)) {

            System.out.println("Enter first number: ");
            firstNumber = receiveNumbersFromUser();

            System.out.println("Please enter second number: ");
            secondNumber = receiveNumbersFromUser();

            if(secondNumber == 0 && operation.contains("DIVIDE")) {
                throw new ArithmeticException("Cannot divide by 0");
            }

            newStrategy = OperationHashMap.operationMap.get(operation);
            SimpleCalculator.performOperations(newStrategy, firstNumber, secondNumber);
        }
        else {
            System.out.println("\n***Warning***");
            System.out.println("You didn't enter one of the listed operations.");
            System.out.println("Please enter one of the listed operations next time.\n");
        }
    }

    public int continueCheck(){
        System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
        return Integer.parseInt(input.nextLine());
    }
}

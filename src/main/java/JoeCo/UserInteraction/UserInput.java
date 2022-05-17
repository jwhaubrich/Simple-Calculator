package joeco.userinteraction;

import joeco.executeprogram.SimpleCalculator;
import joeco.utils.Constants;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public String getOperator(){
        String operator;

        System.out.println("Select an operation: add, subtract, divide, multiply ");
        operator = input.nextLine().toUpperCase(Locale.ROOT);

        return operator;
    }

    public int receiveNumbersFromUser(){
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

        if(Constants.OPERATIONS_LIST.contains(operation)) {

            System.out.println("Enter first number: ");
            firstNumber = receiveNumbersFromUser();

            System.out.println("Please enter second number: ");
            secondNumber = receiveNumbersFromUser();

            if(secondNumber == 0 && operation.contains("DIVIDE")) {
                System.out.println("Can't divide by 0");
                return;
            }

            SimpleCalculator.performOperations(operation, firstNumber, secondNumber);
        } else

        {
            System.out.println("\n***Warning***");
            System.out.println("You didn't enter one of the listed operations.");
            System.out.println("Please enter one of the listed operations next time.\n");
        }
    }

    public int continueCheck(){
        int continueCalculatorOperation = 1;

        System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
        continueCalculatorOperation = Integer.parseInt(input.nextLine());

        return continueCalculatorOperation;
    }
}

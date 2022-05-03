package JoeCo;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public String getOperator(){
        String operator;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an operation: add, subtract, divide, multiply ");
        operator = input.nextLine().toUpperCase(Locale.ROOT);

        return operator;
    }

    public int receiveNumbersFromUser(){
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

    public void checkOperation(String operation){
        int firstNumber, secondNumber;

        if(operation.contains("ADD")||operation.contains("SUBTRACT")||operation.contains("DIVIDE")||operation.contains("MULTIPLY")) {

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

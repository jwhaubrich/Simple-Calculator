package JoeCo;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator.getOperationFromUser();
    }

    public static void continueProgramCheck(){
        int continueCalculatorOperation = 1;
        Scanner input = new Scanner(System.in);
        String operation;
        UserInput newInput = new UserInput();

        while (continueCalculatorOperation == 1) {


            SimpleCalculator.checkOperation(operation);

            System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
            continueCalculatorOperation = Integer.parseInt(input.nextLine());
        }
        System.out.println("You have exited the calculator.");
    }
    public static void getOperationFromUser(){

    }

    public static void checkOperation(String operation){
        int firstNumber, secondNumber;

        if(operation.contains("ADD")||operation.contains("SUBTRACT")||operation.contains("DIVIDE")||operation.contains("MULTIPLY")) {

            System.out.println("Enter first number: ");
            firstNumber = SimpleCalculator.getNumbers();

            System.out.println("Please enter second number: ");
            secondNumber = SimpleCalculator.getNumbers();

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

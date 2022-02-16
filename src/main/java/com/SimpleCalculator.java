//finished this project with 28 minutes left
package src.main.java.com;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int continueCalculatorCheck = 1;
        String operation;
        Scanner input = new Scanner(System.in);

        System.out.println("*****Welcome to the Simple Calculator Application***** \n");

        while (continueCalculatorCheck == 1) {
            System.out.println("What operation you want to perform? (add, subtract, divide, multiply): ");
            operation = input.nextLine().toUpperCase(Locale.ROOT); //forces all the input to change to UPPERCASE

            //below if ensures that user has entered in one of the provided operations
            if (operation.contains("ADD") || operation.contains("SUBTRACT") || operation.contains("DIVIDE") || operation.contains("MULTIPLY")) {

                try {
                    System.out.println("Please enter first number: ");
                    if ((!input.hasNextInt())) {
                        throw new NotAValidNumberException();
                    } else {
                        firstNumber = Integer.parseInt((input.nextLine()));
                    }
                } catch (NotAValidNumberException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Program Finished.");
                    break;
                }

                    try {
                        System.out.println("Please enter second number: ");
                        if ((!input.hasNextInt())) {
                            throw new NotAValidNumberException();
                        } else {
                            secondNumber = Integer.parseInt((input.nextLine()));
                        }
                    } catch (NotAValidNumberException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Program Finished.");
                        break;
                    }


                switch (operation) {
                    case "ADD":
                        addFunction(firstNumber, secondNumber);
                        break;
                    case "SUBTRACT":
                        subtractFunction(firstNumber, secondNumber);
                        break;
                    case "MULTIPLY":
                        multiplyFunction(firstNumber, secondNumber);
                        break;
                    case "DIVIDE":
                        divideFunction(firstNumber, secondNumber);
                        break;
                }
            } else { //if not one of the provided operations then print this out
                System.out.println("\n***Warning***");
                System.out.println("You didn't enter one of the listed operations.");
                System.out.println("Please enter one of the listed operations next time.\n");
            }

            System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
            continueCalculatorCheck = Integer.parseInt(input.nextLine());
        }
        System.out.println("You have exited the calculator.");
    }


    public static void addFunction(int number1, int number2){
        int result;
        result = number1 + number2;
        System.out.println("The addition of " + number1 + " and " + number2 + " is: ");
        System.out.println(result);
    }

    public static void subtractFunction(int number1, int number2){
        int result;
        result = number1 - number2;
        System.out.println("The subtraction of " + number1 + " by " + number2 + " is: ");
        System.out.println(result);
    }

    public static void multiplyFunction(int number1, int number2){
        int result;
        result = number1 * number2;
        System.out.println("The multiplication of " + number1 + " by " + number2 + " is: ");
        System.out.println(result);
    }

    public static void divideFunction(int number1, int number2){
        int result;

        try{
            result = number1/number2;
        }
        catch(ArithmeticException e){
            System.out.println("You tried to divide by 0, which is not a number.");
            System.out.println("Don't divide by 0.\n");
            return;
        }
        System.out.println("The division of " + number1 + " by " + number2 + " is: ");
        System.out.println(result);
    }
}

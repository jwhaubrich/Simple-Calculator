//finished this project with 28 minutes left
package src.main.java.com;
        
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int firstNumber = 0;
    int secondNumber = 0;
    int tracker = 1;
    int result;

    String operation;

    Scanner input = new Scanner(System.in);

        System.out.println("*****Welcome to the Simple Calculator Application***** \n");

        /*
        Exceptions to look out for:
        1. If user enters a letter
        2. If user tries to divide by 0
         */

        while(tracker == 1){
            System.out.println("What operation you want to perform? (add, subtract, divide, multiply): ");
            /* Exceptions to look for:
                1. if they don't enter in one of these operations: enter numbers, enter other words or enter letter
                    - CREATED PROTECTION
                */
            operation = input.nextLine().toUpperCase(Locale.ROOT); //forces all the input to change to UPPERCASE

            //below if ensures that user has entered in one of the provided operations
            if(operation.contains("ADD") || operation.contains("SUBTRACT")|| operation.contains("DIVIDE")|| operation.contains("MULTIPLY")) {
                switch (operation) {
                    case "ADD":
                        System.out.println("First number to add: ");
                        try { // taking the number as a String and parsing it as an Integer
                            firstNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("You didn't enter a number. Please enter a number next time. ");
                        }
                        System.out.println("Second number to add: ");
                        try {
                            secondNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("Please enter a number next time.");
                        }
                        result = firstNumber + secondNumber;
                        System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is: ");
                        System.out.println(result);
                        break;
                    case "SUBTRACT":
                        System.out.println("Subtract this number: ");
                        try { // taking the number as a String and parsing it as an Integer
                            firstNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("You didn't enter a number. Please enter a number next time. ");
                        }
                        System.out.println("From this number: ");
                        try {
                            secondNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("Please enter a number next time.");
                        }
                        result = secondNumber - firstNumber;
                        System.out.println("Subtracting " + firstNumber + " from " + secondNumber + " is: ");
                        System.out.println(result);
                        break;
                    case "MULTIPLY":
                        System.out.println("Multiply this number: ");
                        try { // taking the number as a String and parsing it as an Integer
                            firstNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("You didn't enter a number. Please enter a number next time. ");
                        }
                        System.out.println("By this number: ");
                        try {
                            secondNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("Please enter a number next time.");
                        }
                        result = secondNumber * firstNumber;
                        System.out.println("The number: " + firstNumber + " multiplied by " + secondNumber + " is: ");
                        System.out.println(result);
                        break;
                    case "DIVIDE":
                        System.out.println("Divide this number: ");
                        try { // taking the number as a String and parsing it as an Integer
                            firstNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("You didn't enter a number. Please enter a number next time. ");
                        }
                        System.out.println("By this number: ");
                        try {
                            secondNumber = Integer.parseInt(input.nextLine());
                        } catch (Exception e) {
                            System.out.println("Please enter a number next time.");
                        }

                        try{
                            result = firstNumber/secondNumber;
                        }
                        catch(ArithmeticException e){
                            System.out.println("You tried to divide by 0, which is not a number.");
                            System.out.println("Don't divide by 0.\n");
                            break;
                    }
                        System.out.println("The number: " + firstNumber + " divided by " + secondNumber + " is: ");
                        System.out.println(result);
                        break;
                }
            }
            else{ //if not one of the provided operations then print this out
                System.out.println("*Warning*: You didn't enter one of the listed operations.");
                System.out.println("Please enter one of the listed operations next time.\n");
                }

            System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
            tracker = Integer.parseInt(input.nextLine());
        }
        System.out.println("Program Finished");
    }
}

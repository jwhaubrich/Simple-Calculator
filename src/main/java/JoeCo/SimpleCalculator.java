package JoeCo;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int continueCalculatorOperation = 1;
        Scanner input = new Scanner(System.in);
        String operation;

        while (continueCalculatorOperation == 1) {
            System.out.println("Select an operation: add, subtract, divide, multiply ");
            operation = input.nextLine().toUpperCase(Locale.ROOT);

            OperationCheck.checkOperation(operation);

            System.out.println("Do you wish to continue? Enter 1 for yes, 2 for no: ");
            continueCalculatorOperation = Integer.parseInt(input.nextLine());
        }
        System.out.println("You have exited the calculator.");
    }
}

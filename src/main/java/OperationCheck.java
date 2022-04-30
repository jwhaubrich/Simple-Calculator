public class OperationCheck {

    public static void checkOperation(String operation){
        int firstNumber, secondNumber;

        if(operation.contains("ADD")||operation.contains("SUBTRACT")||operation.contains("DIVIDE")||operation.contains("MULTIPLY")) {

            System.out.println("Enter first number: ");
            firstNumber = NumberVerification.getNumbers();

            System.out.println("Please enter second number: ");
            secondNumber = NumberVerification.getNumbers();

            if(secondNumber == 0 && operation.contains("DIVIDE")) {
                System.out.println("Can't divide by 0");
                return;
            }

            DisplayResults.performOperations(operation, firstNumber, secondNumber);
        } else

        {
            System.out.println("\n***Warning***");
            System.out.println("You didn't enter one of the listed operations.");
            System.out.println("Please enter one of the listed operations next time.\n");
        }
    }
}

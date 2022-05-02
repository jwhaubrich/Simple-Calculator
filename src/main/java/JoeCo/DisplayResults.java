package JoeCo;

public class DisplayResults {
    public static void performOperations(String myOperation, int myFirstNumber, int mySecondNumber){

        switch (myOperation) {
            case "ADD":
                System.out.println("The addition of " + myFirstNumber + " and " + mySecondNumber + " is: " + PerformOperations.addFunction(myFirstNumber, mySecondNumber) );
                break;
            case "SUBTRACT":
                System.out.println("The subtraction of " + myFirstNumber + " by " + mySecondNumber + " is: " + PerformOperations.subtractFunction(myFirstNumber, mySecondNumber));
                break;
            case "MULTIPLY":
                System.out.println("The multiplication of " + myFirstNumber + " by " + mySecondNumber + " is: " + PerformOperations.multiplyFunction(myFirstNumber, mySecondNumber));
                break;
            case "DIVIDE":
                System.out.println("The division of " + myFirstNumber + " by " + mySecondNumber+ " is: " + PerformOperations.divideFunction(myFirstNumber, mySecondNumber));
                break;
        }
    }
}

## README File for the JoeCo.SimpleCalculator Application

### File Paths and Java Classes:
- src/main/java:
  - JoeCo.SimpleCalculator.java (main executable)
    - contains the main function and prompts the user to type out what operation they want to perform and pushes their entry to uppercase
    - passes the operation to the JoeCo.OperationCheck class to verify their operation
    - asks the user if they wish to continue
    - exits the calculator
  - JoeCo.OperationCheck.java
    - verifies the operation the user entered and warns them if they didn't enter one that was specified
    - prompts the user for the two numbers they want to use in the program
    - error check if they did not enter a number (Number Verification class)
    - performs a divide by 0 check if the user divides by 0
    - passes the operation and two numbers entered by the user to the JoeCo.DisplayResults class
  - JoeCo.NumberVerification.java
    - uses a simple try and catch statement to verify that the user entered numbers and not, for example, letters
  - JoeCo.DisplayResults.java
    - uses a switch statement to switch between code that should be executed
    - depending on the operation, the code will be different
    - regardless, passes the two numbers entered to the JoeCo.PerformOperations class
  - JoeCo.PerformOperations.class
    - takes in the two numbers entered by the user and performs the specified operations
    - returns the resulting number
  
- src/test/java:
  - JoeCo.SimpleCalculatorTest.java
    - contains four test statements that test the add, subtract, multiply, and divide operations found inside the JoeCo.PerformOperations class

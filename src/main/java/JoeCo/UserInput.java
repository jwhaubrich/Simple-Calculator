package JoeCo;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    public String getOperator(){
        String operator;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an operation: add, subtract, divide, multiply ");
        operator = input.nextLine().toUpperCase(Locale.ROOT);

        return operator;
    }
}

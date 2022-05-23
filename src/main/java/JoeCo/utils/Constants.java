package joeco.utils;

import joeco.operations.Addition;
import joeco.operations.Division;
import joeco.operations.Multiplication;
import joeco.operations.Subtraction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Constants {
    public static final List<String> OPERATIONS_LIST = Arrays.asList("ADD", "SUBTRACT", "DIVIDE", "MULTIPLY");
    public static final HashMap<String, Strategy> operationMap = new HashMap<>();

    public static void mapStringToOperation(){
        operationMap.put("ADD",new Addition());
        operationMap.put("SUBTRACT",new Subtraction());
        operationMap.put("MULTIPLY",new Multiplication());
        operationMap.put("DIVIDE",new Division());
    }

    private Constants() {
    }
}

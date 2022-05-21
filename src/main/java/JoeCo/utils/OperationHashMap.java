package joeco.utils;

import joeco.operations.*;

import java.util.HashMap;

public class OperationHashMap {
    public static HashMap<String, Strategy> operationMap = new HashMap<>();

    public static void mapStringToOperation(){
        operationMap.put("ADD",new Addition());
        operationMap.put("SUBTRACT",new Subtraction());
        operationMap.put("MULTIPLY",new Multiplication());
        operationMap.put("DIVIDE",new Division());
    }

}
